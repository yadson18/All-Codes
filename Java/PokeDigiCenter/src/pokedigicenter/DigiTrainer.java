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
public class DigiTrainer {

    private String nome;
    private String sobrenome;
    private int idade;

    private Digimon[] digimons;

    public DigiTrainer(String nome, String sobrenome, int idade, int quantidadeDigimons) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.digimons = new Digimon[quantidadeDigimons];
    }

    public void addDigimon(Digimon digimon, int i) {
        this.digimons[i] = digimon;
    }

    public void digimonsMaisFortes() {
        Digimon digimon;

        for (int i = 0; i < this.digimons.length; i++) {
            for (int j = 0; j < (this.digimons.length - 1); j++) {
                if (this.digimons[j].poderTotal() < this.digimons[j + 1].poderTotal()) {
                    digimon = this.digimons[j + 1];
                    this.digimons[j + 1] = this.digimons[j];
                    this.digimons[j] = digimon;
                }
            }
        }
    }

    int getArrayLength() {
        return this.digimons.length;
    }

    public Digimon OneVsOne(int i) {
        return this.digimons[i];
    }

    public String getName() {
        return this.nome;
    }

    public String toString() {
        String dadosTeinadorDigimon = "\nNome e sobrenome: " + this.nome + " " + this.sobrenome + "\n"
                + "Idade: " + this.idade + "\n";
        for (int i = 0; i < this.digimons.length; i++) {
            dadosTeinadorDigimon = dadosTeinadorDigimon + "\n" + "Digimon " + (i + 1) + ":" + digimons[i].toString();
        }
        return dadosTeinadorDigimon;
    }

    public void duelar(PokeTrainer pokeTrainer) {
        int quantidade;
        int treinador1 = 0;
        int treinador2 = 0;
        this.digimonsMaisFortes();
        pokeTrainer.pokemonsMaisFortes();

        if (this.getArrayLength() > pokeTrainer.getArrayLength()) {
            quantidade = pokeTrainer.getArrayLength();
        } else {
            quantidade = this.getArrayLength();
        }
        for (int i = 0; i < quantidade; i++) {
            this.digimons[i].duelar(pokeTrainer.OneVsOne(i));
            if (this.digimons[i].toString().equals(this.digimons[i].duelar(pokeTrainer.OneVsOne(i)))) {
                System.out.println("\nDigimon vencedor da batalha " + (i + 1) + ":" + this.digimons[i].duelar(pokeTrainer.OneVsOne(i)));
                treinador1 = treinador1 + 1;
            } else if (this.digimons[i].duelar(pokeTrainer.OneVsOne(i)).equals("Ocorreu um empate:")) {
                System.out.println("\nA batalha de numero " + (i + 1) + " ocorreu um empate:");
            } else {
                System.out.println("\nPokemon vencedor da batalha " + (i + 1) + ":" + this.digimons[i].duelar(pokeTrainer.OneVsOne(i)));
                treinador2 = treinador2 + 1;
            }
        }
        if (treinador1 > treinador2) {
            System.out.println("\nTreinador(a) vencedor(a):" + this.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + pokeTrainer.toString());
        } else if (treinador1 == treinador2) {
            System.out.println("\nA batalha terminou em empate:");
        } else {
            System.out.println("\nTreinador(a) vencedor(a):" + pokeTrainer.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + this.toString());

        }
    }

    public void duelar(DigiTrainer digiTrainer) {
        int quantidade;
        int treinador1 = 0;
        int treinador2 = 0;
        this.digimonsMaisFortes();
        digiTrainer.digimonsMaisFortes();

        if (this.getArrayLength() > digiTrainer.getArrayLength()) {
            quantidade = digiTrainer.getArrayLength();
        } else {
            quantidade = this.getArrayLength();
        }
        for (int i = 0; i < quantidade; i++) {
            this.digimons[i].duelar(digiTrainer.OneVsOne(i));
            if (this.digimons[i].toString().equals(this.digimons[i].duelar(digiTrainer.OneVsOne(i)))) {
                System.out.println("\nDigimon vencedor da batalha " + (i + 1) + ":" + this.digimons[i].duelar(digiTrainer.OneVsOne(i)));
                treinador1 = treinador1 + 1;
            } else if (this.digimons[i].duelar(digiTrainer.OneVsOne(i)).equals("Ocorreu um empate:")) {
                System.out.println("\nA batalha de numero " + (i + 1) + " ocorreu um empate:");
            } else {
                System.out.println("\nDigimon vencedor da batalha " + (i + 1) + ":" + this.digimons[i].duelar(digiTrainer.OneVsOne(i)));
                treinador2 = treinador2 + 1;
            }
        }
        if (treinador1 > treinador2) {
            System.out.println("\nTreinador(a) vencedor(a):" + this.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + digiTrainer.toString());
        } else if (treinador1 == treinador2) {
            System.out.println("\nA batalha terminou em empate:");
        } else {
            System.out.println("\nTreinador(a) vencedor(a):" + digiTrainer.toString());
            System.out.println("\nTreinador(a) perdedor(a): " + this.toString());

        }
    }
}
