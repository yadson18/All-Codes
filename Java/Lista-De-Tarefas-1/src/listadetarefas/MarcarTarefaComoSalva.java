/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeTarefas;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class MarcarTarefaComoSalva {

    public static void marcarTarefaComoSalva(ListaTarefas l) {
        Scanner leitor = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();

        for (int i = 0; i < l.tarefas.length; i++) {

            if (l.tarefas[i] != null) {
                System.out.println("Tarefa de numero:" + i);
                System.out.println("Tarefa: " + l.tarefas[i].nome);
                System.out.println("Dia/Mes/Ano: " + l.tarefas[i].c.get(Calendar.DAY_OF_MONTH) + "/" + l.tarefas[i].c.get(Calendar.MONTH) + "/" + l.tarefas[i].c.get(Calendar.YEAR));
                System.out.println("Hora/Minutos: " + l.tarefas[i].c.get(Calendar.HOUR_OF_DAY) + ":" + l.tarefas[i].c.get(Calendar.MINUTE));
                System.out.println("Concluida: " + l.tarefas[i].concluida + "\n");
            } else {
                System.out.println("\n" + "Nao existem mais tarefas salvas" + "\n");
                break;
            }
        }

        System.out.println("Qual tarefa deseja marcar como concluida?:");
        int i = leitor.nextInt();

        tarefa.nome = l.tarefas[i].nome;
        tarefa.day = l.tarefas[i].day;
        tarefa.month = l.tarefas[i].month;
        tarefa.year = l.tarefas[i].year;
        tarefa.hour = l.tarefas[i].hour;
        tarefa.minutes = l.tarefas[i].minutes;
        tarefa.concluida = true;

        tarefa.c.set(Calendar.YEAR, tarefa.year);
        tarefa.c.set(Calendar.MONTH, tarefa.month);
        tarefa.c.set(Calendar.DAY_OF_MONTH, tarefa.day);
        tarefa.c.set(Calendar.HOUR_OF_DAY, tarefa.hour);
        tarefa.c.set(Calendar.MINUTE, tarefa.minutes);

        l.tarefas[i] = tarefa;

    }
}
