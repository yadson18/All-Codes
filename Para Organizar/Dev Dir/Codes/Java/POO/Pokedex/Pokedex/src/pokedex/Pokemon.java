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
public class Pokemon {
    String nome;
    String tipo;
    int poder; 
    int level;
    
    public String getNome(){
        return nome;
    }
    
    public int poderTotal(){
        return (poder + level) * 4;
    }
    
    public String nomeELevel(){
        String nameAndLevel;
        
        nameAndLevel = "Pokemon: " + nome + " / Level: " + level;
            
            return nameAndLevel;
    }
}
