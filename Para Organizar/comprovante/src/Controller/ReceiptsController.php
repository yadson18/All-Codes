<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Receipts Controller
 *
 * @property \App\Model\Table\ReceiptsTable $Receipts
 */
class ReceiptsController extends AppController
{

    public function initialize(){
        parent::initialize();
        
        // Include the FlashComponent
        $this->loadComponent('Flash');
        
        // Load Files model
        $this->loadModel('Files');
    }
    /**
     * Index method
     *
     * @return \Cake\Network\Response|null
     */
    public function index()
    {
        $receipts;

        $this->paginate = [
            'contain' => ['Users', 'Files']
        ];
        if($this->Auth->user('role') === 'gestor'){
          $receipts = $this->paginate($this->Receipts);
        }
        else{
          $receipts = $this->paginate($this->Receipts->findByUserId($this->Auth->user('id')));
        }

        $this->set(compact('receipts'));
        $this->set('_serialize', ['receipts']);
    }

    /**
     * View method
     *
     * @param string|null $id Receipt id.
     * @return \Cake\Network\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $receipt = $this->Receipts->get($id, [
            'contain' => ['Users', 'Files']
        ]);

        $this->set('receipt', $receipt);
        $this->set('_serialize', ['receipt']);
    }

    /**
     * Add method
     *
     * @return \Cake\Network\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $receipt = $this->Receipts->newEntity();
        if ($this->request->is('post')) {
            if(
                !empty($this->request->data['fileOne']['name']) && 
                !empty($this->request->data['fileTwo']['name'])
              )
            {
                $receipt = $this->Receipts->patchEntity($receipt, $this->request->getData());
                $receipt->user_id = $this->Auth->user('id');
                 $receipt->aproved = 0;
                $this->Receipts->save($receipt);

                $data = '';
                foreach ($this->request->data['payment'] as $datas) {
                    $data .= '-' . $datas;
                }

                $uploadPath = 'uploads/files/';

                $username = $this->Auth->user('name');
                $username = str_replace(" ","",$username);
                
                $fileNameOne = $username . $data . '-1.pdf';
                $uploadFileOne = $uploadPath.$fileNameOne;

                $fileNameTwo = $username . $data . '-2.pdf';
                $uploadFileTwo = $uploadPath.$fileNameTwo;

                if(
                    move_uploaded_file($this->request->data['fileOne']['tmp_name'], WWW_ROOT . $uploadFileOne) &&
                    move_uploaded_file($this->request->data['fileTwo']['tmp_name'], WWW_ROOT . $uploadFileTwo)
                  )
                {
                    $fileOne = $this->Files->newEntity();
                    $fileOne->receipt_id = $receipt->id;
                    $fileOne->name = $fileNameOne;
                    $fileOne->src = $uploadPath;

                    $fileTwo = $this->Files->newEntity();
                    $fileTwo->receipt_id = $receipt->id;
                    $fileTwo->name = $fileNameTwo;
                    $fileTwo->src = $uploadPath;

                    $this->Files->save($fileOne);
                    $this->Files->save($fileTwo);

                    $this->Flash->success(__('The receipt has been saved.'));

                    return $this->redirect(['action' => 'index']);
                }
            }
            $this->Flash->error(__('The receipt could not be saved. Please, try again.'));
        }
        $users = $this->Receipts->Users->find('list', ['limit' => 200]);
        $this->set(compact('receipt', 'user', 'file'));
        $this->set('_serialize', ['receipt']);
    }

    /**
     * Edit method
     *
     * @param string|null $id Receipt id.
     * @return \Cake\Network\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Network\Exception\NotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $receipt = $this->Receipts->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $receipt = $this->Receipts->patchEntity($receipt, $this->request->getData());
            if ($this->Receipts->save($receipt)) {
                $this->Flash->success(__('The receipt has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The receipt could not be saved. Please, try again.'));
        }
        $users = $this->Receipts->Users->find('list', ['limit' => 200]);
        $this->set(compact('receipt', 'users'));
        $this->set('_serialize', ['receipt']);
    }

    /**
     * Delete method
     *
     * @param string|null $id Receipt id.
     * @return \Cake\Network\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $receipt = $this->Receipts->get($id);
        if ($this->Receipts->delete($receipt)) {
            $this->Flash->success(__('The receipt has been deleted.'));
        } else {
            $this->Flash->error(__('The receipt could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }

    public function download($fileName = null) 
    { 
        $filePath = WWW_ROOT . 'uploads/files/' . $fileName;
        
        header("Content-type: application/pdf");
        header("Content-Disposition: attachment; filename=" . $filename);
        readfile($filePath);
    }
}
