#include <iostream>

using namespace std;

int main(){

    int i = 0;
    int opcao;
    string null = "";
    string nome[100];
    string data[100];
    string hora[100];
    bool concluida[100];

    do{

        cout << "\n*******    Menu    ********\n";
        cout << "** (1) Criar Tarefa      **\n";
        cout << "** (2) Tarefas Salvas    **\n";
        cout << "** (3) Excluir Tarefa    **\n";
        cout << "** (4) Marcar Como Salva **\n";
        cout << "** (5) Sobre             **\n";
        cout << "** (0) Sair              **\n";
        cout << "**    Digite uma opcao   **\n";
        cout << "***************************\n";
        cin >> opcao;

       switch(opcao){
        case 1:
            for(i = 0; i < 100;){
                if(nome[i] == null){
                    cout << "\nDigite a tarefa: ";
                    cin >> nome[i];
                    cout << "Digite a data (dia/mes/ano): ";
                    cin >> data[i];
                    cout << "Digite a hora (hora/minuto): ";
                    cin >> hora[i];
                    concluida[i] = false;

                    break;
                }
                else{
                    i++;
                }
            }
            break;
        case 2:
            cout << "\n********************************************************************************";
            for(i = 0; i < 100; i++){
                if(nome[i] != null){
                    cout << "\nTarefa de numero ";
                    cout << i;
                    cout << "\nTarefa: ";
                    cout << nome[i];
                    cout << "\nData: ";
                    cout << data[i];
                    cout << "\nHora: ";
                    cout << hora[i];
                    if(concluida[i] == false){
                        cout << "\nSituacao: Tarefa nao concluida\n";
                        cout << "\n********************************************************************************";
                    }
                    else{
                        cout << "\n Situacao: Tarefa concluida\n";
                        cout << "\n********************************************************************************";
                    }
                }
                else{
                    cout << "\nNao existem mais tarefas salvas.\n\n";
                    break;
                }
            }
            break;
        case 3:
            cout << "\n********************************************************************************";
            for(i = 0; i < 100; i++){
                if(nome[i] != null){
                    cout << "\nTarefa de numero ";
                    cout << i;
                    cout << "\nTarefa: ";
                    cout << nome[i];
                    cout << "\nData: ";
                    cout << data[i];
                    cout << "\nHora: ";
                    cout << hora[i];
                    if(concluida[i] == false){
                        cout << "\nSituacao: Tarefa nao concluida\n";
                        cout << "\n********************************************************************************";
                    }
                    else{
                        cout << "\n Situacao: Tarefa concluida\n";
                        cout << "\n********************************************************************************";
                    }
                }
                else{
                    cout << "\nNao existem mais tarefas salvas.\n\n";
                    break;
                }
            }

            int numero;
            int numeroTarefa;
            cout << "Digite o numero da tarefa que deseja excluir: ";
            cin >> numeroTarefa;

            for(numero = numeroTarefa; numero < 100; numero++){
                if(nome[numero] != null){
                    nome[numero] = nome[numero + 1];
                    data[numero] = data[numero + 1];
                    hora[numero] = hora[numero + 1];
                    concluida[numero] = concluida[numero + 1];
                }
                else{
                    cout << "\n\nTarefa de numero ";
                    cout << numeroTarefa;
                    cout << " excluida com sucesso.\n";
                    break;
                }
            }
            break;
        case 4:

            cout << "\n********************************************************************************";
            for(i = 0; i < 100; i++){
                if(nome[i] != null){
                    cout << "\nTarefa de numero ";
                    cout << i;
                    cout << "\nTarefa: ";
                    cout << nome[i];
                    cout << "\nData: ";
                    cout << data[i];
                    cout << "\nHora: ";
                    cout << hora[i];
                    if(concluida[i] == false){
                        cout << "\nSituacao: Tarefa nao concluida\n";
                        cout << "\n********************************************************************************";
                    }
                    else{
                        cout << "\n Situacao: Tarefa concluida\n";
                        cout << "\n********************************************************************************";
                    }
                }
                else{
                    cout << "\nNao existem mais tarefas salvas.\n";
                    break;
                }
            }

                int j;
                cout << "\n\nDigite o numero da tarefa que deseja marcar como salva: ";
                cin >> j;

                nome[j] = nome[j];
                data[j] = data[j];
                hora[j] = hora[j];
                concluida[j] = true;

                cout << "\n\nTarefa de numero ";
                cout << i;
                cout << " foi marcada como concluida.\n";

            break;

        case 5:
            cout << "\n************  Sobre   *************\n";
            cout << "** Desenvolvedor: Yadson Matheus **\n";
            cout << "** Contato: yadson20@gmail.com   **\n";
            cout << "** Versao: 1.0                   **\n";
            cout << "** Corporacao: YZ Inc            **\n";
            cout << "***********************************\n";

            break;
       }

    }
    while(opcao != 0);

    return 0;

}
