/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author AlunoIFPE
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome e sobrenome: ");
        String nome = leitor.next();
        String sobrenome = leitor.next();
        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt();
        
        TestClass a = new TestClass(nome, sobrenome, idade);
        
        System.out.println("\n\nNome: " + a.nome + " " + a.sobrenome + "\nIdade: " + a.idade);
        
    }
    
}
