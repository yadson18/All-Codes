import java.util.*;

public class Menu{
	public static void menu(){
		Scanner leitor = new Scanner(System.in);
		Sgbd db = new Sgbd();
		int opcao;
		
		do{
			ImprimirMenu.imprimirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					SinglePlayer.singlePlayer(db);
					break;
				case 2:
					Item it1 = new Item("É um felino.", "gato");
					db.setItem(it1);
					Item it2 = new Item("É um mamífero aquático.", "baleia");
					db.setItem(it2);
					break;
			}
		}
		while(opcao != 0);
	}
}
