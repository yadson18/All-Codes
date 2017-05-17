
import java.util.*;
public class Tarefa{
   private String tarefa;
   private Calendar calendario = Calendar.getInstance();
   private boolean tarefaConcluida;
   
   Tarefa(String tarefa, int ano, int mes, int dia, int hora, int minuto){
	  this.tarefa = tarefa;
	  this.calendario.set(ano, mes, dia, hora, minuto);
	  this.tarefaConcluida = false;
   }
   
   void setTarefa(String tarefa){
	  this.tarefa = tarefa;
   }
   void setTime(int ano, int mes, int dia, int hora, int minuto){
      this.calendario.set(ano, mes, dia, hora, minuto);
   }
   void setTarefaConcluida(char tarefaC){
	  if(tarefaC == 'S' | tarefaC == 's'){
		 this.tarefaConcluida = true;
	  }
      else{
		 this.tarefaConcluida = false;
	  }
   }
   
   String getTarefa(){
	  return this.tarefa;
   }
   String getDate(){
	  return this.calendario.get(Calendar.DAY_OF_MONTH) + "/" + this.calendario.get(Calendar.MONTH) + "/" + this.calendario.get(Calendar.YEAR);
   }
   String getTime(){
	  return this.calendario.get(Calendar.HOUR_OF_DAY) + ":" + this.calendario.get(Calendar.MINUTE);
   }
   String getTarefaConcluida(){
	  String situacao;
	  
	  if(this.tarefaConcluida == false){
		 situacao = "Não";
	  }
	  else{
		 situacao = "Sim";
	  }
	  return situacao;
   }
   
   public String toString(){
	  return "\nTarefa: " + this.getTarefa() + "\n" +
	         "Data: " + this.getDate() + "\n" +
			 "Hora: " + this.getTime() + "\n" +
			 "Tarefa concluida: " + this.getTarefaConcluida();
   }
}
