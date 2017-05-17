/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedigicenter;

/**
 *
 * @author Isabelly
 */
public class ExibirTreinador {

    public static void exibirTreinadorPokemon(Treinadores treinadores) {

        for (int i = 0; i < treinadores.pokeTrainers.length; i++) {
            if (treinadores.pokeTrainers[i] != null) {
                System.out.println("\n----------------------------------------------"
                        + "\nTreinador Pokemon " + (i + 1) + ":\n"
                        + treinadores.pokeTrainers[i].toString()
                        + "\n----------------------------------------------");
            } else {
                break;
            }
        }

    }

    public static void exibirTreinadorDigimon(Treinadores treinadores) {
        for (int i = 0; i < treinadores.digiTrainers.length; i++) {
            if (treinadores.digiTrainers[i] != null) {
                System.out.println("\n----------------------------------------------"
                        + "\nTreinador Digimon " + (i + 1) + ":\n"
                        + treinadores.digiTrainers[i].toString()
                        + "\n----------------------------------------------");
            } else {
                break;
            }
        }
    }
}
