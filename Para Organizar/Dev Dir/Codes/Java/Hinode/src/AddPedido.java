import java.util.*;

public class AddPedido{
	public static void addPedido(DataBase db){
		Scanner leitor = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("\nDigite o nome do cliente:");
		String nome = leitor.next();
		int cli[] = db.acharCliente("nome", nome);
		if(cli[0] != 0){
			cliente = db.getCliente((cli[0]-1));
			System.out.println("Cliente " + db.getCliente((cli[0]-1)).getNome() + " adicionado:");
		}
		while(cli[0] == 0){
			System.out.println("\nNenhum cliente foi encontrado:");
			nome = leitor.next();
			System.out.println(cli[0]);
			if(cli[0] != 0){
				cliente = db.getCliente(cli[0]);
				System.out.println("Cliente " + db.getCliente(cli[0]).getNome() + " adicionado:");
				break;
			}
		}
		System.out.println("\nDigite a quantidade de parcelas:");
		int quantidadeDeParcelas = leitor.nextInt();
		System.out.println("\nDigite a data do pedido:");
		String dataDoPedido = leitor.next();
		System.out.println("\nDigite a data de entrega do pedido:");
		String dataDeEntrega = leitor.next();
		Pedido pedido = new Pedido(cliente, quantidadeDeParcelas, dataDoPedido, dataDeEntrega);
		
		System.out.println("\nDigite a quantidade de produtos ao pedido:");
		int quantidadeDeProdutos = leitor.nextInt();
		ListarProdutos.listarProdutos(db);
		for(int i = 0; i < quantidadeDeProdutos; i++){
			System.out.println("\nDigite o código do produto (" + (i+1) + "/" + quantidadeDeProdutos + "):");
			int codigoDoProduto = leitor.nextInt();
			pedido.setProduto(db.getProduto(codigoDoProduto-1));
		}
		pedido.setTotalAPagar();
		pedido.setValorDasParcelas();
		
		db.setPedido(pedido);
	}
}
