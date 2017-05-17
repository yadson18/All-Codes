public class TarefasSalvas{
   public static void tarefasSalvas(Tarefas tarefas){
	  for(int i = 0; i < tarefas.getLength();){
		 if(tarefas.getTarefa(i) != null){
			System.out.println("\nTarefa de número " + (i+1) + ":");
			System.out.println(tarefas.getTarefa(i).toString());
			i++;
		 }
		 else{
			break;
		 }
	  }
   }
}
