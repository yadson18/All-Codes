<?php
/**
  * @var \App\View\AppView $this
  */
?>
<nav class="large-3 medium-4 columns" id="actions-sidebar">
    <ul class="side-nav">
        <li class="heading"><?= __('Actions') ?></li>
        <li><?= $this->Html->link(__('New Receipt'), ['action' => 'add']) ?></li>
        <li><?= $this->Html->link(__('Logout'), ['action' => '../users/logout']) ?></li>
    </ul>
</nav>
<div class="receipts view large-9 medium-8 columns content">
    <h3><?= __('Receipts') ?></h3>
    <table cellpadding="0" cellspacing="0">
        <thead>
            <tr>
                <th scope="col"><?= $this->Paginator->sort('siape') ?></th>
                <th scope="col"><?= $this->Paginator->sort('name') ?></th>
                <th scope="col"><?= $this->Paginator->sort('payment') ?></th>
                <th scope="col"><?= $this->Paginator->sort('send') ?></th>
                <th scope="col"><?= $this->Paginator->sort('fileOne') ?></th>
                <th scope="col"><?= $this->Paginator->sort('fileTwo') ?></th>
                <th scope="col"><?= $this->Paginator->sort('aproved') ?></th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($receipts as $receipt): ?>
            <tr>
                <td><?= h($receipt->user->username) ?></td>
                <td><?= h($receipt->user->name) ?></td>
                <td><?= h($receipt->payment) ?></td>
                <td><?= h($receipt->send) ?></td>
                <?php foreach ($receipt->files as $file): ?>
                    <td>
                        <?= $this->Form->postLink(
                                $this->Html->image('/img/pdf.png', ['alt' => __('View Pdf')]),
                                ['action' => '../uploads/files/', $file['name']],
                                ['escape' => false, 'target' => '_blank']);   
                        ?>
                        <?= $this->Form->postLink(
                                $this->Html->image('/img/download.png', ['alt' => __('Download Pdf')]),
                                ['action' => 'download', $file['name']],
                                ['escape' => false]);    
                        ?>
                    </td> 
                <?php endforeach; ?>
                <td>
                    <!-- 0 is true -->
                    <?php 
                        if($receipt->aproved === true){
                            if(strcmp($receipt->user->role, "servidor") == 0){
                                echo "<a href='#' class='fa fa-check-circle-o' aria-hidden='true'> Aproved</a>";
                            }
                            else{
                                echo "<a href='example.ctp' class='fa fa-check-circle-o' aria-hidden='true'> Aproved</a>";
                            }
                        }
                        else{
                            if(strcmp($receipt->user->role, "servidor") == 0){
                                echo "<a href='#' class='fa fa-times-circle-o' aria-hidden='true'> Not aproved</a>";
                            }
                            else{
                                echo "<a href='example.ctp' class='fa fa-times-circle-o' aria-hidden='true'> Aprove</a>";
                            }
                        }
                    ?>
                </td>
                <?php 
                    /*<td class="actions">
                        <?= $this->Html->link(__('Edit'), ['action' => 'edit', $receipt->id]) ?>
                        <?= $this->Form->postLink(__('Delete'), ['action' => 'delete', $receipt->id], ['confirm' => __('Are you sure you want to delete # {0}?', $receipt->id)]) ?>
                    </td>*/
                ?>
            </tr>
            <?php endforeach; ?>
        </tbody>
    </table>
    <div class="paginator">
        <ul class="pagination">
            <?= $this->Paginator->first('<< ' . __('first')) ?>
            <?= $this->Paginator->prev('< ' . __('previous')) ?>
            <?= $this->Paginator->numbers() ?>
            <?= $this->Paginator->next(__('next') . ' >') ?>
            <?= $this->Paginator->last(__('last') . ' >>') ?>
        </ul>
        <p><?= $this->Paginator->counter(['format' => __('Page {{page}} of {{pages}}, showing {{current}} record(s) out of {{count}} total')]) ?></p>
    </div>
</div>
