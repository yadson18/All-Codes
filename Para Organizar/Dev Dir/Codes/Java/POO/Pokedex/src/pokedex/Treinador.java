/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author Isabelly
 */
public class Treinador {

    String nome;
    int idade;
    Pokemon pokemons[];
    Pokemon maisFraco;
    Pokemon maisForte;

    public String getNome() {
        return nome;
    }

    public Pokemon stronger() {
        Pokemon maisForte = new Pokemon();
        int indice = 0;
        
        for (int i = 0; i < pokemons.length;) {
            if (pokemons.length >= 2) {
                if (pokemons[indice].poderTotal() < pokemons[i].poderTotal()) {
                    indice = i;
                    maisForte.nome = pokemons[i].nome;
                    maisForte.tipo = pokemons[i].tipo;
                    maisForte.poder = pokemons[i].poder;
                    maisForte.level = pokemons[i].level;
                    i++;
                } else {
                    maisForte.nome = pokemons[indice].nome;
                    maisForte.tipo = pokemons[indice].tipo;
                    maisForte.poder = pokemons[indice].poder;
                    maisForte.level = pokemons[indice].level;
                    i++;
                }
            } else {
                maisForte.nome = pokemons[i].nome;
                maisForte.tipo = pokemons[i].tipo;
                maisForte.poder = pokemons[i].poder;
                maisForte.level = pokemons[i].level;
                break;
            }   
        }
        return maisForte;
    }

    public Pokemon weaker() {
        Pokemon maisFraco = new Pokemon();
        int indice = 0;
        
        for (int i = 0; i < pokemons.length;) {
            if (pokemons.length >= 2) {
                if (pokemons[indice].poderTotal() > pokemons[i].poderTotal()) {
                    indice = i;
                    maisFraco.nome = pokemons[i].nome;
                    maisFraco.tipo = pokemons[i].tipo;
                    maisFraco.poder = pokemons[i].poder;
                    maisFraco.level = pokemons[i].level;
                    i++;
                } else {
                    maisFraco.nome = pokemons[indice].nome;
                    maisFraco.tipo = pokemons[indice].tipo;
                    maisFraco.poder = pokemons[indice].poder;
                    maisFraco.level = pokemons[indice].level;
                    i++;
                }
            } else {
                maisFraco.nome = pokemons[i].nome;
                maisFraco.tipo = pokemons[i].tipo;
                maisFraco.poder = pokemons[i].poder;
                maisFraco.level = pokemons[i].level;
                break;
            }   
        }
        return maisFraco;
    }

    public String[] pokemonsTypes() {
        String types[] = new String[pokemons.length];
        for (int i = 0; i < pokemons.length; i++) {
            types[i] = pokemons[i].tipo;
        }
        return types;
    }

    public Pokemon[] getPokemons() {
        Pokemon allPokemons[] = new Pokemon[pokemons.length];
        for (int i = 0; i < pokemons.length; i++) {
            allPokemons[i] = pokemons[i];
        }
        return allPokemons;
    }
}
