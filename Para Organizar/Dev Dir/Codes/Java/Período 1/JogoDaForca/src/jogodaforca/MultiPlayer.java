/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaforca;

import java.util.Scanner;

/**
 *
 * @author Isabelly
 */
public class MultiPlayer {
    public static void MultiPlayer(Jogadores j){
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < j.todosOsJogadores.length;) {
            if (j.todosOsJogadores[i] == null) {
                Jogador jogador = new Jogador();
                System.out.println("Nome do jogador 1:");
                jogador.jogador = leitor.nextLine();
                i = i + 1;
                System.out.println("Nome do jogador 2:");
                jogador.jogador = leitor.nextLine();
                
                j.todosOsJogadores[i] = jogador;
                
                break;
            } 
            else {
                i++;
            }
        }
    }
}
