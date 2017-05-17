import java.util.*;

public class ModificarTarefa{
   public static void modificarTarefa(Tarefas tarefas){
	  Scanner leitor = new Scanner(System.in);
	  
	  TarefasSalvas.tarefasSalvas(tarefas);
	  System.out.println("\nDigite o número da tarefa que deseja modificar:");
	  int i = leitor.nextInt();
	  while(i < 1 | i > tarefas.getLength()){
		 System.out.println("\nOpção inválida, digite novamente o número da tarefa:");
	     i = leitor.nextInt();
	  }
	  
	  System.out.println("\nDigite o nome da tarefa:");
	  String tarefa = leitor.next();
	  System.out.println("\nDigite o dia, o mes e o ano, ex: 10 11 2018 :");
	  int dia = leitor.nextInt();
	  int mes = leitor.nextInt();
	  int ano = leitor.nextInt();
	  System.out.println("\nDigite a hora e o minuto, exemplo: 22 30 :");
	  int hora = leitor.nextInt();
	  int minuto = leitor.nextInt();
	  System.out.println("Informe se a tarefa foi concluída, (S/N):");
	  char tarefaConcluida = leitor.next().charAt(0);
	  tarefas.getTarefa(i-1).setTarefa(tarefa);
	  tarefas.getTarefa(i-1).setTime(ano, mes, dia, hora, minuto);
	  tarefas.getTarefa(i-1).setTarefaConcluida(tarefaConcluida);
   }
}
