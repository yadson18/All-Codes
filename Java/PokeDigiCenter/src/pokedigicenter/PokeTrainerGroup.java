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
public class PokeTrainerGroup {

    private String partyName;
    private PokeTrainer[] pokeTrainerParty;

    PokeTrainerGroup(String partyName) {
        this.partyName = partyName;
        this.pokeTrainerParty = new PokeTrainer[3];
    }

    void addPokeTrainer(PokeTrainer pokeTrainer, int i) {
        this.pokeTrainerParty[i] = pokeTrainer;
    }

    String getPartyName() {
        return this.partyName;
    }
    
    PokeTrainer getTrainer(int i){
        return pokeTrainerParty[i];
    }

    void duelar(PokeTrainerGroup pokeTrainerGroup) {
        for(int i = 0; i < this.pokeTrainerParty.length; i++){
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("Treinador " + (i+1) + " do grupo (" + this.getPartyName() + ") VS Treinador " + (i+1) +" do grupo (" + pokeTrainerGroup.getPartyName() + "):");
            this.pokeTrainerParty[i].duelar(pokeTrainerGroup.getTrainer(i));
            System.out.println("\n--------------------------------------------------------------------------");
        }
    }

    void duelar(DigiTrainerGroup digiTrainerGroup) {
        for(int i = 0; i < this.pokeTrainerParty.length; i++){
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("Treinador " + (i+1) + " do grupo (" + this.getPartyName() + ") VS Treinador " + (i+1) +" do grupo (" + digiTrainerGroup.getPartyName() + "):");
            this.pokeTrainerParty[i].duelar(digiTrainerGroup.getTrainer(i));
            System.out.println("\n--------------------------------------------------------------------------");
        }
    }
}
