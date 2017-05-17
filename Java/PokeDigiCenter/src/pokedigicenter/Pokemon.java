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
public class Pokemon {

    private String especie;
    private String tipo;
    private String apelido;
    private int poderInicial;
    private int experienciaAtual;
    private int levelAtual;

    public Pokemon(String especie, String tipo, String apelido, int poderInicial) {

        this.especie = especie;
        this.tipo = tipo;
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
        return "\nEspécie: " + this.especie + "\n"
                + "Tipo: " + this.tipo + "\n"
                + "Apelido: " + this.apelido + "\n"
                + "Poder total: " + this.poderTotal() + "\n"
                + "Level: " + this.getLevel() + "\n";
    }

    String duelar(Pokemon pokemon) {
        String vencedor;
        
        if ((this.tipo.equals("Fogo") && pokemon.tipo.equals("Planta")) || (this.tipo.equals("Planta") && pokemon.tipo.equals("Agua")) || (this.tipo.equals("Agua") && pokemon.tipo.equals("Fogo")) || (this.tipo.equals("Psiquico") && pokemon.tipo.equals("Trevas")) || (this.tipo.equals("Trevas") && pokemon.tipo.equals("Luta")) || (this.tipo.equals("Luta") && pokemon.tipo.equals("Psiquico"))) {
            if (this.poderTotal() * 1.5 > pokemon.poderTotal() * 0.5) {
                this.setXp(pokemon.getLevel() * 2);
                pokemon.setXp(pokemon.getLevel() / 2);
                vencedor = this.toString();
            } 
            else if(this.poderTotal() * 1.5 == pokemon.poderTotal() * 0.5){
                vencedor = "Ocorreu um empate:";
            }
            else {
                pokemon.setXp(this.getLevel() * 2);
                this.setXp(this.getLevel() / 2);
                vencedor = pokemon.toString();
            }
        } else if ((pokemon.tipo.equals("Fogo") && this.tipo.equals("Planta")) || (pokemon.tipo.equals("Planta") && this.tipo.equals("Agua")) || (pokemon.tipo.equals("Agua") && this.tipo.equals("Fogo")) || (pokemon.tipo.equals("Psiquico") && this.tipo.equals("Trevas")) || (pokemon.tipo.equals("Trevas") && this.tipo.equals("Luta")) || (pokemon.tipo.equals("Luta") && this.tipo.equals("Psiquico"))) {
            if (pokemon.poderTotal() * 1.5 > this.poderTotal() * 0.5) {
                pokemon.setXp(this.getLevel() * 2);
                this.setXp(this.getLevel() / 2);
                vencedor = pokemon.toString();
            } 
            else if(pokemon.poderTotal() * 1.5 == this.poderTotal() * 0.5){
                vencedor = "Ocorreu um empate:";
            }
            else {
                this.setXp(pokemon.getLevel() * 2);
                pokemon.setXp(pokemon.getLevel() / 2);
                vencedor = this.toString();
            }
        } else{
            if (this.poderTotal() * 1 > pokemon.poderTotal() * 1) {
                this.setXp(pokemon.getLevel() * 2);
                pokemon.setXp(pokemon.getLevel() / 2);
                vencedor = this.toString();
            }
            else if(this.poderTotal() * 1 == pokemon.poderTotal() * 1){
                vencedor = "Ocorreu um empate:";
            }
            else {
                pokemon.setXp(this.getLevel() * 2);
                this.setXp(this.getLevel() / 2);
                vencedor = pokemon.toString();
            }
        }
        return vencedor;
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

}
