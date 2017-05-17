/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeTarefas;

import static ListaDeTarefas.CadastrarTarefa.cadastrarTarefa;
import static ListaDeTarefas.ExcluirTarefa.excluirTarefa;
import static ListaDeTarefas.ImprimirMenu.imprimirMenu;
import static ListaDeTarefas.MarcarTarefaComoSalva.marcarTarefaComoSalva;
import static ListaDeTarefas.ModificarTarefas.modificarTarefas;
import static ListaDeTarefas.Sobre.sobre;
import static ListaDeTarefas.TarefasSalvas.tarefasSalvas;
import java.util.Scanner;
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
