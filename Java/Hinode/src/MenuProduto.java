import java.util.*;

public class MenuProduto{
	public static void menuProduto(DataBase db){
		Scanner leitor = new Scanner(System.in);
		int opcao;
		do{
			SubmenuProduto.submenuProduto();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					AddProduto.addProduto(db);
					break;
				case 2:
					ListarProdutos.listarProdutos(db);
					break;
			}
		}
		while(opcao != 0);
	}
}
