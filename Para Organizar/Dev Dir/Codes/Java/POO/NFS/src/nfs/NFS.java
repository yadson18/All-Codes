/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nfs;

import java.util.Scanner;

public class NFS {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Veiculo van = new Veiculo();
        Veiculo carro = new Veiculo();
        Veiculo moto = new Veiculo();
        float kmsParaPercorrer;
/*---------------------------------------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Capacidade máxima de passageiros da Van:");
        van.novoVeiculo();
        System.out.println("\nAutonomia do(a) " + van.marca + " (" + van.modelo + "): " + van.autonomia() + " Km");
        System.out.println("Digite quantos KM deseja percorrer: ");
        kmsParaPercorrer = leitor.nextFloat();
        System.out.println("Combustível necessário para percorrer " + kmsParaPercorrer + "Km: " + van.combustivelNecessario(kmsParaPercorrer) + " litros.");
/*---------------------------------------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("\nCapacidade máxima de passageiros do Carro:");
        carro.novoVeiculo();
        System.out.println("\nAutonomia do(a) " + carro.marca + " (" + carro.modelo + "): " + carro.autonomia() + " Km");
        System.out.println("Digite quantos KM deseja percorrer: ");
        kmsParaPercorrer = leitor.nextFloat();
        System.out.println("Combustível necessário para percorrer " + kmsParaPercorrer + "Km: " + carro.combustivelNecessario(kmsParaPercorrer) + " litros.");
/*---------------------------------------------------------------------------------------------------------------------------------------------------------*/        
        System.out.println("\nCapacidade máxima de passageiros da Moto:");
        moto.novoVeiculo();
        System.out.println("\nAutonomia do(a) " + moto.marca + " (" + moto.modelo + "): " + moto.autonomia() + " Km");
        System.out.println("Digite quantos KM deseja percorrer: ");
        kmsParaPercorrer = leitor.nextFloat();
        System.out.println("Combustível necessário para percorrer " + kmsParaPercorrer + "Km: " + moto.combustivelNecessario(kmsParaPercorrer) + " litros.");
/*---------------------------------------------------------------------------------------------------------------------------------------------------------*/        
    }

}
