import java.util.*;
public class PlayerCadastro{
	public static void playerCadastro(Players players){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String name = leitor.next();
		System.out.println("Digite sua idade:");
		int idade = leitor.nextInt();
		
		Player player = new Player(name, idade);
		
		for(int i = 0; i < players.getLength();){
			if(players.getPlayer(i) == null){
				players.setPlayer(player, i);
			}
			else{
				i++;
			}
		}
	}
}
