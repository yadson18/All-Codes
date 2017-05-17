import java.util.*;

public class AddProduto{
	public static void addProduto(DataBase db){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do produto:");
		String nome = leitor.nextLine() + " ";
		System.out.println("\nTipo do produto (Ex: Perfume).");
		String tipoDoProduto = leitor.nextLine() + " ";
		System.out.println("\nQuantidade em estoque:");
		int quantidadeProduto = leitor.nextInt();
		System.out.println("\nValor de compra (Ex: 50,25).");
		float valorDeCompra = leitor.nextFloat();
		System.out.println("\nValor de venda (Ex: 65,00).");
		float valorDeVenda = leitor.nextFloat();
		Produto produto = new Produto(nome, quantidadeProduto, valorDeCompra, valorDeVenda, tipoDoProduto);
		db.setProduto(produto);
		System.out.println("\n" + tipoDoProduto +  nome + "cadastrado com sucesso.");
	}
}
