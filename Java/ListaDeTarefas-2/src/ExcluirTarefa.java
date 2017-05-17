import java.util.*;
public class ExcluirTarefa{
   public static void excluirTarefa(Tarefas tarefas){
	  Scanner leitor = new Scanner(System.in);
	  
	  TarefasSalvas.tarefasSalvas(tarefas);
	  
	  System.out.println("\nDigite o número da tarefa que deseja excluir:");
	  int indice = leitor.nextInt();
	  
	  for(int i = (indice - 1); i < (tarefas.getLength() - indice); i++){
		 if(tarefas.getTarefa(i) != null){
			tarefas.setTarefa(tarefas.getTarefa(i+1), i);
		 }
		 else{
			break;
		 }
	  }
	  
   }
}
