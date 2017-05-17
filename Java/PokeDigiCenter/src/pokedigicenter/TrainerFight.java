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
public class TrainerFight {

    public static void trainerFight(Treinadores treinadores) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        Treinadores trainers = new Treinadores();
        trainers.pokeTrainers = new PokeTrainer[2];
        trainers.digiTrainers = new DigiTrainer[2];

        for (int i = 0; i < 2;) {
            System.out.println("\n***********************************************************");
            System.out.println("*********         Batalha de Treinadores          *********");
            System.out.println("** (1) Procurar um treinador Pokemon para a batalha      **");
            System.out.println("** (2) Procurar um treinador Digimon para a batalha      **");
            System.out.println("** (0) Voltar ao menu principal                          **");
            System.out.println("***********************************************************");
            System.out.println("*************         Digite uma opcao        *************");
            opcao = leitor.nextInt();
            while ((opcao < 0) || (opcao > 2)) {
                System.out.println("Esta opcao nao existe, digite novamente:");
                opcao = leitor.nextInt();
            }
            if ((treinadores.pokeTrainers[0] != null) || (treinadores.digiTrainers[0] != null)) {
                if (opcao == 1) {
                    ExibirTreinador.exibirTreinadorPokemon(treinadores);
                    System.out.println("\nDigite o nome do(a) treinador(a) Pokemon " + (i + 1) + " que ira batalhar:");
                    String procurarNome = leitor.next();
                    procurarNome = StringUtils.capitalize(procurarNome);
                    for (int j = 0; j < treinadores.pokeTrainers.length;) {
                        if (treinadores.pokeTrainers[j] != null) {
                            if (!treinadores.pokeTrainers[j].getName().equals(procurarNome)) {
                                j++;
                            } else if (treinadores.pokeTrainers[j].getName().equals(procurarNome)) {
                                if ((i == 1) && (trainers.pokeTrainers[0] != null)) {
                                    if (treinadores.pokeTrainers[j].getName().equals(trainers.pokeTrainers[0].getName())) {
                                        System.out.println("\nTreinador(a) (" + procurarNome + ") ja ira participar da batalha, por favor, procure outro(a) treinador(a):");
                                        i = i;
                                        break;
                                    } else {
                                        System.out.println("\nTreinador(a) (" + procurarNome + ") pronto para a batalha:");
                                        trainers.pokeTrainers[i] = treinadores.pokeTrainers[j];
                                        i++;
                                        break;
                                    }
                                } else {
                                    System.out.println("\nTreinador(a) (" + procurarNome + ") pronto para a batalha:");
                                    trainers.pokeTrainers[i] = treinadores.pokeTrainers[j];
                                    i++;
                                    break;
                                }
                            } else {
                                System.out.println("Treinador(a) (" + procurarNome + ") nao encontrado(a):");
                                i = i;
                                break;
                            }
                        } else {
                            System.out.println("Nenhum(a) treinador(a) cadastrado aqui, tente novamente:");
                            i = i;
                            break;
                        }
                    }
                } else if (opcao == 2) {
                    ExibirTreinador.exibirTreinadorDigimon(treinadores);
                    System.out.println("\nDigite o nome do(a) treinador(a) Digimon " + (i + 1) + " que ira batalhar:");
                    String procurarNome2 = leitor.next();
                    procurarNome2 = StringUtils.capitalize(procurarNome2);
                    for (int j = 0; j < treinadores.digiTrainers.length;) {
                        if (treinadores.digiTrainers[j] != null) {
                            if (!treinadores.digiTrainers[j].getName().equals(procurarNome2)) {
                                j++;
                            } else if (treinadores.digiTrainers[j].getName().equals(procurarNome2)) {
                                if ((i == 1) && (trainers.digiTrainers[0] != null)) {
                                    if (treinadores.digiTrainers[j].getName().equals(trainers.digiTrainers[0].getName())) {
                                        System.out.println("\nTreinador(a) (" + procurarNome2 + ") ja ira participar da batalha, por favor, procure outro(a) treinador(a):");
                                        i = i;
                                        break;
                                    } else {
                                        System.out.println("\nTreinador(a) (" + procurarNome2 + ") pronto para a batalha:");
                                        trainers.digiTrainers[i] = treinadores.digiTrainers[j];
                                        i++;
                                        break;
                                    }
                                } else {
                                    System.out.println("\nTreinador(a) (" + procurarNome2 + ") pronto para a batalha:");
                                    trainers.digiTrainers[i] = treinadores.digiTrainers[j];
                                    i++;
                                    break;
                                }
                            } else {
                                System.out.println("Treinador(a) (" + procurarNome2 + ") nao encontrado(a):");
                                i = i;
                                break;
                            }
                        } else {
                            System.out.println("Nenhum(a) treinador(a) cadastrado aqui, tente novamente:");
                            i = i;
                            break;
                        }
                    }
                } else if (opcao == 0) {
                    return;
                }

            } else {
                System.out.println("\nNao existem treinadores suficientes para uma batalha:");
                return;
            }
        }
        System.out.println("\nA batalha comecou:");
        if ((trainers.pokeTrainers[0] != null) && (trainers.digiTrainers[1] != null)) {
            trainers.pokeTrainers[0].duelar(trainers.digiTrainers[1]);
        } else if ((trainers.digiTrainers[0] != null) && (trainers.pokeTrainers[1] != null)) {
            trainers.digiTrainers[0].duelar(trainers.pokeTrainers[1]);
        } else if ((trainers.pokeTrainers[0] != null) && (trainers.pokeTrainers[1] != null)) {
            trainers.pokeTrainers[0].duelar(trainers.pokeTrainers[1]);
        } else {
            trainers.digiTrainers[0].duelar(trainers.digiTrainers[1]);
        }

    }
}
