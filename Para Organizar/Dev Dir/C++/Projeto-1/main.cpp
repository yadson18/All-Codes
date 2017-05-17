#include <iostream>
using namespace std;
int main(){
  int opcao;
    
  do{
    cout << "\n******************\n";
    cout << "****   Menu   ****\n";
    cout << "** (1) opt1     **\n";
    cout << "** (2) opt2     **\n";
    cout << "** (0) Sair     **\n";
    cout << "******************\n";
    cout << "* Digite a opcao *\n";
    cin >> opcao;
        
    switch(opcao){
        case 1:
            cout << "\nOpt 1";
          break;
        case 2:
            cout << "\nOpt 2";
          break;
    }
  }
  while(opcao != 0);

  return 0;
}
