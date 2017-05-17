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
public class RemoverTreinador {

    public static void removerTreinador(Treinadores treinadores) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        int indice;

        do {
            System.out.println("\n**************************************");
            System.out.println("****       Remover Treinador      ****");
            ImprimirSubmenu.imprimirSubmenu();
            opcao = leitor.nextInt();
            while (opcao < 0 || opcao > 2) {
                System.out.println("Esta opcao nao existe, digite novamente:");
                opcao = leitor.nextInt();
            }
            switch (opcao) {
                case 1:
                    ExibirTreinador.exibirTreinadorPokemon(treinadores);
                    System.out.println("\nDigite o numero correspondente ao treinador Pokemon que deseja remover:");
                    indice = leitor.nextInt();
                    while (indice < 1 || indice > (treinadores.pokeTrainers.length + 1) || treinadores.pokeTrainers[indice - 1] == null) {
                        System.out.println("Opcao invalida, tente novamente ou digite (0) para voltar ao Menu:");
                        indice = leitor.nextInt();
                        if(indice == 0){
                            return;
                        }
                    }
                    for (int i = (indice - 1); i < ((treinadores.pokeTrainers.length + 1) - i); i++) {
                        if (treinadores.pokeTrainers[i] != null) {
                            treinadores.pokeTrainers[i] = treinadores.pokeTrainers[i + 1];
                        } else {
                            System.out.println("O treinador Pokemon " + indice + " foi removido:");
                            break;
                        }
                    }
                    break;
                case 2:
                    ExibirTreinador.exibirTreinadorDigimon(treinadores);
                    System.out.println("\nDigite o numero correspondente ao treinador Digimon que deseja remover:");
                    indice = leitor.nextInt();
                    while (indice < 1 || indice > (treinadores.digiTrainers.length + 1) || treinadores.digiTrainers[indice - 1] == null) {
                        System.out.println("Opcao invalida, tente novamente ou digite (0) para voltar ao Menu:");
                        indice = leitor.nextInt();
                        if(indice == 0){
                            return;
                        }
                    }
                    for (int i = (indice - 1); i < ((treinadores.digiTrainers.length + 1) - i); i++) {
                        if (treinadores.digiTrainers[i] != null) {
                            treinadores.digiTrainers[i] = treinadores.digiTrainers[i + 1];
                        } else {
                            System.out.println("O treinador Digimon " + indice + " foi removido:");
                            break;
                        }
                    }
                    break;

            }
        } while (opcao != 0);
    }
}
