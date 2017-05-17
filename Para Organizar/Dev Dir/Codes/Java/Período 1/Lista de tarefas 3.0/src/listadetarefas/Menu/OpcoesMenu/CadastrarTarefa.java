/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas.Menu.OpcoesMenu;

import java.util.Calendar;
import listadetarefas.Classes.Tarefa;
import listadetarefas.Classes.ListaTarefas;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class CadastrarTarefa {

    public static void cadastrarTarefa(ListaTarefas l) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < l.tarefas.length;) {
            if (l.tarefas[i] == null) {
                Tarefa tarefa = new Tarefa();

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

                break;

            } else {

                i++;
            }
        }

    }
}
