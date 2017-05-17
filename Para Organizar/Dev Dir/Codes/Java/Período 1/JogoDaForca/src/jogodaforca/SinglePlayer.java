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
public class SinglePlayer {

    public static void SinglePlayer(Jogadores j, Palavra p, Palavras ps, Letra l) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < j.todosOsJogadores.length;) {
            if (j.todosOsJogadores[i] == null) {
                Jogador jogador = new Jogador();
                System.out.println("Nome do jogador:");
                jogador.jogador = leitor.nextLine();

                j.todosOsJogadores[i] = jogador;

                
                    
                for (int in = 0; in < ps.arrayPalavras.length;) {
                    Palavra palavra = new Palavra();
                    System.out.println("Dica: " + palavra.dicaPalavra);
                     ps.arrayPalavras[in] = palavra;
                    System.out.println("Digite uma letra:");
                    l.letra = leitor.nextLine().charAt(0);
                    for (int ind = 0; ind < p.criarPalavra.length;) {
                        if (l.letra == p.criarPalavra[ind]) {
                            System.out.println("Correta.");
                           
                            ind++;
                        } else {
                            System.out.println("Incorreta.");
                            ind++;
                        }
                    }
                }
                break;
            } else {
                i++;
            }

        }
    }
}
