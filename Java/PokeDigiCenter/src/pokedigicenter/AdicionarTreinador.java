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
public class AdicionarTreinador {

    public static void adicionarTreinador(Treinadores treinadores) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        String nome;
        String sobrenome;
        int idade;
        int quantidadePokemons;
        int quantidadeDigimons;

        String especie;
        String tipo;
        String apelido;
        int poderInicial;

        do {
            System.out.println("\n**************************************");
            System.out.println("***      Adicionar Treinador       ***");
            ImprimirSubmenu.imprimirSubmenu();
            opcao = leitor.nextInt();
            while (opcao < 0 || opcao > 2) {
                System.out.println("Esta opcao não existe, digite novamente:");
                opcao = leitor.nextInt();
            }
            switch (opcao) {
                case 1:
                    for (int i = 0; i < treinadores.pokeTrainers.length;) {
                        if (treinadores.pokeTrainers[i] == null) {
                            System.out.println("\nDigite seu nome e sobrenome, idade e a quantidade de Pokemons que possui:");
                            nome = leitor.next();
                            nome = StringUtils.capitalize(nome);
                            sobrenome = leitor.next();
                            idade = leitor.nextInt();
                            quantidadePokemons = leitor.nextInt();
                            PokeTrainer treinadorPokemon = new PokeTrainer(nome, sobrenome, idade, quantidadePokemons);
                            treinadores.pokeTrainers[i] = treinadorPokemon;
                            for (i = 0; i < quantidadePokemons; i++) {
                                System.out.println("\nDigite a espécie do seu Pokemon " + (i + 1) + ":");
                                especie = leitor.next();
                                System.out.println("O tipo do Pokemon, os tipos permitodos sao (Agua, Fogo, Planta, Psiquico, Trevas e Luta):");
                                tipo = leitor.next();
                                tipo = StringUtils.capitalize(tipo);
                                while (!tipo.equals("Agua") || !tipo.equals("Fogo") || !tipo.equals("Planta") || !tipo.equals("Psiquico") || !tipo.equals("Trevas") || !tipo.equals("Luta")) {
                                    if (tipo.equals("Agua")) {
                                        tipo = "Agua";
                                        break;
                                    } else if (tipo.equals("Fogo")) {
                                        tipo = "Fogo";
                                        break;
                                    } else if (tipo.equals("Planta")) {
                                        tipo = "Planta";
                                        break;
                                    } else if (tipo.equals("Psiquico")) {
                                        tipo = "Psiquico";
                                        break;
                                    } else if (tipo.equals("Trevas")) {
                                        tipo = "Trevas";
                                        break;
                                    } else if (tipo.equals("Luta")) {
                                        tipo = "Luta";
                                        break;
                                    } else {
                                        System.out.println("Opcao invalida, os tipos permitidos para os Pokemons sao (Agua, Fogo, Planta, Psiquico, Trevas e Luta):");
                                        tipo = leitor.next();
                                        tipo = StringUtils.capitalize(tipo);
                                    }
                                }
                                System.out.println("Digite o apelido e o poder inicial:");
                                apelido = leitor.next();
                                poderInicial = leitor.nextInt();
                                Pokemon pokemon = new Pokemon(especie, tipo, apelido, poderInicial);
                                treinadorPokemon.addPokemon(pokemon, i);
                            }
                            break;
                        } else {
                            i++;
                        }
                    }
                    ExibirTreinador.exibirTreinadorPokemon(treinadores);
                    break;
                case 2:
                    for (int i = 0; i < treinadores.digiTrainers.length;) {
                        if (treinadores.digiTrainers[i] == null) {
                            System.out.println("\nDigite seu nome e sobrenome, idade e a quantidade de Digimons que possui:");
                            nome = leitor.next();
                            nome = StringUtils.capitalize(nome);
                            sobrenome = leitor.next();
                            idade = leitor.nextInt();
                            quantidadeDigimons = leitor.nextInt();
                            DigiTrainer treinadorDigimon = new DigiTrainer(nome, sobrenome, idade, quantidadeDigimons);
                            treinadores.digiTrainers[i] = treinadorDigimon;
                            for (i = 0; i < quantidadeDigimons; i++) {
                                System.out.println("\nDigite o nome, o apelido e o poder inicial do seu Digimon " + (i + 1) + ":");
                                nome = leitor.next();
                                apelido = leitor.next();
                                poderInicial = leitor.nextInt();
                                Digimon digimon = new Digimon(nome, apelido, poderInicial);
                                treinadorDigimon.addDigimon(digimon, i);
                            }
                            break;
                        } else {
                            i++;
                        }
                    }
                    ExibirTreinador.exibirTreinadorDigimon(treinadores);
                    break;
            }

        } while (opcao != 0);
    }
}
