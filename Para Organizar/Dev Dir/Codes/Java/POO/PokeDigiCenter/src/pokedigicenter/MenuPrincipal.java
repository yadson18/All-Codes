/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedigicenter;

import java.util.Scanner;
/**
 *
 * @author Isabelly
 */
public class MenuPrincipal {

    public static void menuPrincipal() {
        Scanner leitor = new Scanner(System.in);
        Treinadores treinadores = new Treinadores();
        int opcao;

        do {
            ImprimirMenuPrincipal.imprimirMenu();
            opcao = leitor.nextInt();
            while (opcao < 0 || opcao > 6) {
                System.out.println("Esta opcao não existe, digite novamente:");
                opcao = leitor.nextInt();
            }
            switch (opcao) {
                case 1:
                    AdicionarTreinador.adicionarTreinador(treinadores);
                    break;
                case 2:
                    ProcurarTreinador.procurarTreinador(treinadores);
                    break;
                case 3:
                    RemoverTreinador.removerTreinador(treinadores);
                    break;
                case 4:
                    CreateGroup.createGroup(treinadores);
                    break;
                case 5:
                    TrainerFight.trainerFight(treinadores);
                    break;
                case 6:
                    GroupFight.groupFight(treinadores);
                    break;
            }
        } while (opcao != 0);
    }
}
