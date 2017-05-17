import java.util.*;

public class MenuPedido{
	public static void menuPedido(DataBase db){
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do{
			SubmenuPedido.submenuPedido();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					AddPedido.addPedido(db);
					break;
				case 2:
					break;
			}
		}
		while(opcao != 0);
	}
}
