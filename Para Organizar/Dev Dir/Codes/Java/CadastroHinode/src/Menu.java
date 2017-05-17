import java.util.*;

public class Menu{
	public static void menu(){
		Scanner leitor = new Scanner(System.in);
		BancoDeDados db = new BancoDeDados();
		Estoque estoque = new Estoque();
		
		String produtoNome = "perfume man";
		double valor = 43.5;
		int quantidade = 3;
		Produto p = new Produto(produtoNome, valor);
		estoque.setProduto(p, quantidade);
		
		int opcao; 
		
		do{
			ImprimirMenuPrincipal.imprimirMenuPrincipal();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					CadastrarCliente.cadastrarCliente(db);
					break;
				case 2:
					CadastrarPedido.cadastrarPedido(db, estoque);
					break;
				case 3:
					break;
			}
		}
		while(opcao != 0);
	}
}
