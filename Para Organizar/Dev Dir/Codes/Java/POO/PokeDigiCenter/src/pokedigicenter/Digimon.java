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
public class Digimon {

    private String nome;
    private String apelido;
    private int poderInicial;
    private int experienciaAtual;
    private int levelAtual;

    public Digimon(String nome, String apelido, int poderInicial) {

        this.nome = nome;
        this.apelido = apelido;
        if (poderInicial < 5) {
            this.poderInicial = 5;
        } else if (poderInicial > 20) {
            this.poderInicial = 20;

        } else {

            this.poderInicial = poderInicial;
        }
        this.experienciaAtual = 0;
        this.levelAtual = 1;
    }

    public int poderTotal() {
        return ((this.poderInicial) + (this.poderInicial) * (this.levelAtual) * (this.levelAtual) / 5);
    }

    public int getLevel() {
        if((this.experienciaAtual / 5) <= 1){
            this.levelAtual = 1;
        }
        else{
            this.levelAtual = (this.experienciaAtual) / 5;
        }
        return this.levelAtual;
    }
    
    public void setXp(int xp){
        this.experienciaAtual = this.experienciaAtual + xp;
    }
    public String toString() {
        return "\nNome: " + this.nome + "\n"
                + "Apelido: " + this.apelido + "\n"
                + "Poder total: " + this.poderTotal() + "\n"
                + "Level: " + this.getLevel() + "\n";
    }
    
    String duelar(Digimon digimon) {
        String vencedor;
        if(this.poderTotal() > digimon.poderTotal()){
            this.setXp(digimon.getLevel() * 2);
            digimon.setXp(digimon.getLevel() / 2);
            vencedor = this.toString();
        }
        else if(this.poderTotal() == digimon.poderTotal()){
            vencedor = "Ocorreu um empate:";
        }
        else{
            digimon.setXp(this.getLevel() * 2);
            this.setXp(this.getLevel() / 2);
            vencedor = digimon.toString();
        }
        return vencedor;
    }
    
    String duelar(Pokemon pokemon) {
        String vencedor;
        if(this.poderTotal() > pokemon.poderTotal()){
            this.setXp(pokemon.getLevel() * 2);
            pokemon.setXp(pokemon.getLevel() / 2);
            vencedor = this.toString();
        }
        else if(this.poderTotal() == pokemon.poderTotal()){
            vencedor = "Ocorreu um empate:";
        }
        else{
            pokemon.setXp(this.getLevel() * 2);
            this.setXp(this.getLevel() / 2);
            vencedor = pokemon.toString();
        }
        return vencedor;
    }
    
    
}
