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
public class DigiTrainerGroup {
   private String partyName;
   private DigiTrainer[] digiTrainerParty;
   
   DigiTrainerGroup(String partyName){
       this.partyName = partyName;
       this.digiTrainerParty = new DigiTrainer[3];
   }
   
   void addDigiTrainer(DigiTrainer digiTrainer, int i) {
        this.digiTrainerParty[i] = digiTrainer;
    }
    
    String getPartyName(){
        return this.partyName;
    }
    
    DigiTrainer getTrainer(int i){
        return digiTrainerParty[i];
    }
    
    void duelar(PokeTrainerGroup pokeTrainerGroup) {
        for(int i = 0; i < this.digiTrainerParty.length; i++){
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("Treinador " + (i+1) + " do grupo (" + this.getPartyName() + ") VS Treinador " + (i+1) +" do grupo (" + pokeTrainerGroup.getPartyName() + "):");
            this.digiTrainerParty[i].duelar(pokeTrainerGroup.getTrainer(i));
            System.out.println("\n--------------------------------------------------------------------------");
        }
    }

    void duelar(DigiTrainerGroup digiTrainerGroup) {
        for(int i = 0; i < this.digiTrainerParty.length; i++){
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("Treinador " + (i+1) + " do grupo (" + this.getPartyName() + ") VS Treinador " + (i+1) +" do grupo (" + digiTrainerGroup.getPartyName() + "):");
            this.digiTrainerParty[i].duelar(digiTrainerGroup.getTrainer(i));
            System.out.println("\n--------------------------------------------------------------------------");
        }
    }
}
