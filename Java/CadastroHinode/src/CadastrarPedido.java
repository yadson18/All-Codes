import java.util.*;

public class CadastrarPedido{
	public static void cadastrarPedido(BancoDeDados db, Estoque estoque){
		Scanner leitor = new Scanner(System.in);
		String data;
		String descricao;
		double valorTotal;
		String formaDePagamento;
		int quantidadeDeParcelas;
		double valorDaParcela;
		String dataDePagamento;
		System.out.println("Digite o nome do produto disponível no estoque:");
		String nomeProduto = leitor.nextLine();
		
		//Pedido pedido = new Pedido();
		
		while(estoque.getProduto(nomeProduto) == false){
			System.out.println("Este produto não está disponível no estoque, tente novamente:");
			nomeProduto = leitor.nextLine();
		}
		if(estoque.getProduto(nomeProduto) == true){
			//pedido.setProduto(
		}
		Cliente cliente;
	}
}
