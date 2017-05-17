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
public class AdicionarPalavras {
    public static void AdicionarPalavras(Palavras p){
        Scanner leitor = new Scanner(System.in);     
        for(int i = 0; i < p.arrayPalavras.length;){
            if(p.arrayPalavras[i] == null){
                Palavra palavra = new Palavra();
                System.out.println("Digite a palavra:");
                palavra.criarPalavra = leitor.nextLine().toCharArray();
                System.out.println("Digite a dica para essa palavra:");
                palavra.dicaPalavra = leitor.nextLine();
                System.out.println("Palavra adicionada.");
                
                p.arrayPalavras[i] = palavra;
                
                break;
            }
            else{
                i++;
            }
        }
    }
}
