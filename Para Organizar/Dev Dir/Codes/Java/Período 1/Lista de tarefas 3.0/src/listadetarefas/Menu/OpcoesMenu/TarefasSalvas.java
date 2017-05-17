/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas.Menu.OpcoesMenu;

import java.util.Calendar;
import listadetarefas.Classes.ListaTarefas;

/**
 *
 * @author Isabelly
 */
public class TarefasSalvas {

    public static void tarefasSalvas(ListaTarefas l) {

        for (int i = 0; i < l.tarefas.length; i++) {

            if (l.tarefas[i] != null) {
                System.out.println("Tarefa de numero:" + i);
                System.out.println("Tarefa: " + l.tarefas[i].nome);
                System.out.println("Dia/Mes/Ano: " + l.tarefas[i].c.get(Calendar.DAY_OF_MONTH) + "/" + l.tarefas[i].c.get(Calendar.MONTH) + "/" + l.tarefas[i].c.get(Calendar.YEAR));
                System.out.println("Hora/Minutos: " + l.tarefas[i].c.get(Calendar.HOUR_OF_DAY) + ":" + l.tarefas[i].c.get(Calendar.MINUTE));
                System.out.println("Concluida: " + l.tarefas[i].concluida + "\n");
            } else {
                System.out.println("\n" + "Nao existem mais tarefas salvas");
                break;
            }
        }

    }
}
