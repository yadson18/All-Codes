import java.util.*;

public class Menu{
	public static void menu(){
		Scanner leitor = new Scanner(System.in);
		DataBase db = new DataBase();
		int opcao;
		
		do{
			MenuPrincipal.menuPrincipal();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					MenuCliente.menuCliente(db);
					break;
				case 2:
					MenuProduto.menuProduto(db);
					break;
				case 3:
					MenuPedido.menuPedido(db);
					break;
				case 4:
					Cliente cliente1 = new Cliente("Y", "M", "PE", "Iga", "Cen", "123", "y@h.com");
					Cliente cliente2 = new Cliente("I", "M", "PE", "Rec", "S J", "321", "i@h.com");
					Cliente cliente3 = new Cliente("D", "F", "PE", "Pau", "M F", "123", "d@h.com");
					db.setCliente(cliente1);
					db.setCliente(cliente2);
					db.setCliente(cliente3);
					break;
			}
		}
		while(opcao != 0);
	}
}
