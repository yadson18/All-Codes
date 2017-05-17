public class BancoDeDados{
	private Cliente[] clientes;
	private int topC;
	private Pedido[] pedidos;
	private int topP;
	
	BancoDeDados(){
		this.clientes = new Cliente[100];
		this.topC = 0;
		this.pedidos = new Pedido[100];
		this.topP = 0;
	}
	
	void setCliente(Cliente cliente){
		this.clientes[this.topC] = cliente;
		this.topC++;
	}
	void setPedido(Pedido pedido){
		this.pedidos[this.topP] = pedido;
		this.topP++;
	}
	
	Cliente getCliente(int i){
		return this.clientes[i];
	}
	Pedido getPedido(int i){
		return this.pedidos[i];
	}
	int getTopC(){
		return this.topC;
	}
	int getTopP(){
		return this.topP;
	}
}
