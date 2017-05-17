import java.util.*;

public class SinglePlayer{
	public static void singlePlayer(Sgbd db){
		Scanner leitor = new Scanner(System.in);
		Item item = db.getRandomItem();
		char palavra[] = new char[item.getPalavra().length()];
		int top = 0;

		while(top != palavra.length){
			System.out.println("\n" + item.getDica());
			System.out.println("\nDigite uma letra.");
			char letra = leitor.next().charAt(0);
			boolean check = false;
			for(int ind = 0; ind < palavra.length;){
				if(letra == palavra[ind]){
					check = true;
					break;
				}
				else{
					ind++;
				}
			}
			if(check == false){
		 		if(item.checkPalavra(letra) > 0){
					int qtdLetras = item.checkPalavra(letra);
					for(int i = 0; i < qtdLetras; i++){
						palavra[top] = letra;
					}
					top += qtdLetras;
					System.out.println("\n" + qtdLetras + " letra(s) (" + letra + ") encontrada(s).");
		 		}
				else{
					System.out.println("\nLetra " + letra + " não foi encontrada.");
				}
			}
			else{
				System.out.println("\nA letra " + letra + " já foi digitada.");
				letra = leitor.next().charAt(0);
			}
		}

		Arrays.sort(palavra);
		char palavra2[] = item.convSort(item.getPalavra());
		/*for(int a = 0; a < palavra2.length; a++){
			System.out.println(palavra2[a] + "       " + palavra[a]);
		}*/

		if(item.cmp(palavra, palavra2) == true){
			System.out.println("Parabéns, você acertou.");
		}
		else{
			System.out.println("Você errou.");
		}
	}
}
