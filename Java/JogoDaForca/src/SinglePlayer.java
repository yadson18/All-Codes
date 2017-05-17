import java.util.*;

public class SinglePlayer{
	public static void singlePlayer(Players players, Palavras palavras){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\nProcure seu nome para jogar:");
		String name = leitor.next();
		
		int number;
		for(int i = 0; i < players.getLength();){
			if(name.equals(players.getPlayer(i))){
				number = i;
				System.out.println("\nBem vindo(a) " + players.getPlayer(number));
			}
			else{
				if(players.getPlayer(i) == null){
				//	i = 0;
					System.out.println("\nAinda não encontramos nada, deseja retornar ao menu? (s/n):");
					char opcao = leitor.next().charAt(0);
					if(opcao == 's'){
						return;
					}
					else{
						System.out.println("\nProcure seu nome para jogar:");
						name = leitor.next();
					}
				}
				else{
					i++;
				}
			}
		}
		
		
	}
}
