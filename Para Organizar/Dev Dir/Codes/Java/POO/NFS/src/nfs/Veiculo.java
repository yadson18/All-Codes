/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfs;

import java.util.Scanner;

/**
 *
 * @author AlunoIFPE
 */
public class Veiculo {
    int passageiros;
    int rodas;
    String marca;
    String modelo;
    float capacidade;
    float consumo;
    
    public void novoVeiculo(){
        Scanner leitor = new Scanner(System.in);
        
        passageiros = leitor.nextInt();
        System.out.println("Quantidade de rodas:");
        rodas = leitor.nextInt();
        System.out.println("Marca:");
        marca = leitor.next();
        System.out.println("Modelo:");
        modelo = leitor.next();
        System.out.println("Capacidade do tanque (em litros):");
        capacidade = leitor.nextFloat();
        System.out.println("Consumo (Km / por litro):");
        consumo = leitor.nextFloat();
    }
    
    public float autonomia(){
       float autonomia = consumo * capacidade;
       
       return autonomia;
    }
    
    public float combustivelNecessario(float kmsParaPercorrer){
        float combustivelNecess = kmsParaPercorrer / consumo;
        
        return combustivelNecess;
    }
}
