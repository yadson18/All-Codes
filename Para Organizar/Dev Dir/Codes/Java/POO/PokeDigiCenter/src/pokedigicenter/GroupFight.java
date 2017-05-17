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
public class GroupFight {

    public static void groupFight(Treinadores treinadores) {
        Scanner leitor = new Scanner(System.in);
        Treinadores trainers = new Treinadores();
        trainers.pokeGroups = new PokeTrainerGroup[2];
        trainers.digiGroups = new DigiTrainerGroup[2];

        System.out.println("\n**************************************");
        System.out.println("*****     Batalha de Grupos      *****");
        System.out.println("** (1) Procurar grupos para batalha **");
        System.out.println("** (0) Voltar ao Menu Principal     **");
        System.out.println("**************************************");
        System.out.println("******     Digite uma opcao     ******");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                for (int i = 0; i < 2;) {
                    System.out.println("\n**************************************");
                    System.out.println("*****       Buscar Grupos        *****");
                    System.out.println("** (1) Procurar grupo Pokemon       **");
                    System.out.println("** (2) Procurar grupo Digimon       **");
                    System.out.println("** (0) Voltar ao Menu Principal     **");
                    System.out.println("**************************************");
                    System.out.println("******     Digite uma opcao     ******");
                    int opcao2 = leitor.nextInt();
                    switch (opcao2) {
                        case 1:
                            if((treinadores.pokeGroups[0] != null)){
                                ExibirGrupo.exibirPokeGroup(treinadores);
                                System.out.println("\nDigite o nome do grupo Pokemon que ira batalhar, grupo ("  + (i + 1) + "):");
                                String pokeGroupName = leitor.next();
                                pokeGroupName = StringUtils.capitalize(pokeGroupName);
                                for(int j = 0; j < treinadores.pokeGroups.length;){
                                    if(treinadores.pokeGroups[j] != null){
                                        if(!treinadores.pokeGroups[j].getPartyName().equals(pokeGroupName)){
                                            j++;
                                        }
                                        else if(treinadores.pokeGroups[j].getPartyName().equals(pokeGroupName)){
                                            if((i == 1) && (trainers.pokeGroups[0] != null)){
                                                if(treinadores.pokeGroups[j].getPartyName().equals(trainers.pokeGroups[0].getPartyName())){
                                                    System.out.println("\nO grupo (" + pokeGroupName + ") ja ira participar da batalha, por favor, procure outro grupo:");
                                                    i = i;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("\nO grupo (" + pokeGroupName + ") esta pronto para a batalha:");
                                                    trainers.pokeGroups[i] = treinadores.pokeGroups[j];
                                                    i++;
                                                    break;
                                                }
                                            }
                                            else{
                                                System.out.println("\nO grupo (" + pokeGroupName + ") esta pronto para a batalha:");
                                                trainers.pokeGroups[i] = treinadores.pokeGroups[j];
                                                i++;
                                                break;
                                            }
                                        }
                                        else{
                                             
                                        }
                                    }
                                    else{
                                        System.out.println("\nEste grupo nao existe, tente novamente:");
                                        i = i;
                                        break;
                                    }
                                }
                            }
                            else{
                                System.out.println("\nNao existem grupos Pokemons cadastrados, tente novamente:");
                                i = i;
                                break;
                            }
                            
                            break;
                        case 2:
                            if((treinadores.digiGroups[0] != null)){
                                ExibirGrupo.exibirDigiGroup(treinadores);
                                System.out.println("\nDigite o nome do grupo Digimon que ira batalhar, grupo ("  + (i + 1) + "):");
                                String digiGroupName = leitor.next();
                                digiGroupName = StringUtils.capitalize(digiGroupName);
                                for(int j = 0; j < treinadores.digiGroups.length;){
                                    if(treinadores.digiGroups[j] != null){
                                        if(!treinadores.digiGroups[j].getPartyName().equals(digiGroupName)){
                                            j++;
                                        }
                                        else if(treinadores.digiGroups[j].getPartyName().equals(digiGroupName)){
                                            if((i == 1) && (trainers.digiGroups[0] != null)){
                                                if(treinadores.digiGroups[j].getPartyName().equals(trainers.digiGroups[0].getPartyName())){
                                                    System.out.println("\nO grupo (" + digiGroupName + ") ja ira participar da batalha, por favor, procure outro grupo:");
                                                    i = i;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("\nO grupo (" + digiGroupName + ") esta pronto para a batalha:");
                                                    trainers.digiGroups[i] = treinadores.digiGroups[j];
                                                    i++;
                                                    break;
                                                }
                                            }
                                            else{
                                                System.out.println("\nO grupo (" + digiGroupName + ") esta pronto para a batalha:");
                                                trainers.digiGroups[i] = treinadores.digiGroups[j];
                                                i++;
                                                break;
                                            }
                                        }
                                        else{
                                             
                                        }
                                    }
                                    else{
                                        System.out.println("\nEste grupo nao existe, tente novamente:");
                                        i = i;
                                        break;
                                    }
                                }
                            }
                            else{
                                System.out.println("\nNao existem grupos Digimons cadastrados, tente novamente:");
                                i = i;
                                break;
                            }
                            
                            break;
                        case 0:
                            return;
                    }
                }
                System.out.println("\nA batalha comecou:");
                if ((trainers.pokeGroups[0] != null) && (trainers.digiGroups[1] != null)) {
                    trainers.pokeGroups[0].duelar(trainers.digiGroups[1]);
                } else if ((trainers.digiGroups[0] != null) && (trainers.pokeGroups[1] != null)) {
                    trainers.digiGroups[0].duelar(trainers.pokeGroups[1]);
                } else if ((trainers.pokeGroups[0] != null) && (trainers.pokeGroups[1] != null)) {
                    trainers.pokeGroups[0].duelar(trainers.pokeGroups[1]);
                } else {
                    trainers.digiGroups[0].duelar(trainers.digiGroups[1]);
                }
                break;

            case 0:
                break;

        }

    }

}
