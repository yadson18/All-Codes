/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadetarefas.Menu;

import java.util.Scanner;
import listadetarefas.Classes.ListaTarefas;
import static listadetarefas.Menu.OpcoesMenu.CadastrarTarefa.cadastrarTarefa;
import static listadetarefas.Menu.OpcoesMenu.ExcluirTarefa.excluirTarefa;
import static listadetarefas.Menu.ImprimirMenu.ImprimirMenu.imprimirMenu;
import static listadetarefas.Menu.OpcoesMenu.MarcarTarefaComoSalva.marcarTarefaComoSalva;
import static listadetarefas.Menu.OpcoesMenu.ModificarTarefas.modificarTarefas;
import static listadetarefas.Menu.OpcoesMenu.Sobre.sobre;
import static listadetarefas.Menu.OpcoesMenu.TarefasSalvas.tarefasSalvas;

/**
 *
 * @author Isabelly
 */
public class Menu {

    public static void Menu() {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        ListaTarefas listatarefas = new ListaTarefas();

        do {

            imprimirMenu();

            opcao = leitor.nextInt();
            switch (opcao) {

                case 1:

                    cadastrarTarefa(listatarefas);

                    break;
                case 2:

                    tarefasSalvas(listatarefas);

                    break;
                case 3:

                    excluirTarefa(listatarefas);

                    break;

                case 4:

                    modificarTarefas(listatarefas);

                    break;

                case 5:

                    marcarTarefaComoSalva(listatarefas);

                    break;

                case 6:

                    sobre();

                    break;

            }

        } while (opcao != 0);
    }
}
