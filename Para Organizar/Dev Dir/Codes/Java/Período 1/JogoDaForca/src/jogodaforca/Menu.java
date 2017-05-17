/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaforca;

import java.util.Scanner;
import static jogodaforca.AdicionarPalavras.AdicionarPalavras;
import static jogodaforca.ImprimirAjuda.ImprimirAjuda;
import static jogodaforca.ImprimirMenuJogar.ImprimirMenuJogar;
import static jogodaforca.ImprimirMenuPrincipal.ImprimirMenuPrincipal;
import static jogodaforca.ImprimirSobre.ImprimirSobre;
import static jogodaforca.MultiPlayer.MultiPlayer;
import static jogodaforca.Recordes.Recordes;
import static jogodaforca.SinglePlayer.SinglePlayer;

/**
 *
 * @author Isabelly
 */
public class Menu {

    public static void Menu() {
        Scanner leitor = new Scanner(System.in);
        Jogadores jogadores = new Jogadores();
        Palavra palavra = new Palavra();
        Palavras palavras = new Palavras();
        Letra letra = new Letra();
        int opcao, opcao2;

        do {

            ImprimirMenuPrincipal();
            String opcaoConv = leitor.nextLine();
            opcao = Integer.valueOf(opcaoConv);

            switch (opcao) {
                case 1:

                    do {
                        
                        ImprimirMenuJogar();
                        String opcaoConv2 = leitor.nextLine();
                        opcao2 = Integer.valueOf(opcaoConv2);
                        
                        switch (opcao2) {
                            case 1:

                                SinglePlayer(jogadores, palavra, palavras, letra);

                                break;
                            case 2:

                                MultiPlayer(jogadores);

                                break;

                        }
                    } while (opcao2 != 0);

                    break;
                case 2:
                    
                    Recordes();
                    
                    break;
                case 3:
                    
                    AdicionarPalavras(palavras);

                    break;
                case 4:
                    
                    ImprimirAjuda();

                    break;
                case 5:
                    
                    ImprimirSobre();
                    
                    break;
            }

        } while (opcao != 0);

    }
}
