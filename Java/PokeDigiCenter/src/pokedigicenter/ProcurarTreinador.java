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
public class ProcurarTreinador {
    public static void procurarTreinador(Treinadores treinadores){
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n**************************************");
            System.out.println("****      Procurar Treinador      ****");
            ImprimirSubmenu.imprimirSubmenu();
            opcao = leitor.nextInt();
            while (opcao < 0 || opcao > 2) {
                System.out.println("Esta opcao nao existe, digite novamente:");
                opcao = leitor.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do(a) treinador(a) Pokemon que deseja procurar:");
                    String pokeTrainerName = leitor.next();
                    pokeTrainerName = StringUtils.capitalize(pokeTrainerName);
                    for(int i = 0; i < treinadores.pokeTrainers.length;){
                       if(treinadores.pokeTrainers[i] != null){
                           if(pokeTrainerName.equals(treinadores.pokeTrainers[i].getName())){
                               System.out.println("\nTreinador(a) encontrado(a), dados do(a) treinador(a) Pokemon: \n" + treinadores.pokeTrainers[i].toString());
                               break;
                           }
                           else{
                               i++;
                           }
                       }
                       else{
                           System.out.println("\nTreinador(a) nao encontrado(a), tente novamente:");
                           break;
                       }
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o nome do(a) treinador(a) Digimon que deseja procurar:");
                    String digiTrainerName = leitor.next();
                    digiTrainerName = StringUtils.capitalize(digiTrainerName);
                    for(int i = 0; i < treinadores.digiTrainers.length;){
                       if(treinadores.digiTrainers[i] != null){
                           if(digiTrainerName.equals(treinadores.digiTrainers[i].getName())){
                               System.out.println("\nTreinador(a) encontrado(a), dados do(a) treinador(a) Digimon: " + treinadores.digiTrainers[i].toString());
                               break;
                           }
                           else{
                               i++;
                           }
                       }
                       else{
                           System.out.println("\nTreinador(a) nao encontrado(a), tente novamente:");
                           break;
                       }
                    }
                    break;

            }
        } while (opcao != 0);
    }
}
