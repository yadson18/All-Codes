import java.util.*;
public class Menu{
   public static void menu(){
	  Scanner leitor = new Scanner(System.in);
	  Tarefas tarefas = new Tarefas();
	  int opcao;
	  do{
		 System.out.println("\n**** Lista de Tarefas ****");
		 System.out.println("** (1) Cadastrar Tarefa **");
		 System.out.println("** (2) Tarefas Salvas   **");
		 System.out.println("** (3) Modificar Tarefa **");
		 System.out.println("** (4) Excluir tarefa   **");
		 System.out.println("** (0) Sair             **");
		 System.out.println("**************************");
		 System.out.println("**** Digite uma opcão ****");
		 opcao = leitor.nextInt();
		 switch(opcao){
			case 1:
			   CadastrarTarefa.castrarTarefa(tarefas);
			   break;
			case 2:
			   TarefasSalvas.tarefasSalvas(tarefas);
			   break;
			case 3:
			   ModificarTarefa.modificarTarefa(tarefas);
			   break;
			case 4:
			   ExcluirTarefa.excluirTarefa(tarefas);
			   break;
		 }
	  }
	  while(opcao != 0);
   }
}
