import java.util.*;

public class SinglePlayer{
	public static void singlePlayer(Players players, Palavras palavras){
		Scanner leitor = new Scanner(System.in);
		int erros = 0;
		int i = 0;
		PlayerCadastro.playerCadastro(players);

		while (players.getPlayer(i) != null){
			i++;
		}
		if (players.getPlayer(i) == null){
			i = i - 1;
			System.out.println("\nBem vindo(a) e bom jogo " + players.getPlayer(i).getNome());
		}

		int number = palavras.palavraAleatoria();
		int indiceAtual = 0;
		char letras[] = new char[palavras.getPalavras(number).getLength()];
		while (erros < 6){
			if(indiceAtual == letras.length){
					char palavra2[] = new char[palavras.getPalavras(number).getLength()];
				for(int indice = 0; indice < letras.length; indice++){
					palavra2[indice] = palavras.getPalavras(number).getPalavra().charAt(indice);
				}
				Arrays.sort(palavra2);
				Arrays.sort(letras);
				String word1 = "";
				String word2 = "";
				for(int indice2 = 0; indice2 < palavra2.length; indice2++){
					word1 += palavra2[indice2];
					word2 += letras[indice2];
				}
				if(word1.toLowerCase().equals(word2.toLowerCase())){
					System.out.println("\nAcertou, a palavra é " + palavras.getPalavras(number).getPalavra());
				}
				else{
					System.out.println("Errou :/");
				}
				number = palavras.palavraAleatoria();
			}
			System.out.println("\nDica: " + palavras.getPalavras(number).getDica());
			System.out.println("\nDigite a letra");
			char letra = leitor.next().charAt(0);
			if (palavras.getPalavras(number).comparacao(letra) > 0){
				System.out.println("\nLetra correta:");
				for (int j = indiceAtual; j < (indiceAtual + palavras.getPalavras(number).comparacao(letra)); j++){
					System.out.println("\n" + j + " letra " + letra);
					letras[j] = letra;
					indiceAtual += 1;
					System.out.println(j);
				}
			}
			else{
				erros++;
				System.out.println("\nLetra incorreta " + (6 - erros) + " tentativas restantes:");
			}
		}
		System.out.println("\nGame over :v ");
	}
}
