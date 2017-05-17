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
public class PokeTrainer {

    private String nome;
    private String sobrenome;
    private int idade;
    
    private Pokemon[] pokemons;

    public PokeTrainer(String nome, String sobrenome, int idade, int quantidadePokemons) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.pokemons = new Pokemon[quantidadePokemons];
    }

    public void addPokemon(Pokemon pokemon, int i) {
        this.pokemons[i] = pokemon;
    }

    public String toString() {
        String dadosTreinadorPokemon = "\nNome e sobrenome: " + this.nome + " " + this.sobrenome + "\n"
                + "Idade: " + this.idade + "\n";
        for(int i = 0; i < this.pokemons.length; i++){
            dadosTreinadorPokemon = dadosTreinadorPokemon+ "\n" + "Pokemon " + (i+1) + ":" + pokemons[i].toString();
        }
        return dadosTreinadorPokemon;
    }
    
    public void pokemonsMaisFortes(){
        Pokemon pokemon;
        
        for(int i = 0; i < this.pokemons.length; i++){
            for(int j = 0; j < (this.pokemons.length - 1); j++){
                if(this.pokemons[j].poderTotal() < this.pokemons[j + 1].poderTotal()){
                    pokemon = this.pokemons[j + 1];
                    this.pokemons[j + 1] = this.pokemons[j];
                    this.pokemons[j] = pokemon;
                }
            }
        }
    }
    
    int getArrayLength(){
        return this.pokemons.length;
    }
    
    public Pokemon OneVsOne(int i){
        return this.pokemons[i];
    }
    
    public String getName(){
       return this.nome; 
    }
    
    public void duelar(PokeTrainer pokeTrainer){
        int quantidade;
        int treinador1 = 0;
        int treinador2 = 0;
        this.pokemonsMaisFortes();
        pokeTrainer.pokemonsMaisFortes();
        
        if(this.getArrayLength() > pokeTrainer.getArrayLength()){
            quantidade = pokeTrainer.getArrayLength();
        }
        else{
            quantidade = this.getArrayLength();
        }
        for(int i = 0; i < quantidade; i++){
            this.pokemons[i].duelar(pokeTrainer.OneVsOne(i));
            if(this.pokemons[i].toString().equals(this.pokemons[i].duelar(pokeTrainer.OneVsOne(i)))){
                System.out.println("\nPokemon vencedor da batalha " + (i+1) + ":" + this.pokemons[i].duelar(pokeTrainer.OneVsOne(i)));
                treinador1 = treinador1 + 1;
            }
            else if(this.pokemons[i].duelar(pokeTrainer.OneVsOne(i)).equals("Ocorreu um empate:")){
                System.out.println("\nA batalha de numero " + (i+1) + " ocorreu um empate:");
            }
            else{
                System.out.println("\nPokemon vencedor da batalha " + (i+1) + ":" + this.pokemons[i].duelar(pokeTrainer.OneVsOne(i)));
                treinador2 = treinador2 + 1;
            }
        }
        if(treinador1 > treinador2){
            System.out.println("\nTreinador(a) vencedor(a):" + this.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + pokeTrainer.toString());
        }
        else if(treinador1 == treinador2){
            System.out.println("\nA batalha terminou em empate:");
        }
        else{
            System.out.println("\nTreinador(a) vencedor(a):" + pokeTrainer.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + this.toString());
        }
    }
    
    public void duelar(DigiTrainer digiTrainer){
       int quantidade;
       int treinador1 = 0;
        int treinador2 = 0;
       this.pokemonsMaisFortes();
       digiTrainer.digimonsMaisFortes();
       
       if(this.getArrayLength() > digiTrainer.getArrayLength()){
           quantidade = digiTrainer.getArrayLength();
       }
       else{
           quantidade = this.getArrayLength();
       }
       for(int i = 0; i < quantidade; i++){
           this.pokemons[i].duelar(digiTrainer.OneVsOne(i));
            if(this.pokemons[i].toString().equals(this.pokemons[i].duelar(digiTrainer.OneVsOne(i)))){
                System.out.println("\nPokemon vencedor da batalha " + (i+1) + ":" + this.pokemons[i].duelar(digiTrainer.OneVsOne(i)));
                treinador1 = treinador1 + 1;
            }
            else if(this.pokemons[i].duelar(digiTrainer.OneVsOne(i)).equals("Ocorreu um empate:")){
                System.out.println("\nA batalha de numero " + (i+1) + " ocorreu um empate:");
            }
            else{
                System.out.println("\nDigimon vencedor da batalha " + (i+1) + ":" + this.pokemons[i].duelar(digiTrainer.OneVsOne(i)));
                treinador2 = treinador2 + 1;
            }
        }
        if(treinador1 > treinador2){
            System.out.println("\nTreinador(a) vencedor(a):" + this.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + digiTrainer.toString());
        }
        else if(treinador1 == treinador2){
            System.out.println("\nA batalha terminou em empate:");
        }
        else{
            System.out.println("\nTreinador(a) vencedor(a):" + digiTrainer.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + this.toString());
        }
       
    }

}
