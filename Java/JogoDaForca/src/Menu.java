
import java.util.*;public class Menu
{
	public static void menu(){
		Scanner leitor = new Scanner(System.in);
		Players players = new Players();
		Palavras palavras = new Palavras();
		
		int opcao;
		
		do{
			System.out.println("\n*****   Jogo Da Forca   *****");
			System.out.println("** (1) Cadastrar Player    **");
			System.out.println("** (2) Jogar Single Player **");
			System.out.println("** (0) Sair                **");
			System.out.println("*****************************");
			System.out.println("*****  Digite uma opcao *****");
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					PlayerCadastro.playerCadastro(players);
					break;
				case 2:
					SinglePlayer.singlePlayer(players, palavras);
					break;
			}
		}
		while(opcao != 0);
	}
}
