import java.util.*;
public class CadastrarTarefa{
   public static void castrarTarefa(Tarefas tarefas){
	  Scanner leitor = new Scanner(System.in);
	  
	  for(int i = 0; i < tarefas.getLength();){
		 if(tarefas.getTarefa(i) == null){
	        System.out.println("\nDigite o nome da tarefa:");
	        String tarefa = leitor.next();
	        System.out.println("\nDigite o dia, o mes e o ano, ex: 10 11 2018 :");
	        int dia = leitor.nextInt();
	        int mes = leitor.nextInt();
	        int ano = leitor.nextInt();
	        System.out.println("\nDigite a hora e o minuto, exemplo: 22 30 :");
	        int hora = leitor.nextInt();
	        int minuto = leitor.nextInt();
	        Tarefa criarTarefa = new Tarefa(tarefa, ano, mes, dia, hora, minuto);
			tarefas.setTarefa(criarTarefa, i);
			break;
		 }
		 else{
			i++;
		 }
	  }
   }
}
