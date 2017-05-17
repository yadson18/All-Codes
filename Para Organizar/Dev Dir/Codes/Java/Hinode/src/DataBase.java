public class DataBase{
	private Cliente clientes[];
	private int topCliente;
	private Produto produtos[];
	private int topProduto;
	private Pedido pedidos[];
	private int topPedido;
	
	DataBase(){
		this.clientes = new Cliente[200];
		this.topCliente = 0;
		this.produtos = new Produto[1000];
		this.topProduto = 0;
		this.pedidos = new Pedido[1000];
		this.topPedido = 0;
	}
	
	public void setCliente(Cliente cliente){
		this.clientes[this.topCliente] = cliente;
		this.topCliente++;
	}
	public void setProduto(Produto produto){
		this.produtos[this.topProduto] = produto;
		this.topProduto++;
	}
	public void setPedido(Pedido pedido){
		this.pedidos[this.topPedido] = pedido;
		this.topPedido++;
	}
	
	public int[] acharCliente(String atributo, String busca){
		int dados[] = new int[50];
		for(int i = 0; i < this.topCliente;){
			if(atributo.toLowerCase().equals("nome")){
				if(busca.toLowerCase().equals(this.clientes[i].getNome().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else if(atributo.toLowerCase().equals("sobrenome")){
				if(busca.toLowerCase().equals(this.clientes[i].getSobrenome().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else if(atributo.toLowerCase().equals("estado")){
				if(busca.toLowerCase().equals(this.clientes[i].getEstado().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else if(atributo.toLowerCase().equals("cidade")){
				if(busca.toLowerCase().equals(this.clientes[i].getCidade().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else if(atributo.toLowerCase().equals("bairro")){
				if(busca.toLowerCase().equals(this.clientes[i].getBairro().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else if(atributo.toLowerCase().equals("telefone")){
				if(busca.toLowerCase().equals(this.clientes[i].getTelefone().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
			else{
				if(busca.toLowerCase().equals(this.clientes[i].getEmail().toLowerCase())){
					dados[i] = (i+1);
					i++;
				}
				else{
					i++;
				}
			}
		}
		return dados;
	}
	
	public Cliente getCliente(int i){
		return this.clientes[i];
	}
	public Produto getProduto(int i){
		return this.produtos[i];
	}
	public Pedido getPedido(int i){
		return this.pedidos[i];
	}
	public int getTopCliente(){
		return this.topCliente;
	}
	public int getTopProduto(){
		return this.topProduto;
	}
	public int getTopPedido(){
		return this.topPedido;
	}
}
