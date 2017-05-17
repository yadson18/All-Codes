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
public class ExcluirTarefa {

    public static void excluirTarefa(ListaTarefas l) {
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

        System.out.println("Digite qual tarefa deseja excluir: ");
        int i = leitor.nextInt();
        Tarefa tarefa = new Tarefa();
        l.tarefas[i] = tarefa;
        for (i = i; i < l.tarefas.length; i++) {
            if (l.tarefas[i] != null) {
                l.tarefas[i] = l.tarefas[i + 1];
            } else {
                break;
            }
        }
        System.out.println("\n" + "Tarefa Excluida Com Sucesso " + "\n");

    }
}
