/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem vindo a Pokedex. Digite seu nome e idade: ");
        Treinador treinador = new Treinador();
        treinador.nome = scan.next();
        treinador.idade = scan.nextInt();

        System.out.println("\nOla, " + treinador.getNome());
        System.out.println("Digite a seguir quantos pokemons voce possui:");
        int pokemons = scan.nextInt();
        
        treinador.pokemons = new Pokemon[pokemons];
        
        for (int i = 0; i < pokemons; i++) {
            Pokemon pokemon = new Pokemon();
            
            System.out.println("\nDigite nome, tipo, poder e level do pokemon " + (i + 1));
            pokemon.nome = scan.next();
            pokemon.tipo = scan.next();
            pokemon.poder = scan.nextInt();
            pokemon.level = scan.nextInt();
                
            treinador.pokemons[i] = pokemon;
            
            System.out.println(
                "\n\nPokemon: " + treinador.pokemons[i].getNome() + 
                "\nO pokemon " + treinador.pokemons[i].getNome() + 
                " tem o poder total de " + treinador.pokemons[i].poderTotal()
            );
        }

        System.out.println("\n\nParabens, treinador. Aqui vao algumas estatisticas sobre seus pokemons:");

        /*
         * o mÃ©todo "stronger" deve retornar o pokemon mais forte 
         * (considerando o poder total) dentre todos os pokemons 
         * do treinador
         */
            Pokemon maisForte = treinador.stronger();
            
        System.out.println(
            "Pokemon mais forte: " + maisForte.nome + 
            " com poder " + maisForte.poderTotal()
        );

        /*
         * o mÃ©todo "weaker" deve retornar o pokemon mais fraco
         * (considerando o poder total) dentre todos os pokemons 
         * do treinador
         */
        Pokemon maisFraco = treinador.weaker();
        System.out.println(
            "Pokemon mais fraco: " + maisFraco.nome + 
            " com poder " + maisFraco.poderTotal()
        );

        /*
         * o mÃ©todo "pokemonsTypes" deve retornar um array contendo 
         * os tipos de todos os pokemon do treinador
         */
        System.out.println("\n\nTipos dos pokemon:");
        String[] tipos = treinador.pokemonsTypes();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(" - " + tipos[i]);
        }

        /*
         * o mÃ©todo "getPokemons" deve retornar o array com todos 
         * os pokemon do treinador; o mÃ©todo "nomeELevel" da classe Pokemon
         * deve retornar uma String contendo o nome e o level do pokemon
         */
        System.out.println("\n\nE agora, a lista com os nomes e levels de cada pokemon:");
        Pokemon[] todosOsPokemons = treinador.getPokemons();
        for (int i = 0; i < todosOsPokemons.length; i++) {
            System.out.println(" - " + todosOsPokemons[i].nomeELevel());
        }
    }
    
}
