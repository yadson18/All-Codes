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
public class ExibirGrupo {
    public static void exibirPokeGroup(Treinadores treinadores){
        for (int i = 0; i < treinadores.pokeGroups.length; i++) {
            if (treinadores.pokeGroups[i] != null) {
                System.out.println("\n----------------------------------------------"
                        + "\nGrupo " + (i + 1) + ":\n"
                        + treinadores.pokeGroups[i].getPartyName()
                        + "\n----------------------------------------------");
            } else {
                break;
            }
        }
    }
    
    public static void exibirDigiGroup(Treinadores treinadores){
        for (int i = 0; i < treinadores.digiGroups.length; i++) {
            if (treinadores.digiGroups[i] != null) {
                System.out.println("\n----------------------------------------------"
                        + "\nGrupo " + (i + 1) + ":\n"
                        + treinadores.digiGroups[i].getPartyName()
                        + "\n----------------------------------------------");
            } else {
                break;
            }
        }
    }
}
