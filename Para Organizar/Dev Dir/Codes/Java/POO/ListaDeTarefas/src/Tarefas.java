public class Tarefas{
   private Tarefa tarefas[];
   
   Tarefas(){
	  this.tarefas = new Tarefa[500];
   }
   
   void setTarefa(Tarefa tarefa, int i){
	  this.tarefas[i] = tarefa;
   }
   
   Tarefa getTarefa(int i){
	  return this.tarefas[i];
   }
   
   int getLength(){
	  return this.tarefas.length;
   }
}
