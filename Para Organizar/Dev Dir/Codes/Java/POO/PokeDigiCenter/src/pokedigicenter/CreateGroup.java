/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedigicenter;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class CreateGroup {

    public static void createGroup(Treinadores treinadores) {
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n**************************************");
            System.out.println("****         Criar Grupo          ****");
            ImprimirSubmenu.imprimirSubmenuGroup();
            opcao = leitor.nextInt();
            while (opcao < 0 || opcao > 2) {
                System.out.println("Esta opcao não existe, digite novamente:");
                opcao = leitor.nextInt();
            }

            switch (opcao) {
                case 1:
                    if (treinadores.pokeTrainers[2] != null) {
                        for (int i = 0; i < treinadores.pokeGroups.length;) {
                            if (treinadores.pokeGroups[i] == null) {
                                System.out.println("\nDigite o nome do seu grupo Pokemon, grupo de numero " + (i + 1) + ":");
                                String pokeGroupName = leitor.next();
                                pokeGroupName = StringUtils.capitalize(pokeGroupName);
                                PokeTrainerGroup pokeTrainerGroup = new PokeTrainerGroup(pokeGroupName);
                                treinadores.pokeGroups[i] = pokeTrainerGroup;
                                ExibirTreinador.exibirTreinadorPokemon(treinadores);
                                for (int j = 0; j < 3;) {
                                    System.out.println("\nAgora digite o nome do(a) treinador(a) Pokemon que deseja adicionar ao grupo, treinador " + (j + 1) + ":");
                                    String pokeTrainerName = leitor.next();
                                    pokeTrainerName = StringUtils.capitalize(pokeTrainerName);
                                    for (int k = 0; k < treinadores.pokeTrainers.length;) {
                                        if (treinadores.pokeTrainers[k] != null) {
                                            if (pokeTrainerName.equals(treinadores.pokeTrainers[k].getName())) {
                                                PokeTrainer pokeTrainer = treinadores.pokeTrainers[k];
                                                pokeTrainerGroup.addPokeTrainer(pokeTrainer, j);
                                                System.out.println("\nTreinador(a) (" + pokeTrainer.getName() + ") juntou-se ao grupo (" + pokeGroupName + "):");
                                                j++;
                                                break;
                                            } else {
                                                k++;
                                            }
                                        } else {
                                            System.out.println("\nTreinador não encontrado, tente novamente:");
                                            j = j;
                                            break;
                                        }
                                    }
                                }
                                System.out.println("\nO grupo (" + pokeGroupName + ") foi criado com sucesso:");
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        System.out.println("\nQuantidade insuficiente de treinadores Pokemons para criar um grupo:");
                        return;
                    }
                    break;

                case 2:
                    if (treinadores.digiTrainers[2] != null) {
                        for (int i = 0; i < treinadores.digiGroups.length;) {
                            if (treinadores.digiGroups[i] == null) {
                                System.out.println("\nDigite o nome do seu grupo Digimon, grupo de numero " + (i + 1) + ":");
                                String digiGroupName = leitor.next();
                                digiGroupName = StringUtils.capitalize(digiGroupName);
                                DigiTrainerGroup digiTrainerGroup = new DigiTrainerGroup(digiGroupName);
                                treinadores.digiGroups[i] = digiTrainerGroup;
                                ExibirTreinador.exibirTreinadorDigimon(treinadores);
                                for (int j = 0; j < 3;) {
                                    System.out.println("\nAgora digite o nome do(a) treinador(a) Digimon que deseja adicionar ao grupo, treinador " + (j + 1) + ":");
                                    String digiTrainerName = leitor.next();
                                    digiTrainerName = StringUtils.capitalize(digiTrainerName);
                                    for (int k = 0; k < treinadores.digiTrainers.length;) {
                                        if (treinadores.digiTrainers[k] != null) {
                                            if (digiTrainerName.equals(treinadores.digiTrainers[k].getName())) {
                                                DigiTrainer digiTrainer = treinadores.digiTrainers[k];
                                                digiTrainerGroup.addDigiTrainer(digiTrainer, j);
                                                System.out.println("\nTreinador(a) (" + digiTrainer.getName() + ") juntou-se ao grupo (" + digiGroupName + "):");
                                                j++;
                                                break;
                                            } else {
                                                k++;
                                            }
                                        } else {
                                            System.out.println("\nTreinador não encontrado, tente novamente:");
                                            j = j;
                                            break;
                                        }
                                    }
                                }
                                System.out.println("\nO grupo (" + digiGroupName + ") foi criado com sucesso:");
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        System.out.println("\nQuantidade insuficiente de treinadores Digimons para criar um grupo:");
                        return;
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
