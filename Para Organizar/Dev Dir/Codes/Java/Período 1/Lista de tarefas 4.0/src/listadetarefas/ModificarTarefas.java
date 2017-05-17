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
public class ModificarTarefas {

    public static void modificarTarefas(ListaTarefas l) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < l.tarefas.length; i++) {

            if (l.tarefas[i] != null) {
                System.out.println("Tarefa de numero:" + i);
                System.out.println("Tarefa: " + l.tarefas[i].nome);
                System.out.println("Dia/Mes/Ano: " + l.tarefas[i].c.get(Calendar.DAY_OF_MONTH) + "/" + l.tarefas[i].c.get(Calendar.MONTH) + "/" + l.tarefas[i].c.get(Calendar.YEAR));
                System.out.println("Hora/Minutos: " + l.tarefas[i].c.get(Calendar.HOUR_OF_DAY) + ":" + l.tarefas[i].c.get(Calendar.MINUTE));
                System.out.println("Concluida: " + l.tarefas[i].concluida + "\n");
            } else {
                System.out.println("Nao existem mais tarefas salvas" + "\n");
                break;
            }

        }

        Tarefa tarefa = new Tarefa();
        System.out.println("Qual tarefa deseja modificar?");

        String delet = leitor.nextLine();
        int i = Integer.valueOf(delet);

        System.out.println("\n" + "Digite a tarefa:");
        tarefa.nome = leitor.nextLine();
        System.out.println("Digite (Dia Mes Ano) separados por Espaço:");
        tarefa.day = leitor.nextInt();
        tarefa.month = leitor.nextInt();
        tarefa.year = leitor.nextInt();
        System.out.println("Digite (Hora Minutos) separados por Espaço:");
        tarefa.hour = leitor.nextInt();
        tarefa.minutes = leitor.nextInt();
        System.out.println("Concluida:");
        tarefa.concluida = leitor.nextBoolean();

        tarefa.c.set(Calendar.YEAR, tarefa.year);
        tarefa.c.set(Calendar.MONTH, tarefa.month);
        tarefa.c.set(Calendar.DAY_OF_MONTH, tarefa.day);
        tarefa.c.set(Calendar.HOUR_OF_DAY, tarefa.hour);
        tarefa.c.set(Calendar.MINUTE, tarefa.minutes);

        l.tarefas[i] = tarefa;

    }
}
