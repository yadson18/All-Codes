/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonquest;

import java.util.Scanner;

/**
 *
 * @author AlunoIFPE
 */
public class PokemonQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Treinador treinador1 = new Treinador();
            treinador1.pokemon1 = new Pokemon();
            treinador1.pokemon2 = new Pokemon();
            treinador1.pokemon3 = new Pokemon();
        
        Treinador treinador2 = new Treinador();
            treinador2.pokemon1 = new Pokemon();
            treinador2.pokemon2 = new Pokemon();
            treinador2.pokemon3 = new Pokemon();
        
        String vencedor1, vencedor2, vencedor3;
        
        System.out.println("Nome do treinador 1:");
        treinador1.nome = leitor.next();
        System.out.println("Idade do treinador 1:");
        treinador1.idade = leitor.nextInt();
        System.out.println("Nome do pokemon 1:");
        treinador1.pokemon1.nome = leitor.next();
        System.out.println("Tipo do pokemon 1:");
        treinador1.pokemon1.tipo = leitor.next();
        System.out.println("Poder do pokemon 1:");
        treinador1.pokemon1.poder = leitor.nextInt();
        System.out.println("Nome do pokemon 2:");
        treinador1.pokemon2.nome = leitor.next();
        System.out.println("Tipo do pokemon 2:");
        treinador1.pokemon2.tipo = leitor.next();
        System.out.println("Poder do pokemon 2:");
        treinador1.pokemon2.poder = leitor.nextInt();
        System.out.println("Nome do pokemon 3:");
        treinador1.pokemon3.nome = leitor.next();
        System.out.println("Tipo do pokemon 3:");
        treinador1.pokemon3.tipo = leitor.next();
        System.out.println("Poder do pokemon 3:");
        treinador1.pokemon3.poder = leitor.nextInt();
        System.out.print("\n");
        
        System.out.println("Nome do treinador 2:");
        treinador2.nome = leitor.next();
        System.out.println("Idade do treinador 2:");
        treinador2.idade = leitor.nextInt();
        System.out.println("Nome do pokemon 1:");
        treinador2.pokemon1.nome = leitor.next();
        System.out.println("Tipo do pokemon 1:");
        treinador2.pokemon1.tipo = leitor.next();
        System.out.println("Poder do pokemon 1:");
        treinador2.pokemon1.poder = leitor.nextInt();
        System.out.println("Nome do pokemon 2:");
        treinador2.pokemon2.nome = leitor.next();
        System.out.println("Tipo do pokemon 2:");
        treinador2.pokemon2.tipo = leitor.next();
        System.out.println("Poder do pokemon 2:");
        treinador2.pokemon2.poder = leitor.nextInt();
        System.out.println("Nome do pokemon 3:");
        treinador2.pokemon3.nome = leitor.next();
        System.out.println("Tipo do pokemon 3:");
        treinador2.pokemon3.tipo = leitor.next();
        System.out.println("Poder do pokemon 3:");
        treinador2.pokemon3.poder = leitor.nextInt();
        
        if(treinador1.pokemon1.poder < treinador2.pokemon1.poder){
            vencedor1 = treinador2.nome;
        }
        else{
            vencedor1 = treinador1.nome;
        }
        if(treinador1.pokemon2.poder < treinador2.pokemon2.poder){
            vencedor2 = treinador2.nome;
        }
        else{
            vencedor2 = treinador1.nome;
        }
        if(treinador1.pokemon3.poder < treinador2.pokemon3.poder){
            vencedor3 = treinador2.nome;
        }
        else{
            vencedor3 = treinador1.nome;
        }
        
            System.out.println("\nVencedor da 1° batalha: " + vencedor1);
            System.out.println("Vencedor da 2° batalha: " + vencedor2);
            System.out.println("Vencedor da 3° batalha: " + vencedor3);
    } 
}
