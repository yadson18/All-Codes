public class Pedido{
	private Cliente cliente;
	private Produto produtos[];
	private int topProduto;
	private double totalAPagar;
	private int quantidadeDeParcelas;
	private double valorDasParcelas;
	private String dataDoPedido;
	private String dataDeEntrega;
	
	Pedido(Cliente cliente, int quantidadeDeParcelas, String dataDoPedido, String dataDeEntrega){
		this.cliente = cliente;
		this.produtos = new Produto[50];
		this.topProduto = 0;
		this.totalAPagar = 0;
		this.quantidadeDeParcelas = quantidadeDeParcelas;
		this.valorDasParcelas = 0;
		this.dataDoPedido = dataDoPedido;
		this.dataDeEntrega = dataDeEntrega;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}

	public Produto getProduto(int i){
		return this.produtos[i];
	}
	public void setProduto(Produto produto){
		this.produtos[this.topProduto] = produto;
		this.topProduto++;
	}
	
	public int getTopProduto(){
		return this.topProduto;
	}

	public double getTotalAPagar(){
		return this.totalAPagar;
	}
	public void setTotalAPagar(){
		double valor = 0;
		for(int i = 0; i < this.getTopProduto(); i++){
			valor += this.getProduto(i).getValorDeVenda();
		}
		this.totalAPagar = valor;
	}

	public int getQuantidadeDeParcelas(){
		return this.quantidadeDeParcelas;
	}
	public void setQuantidadeDeParcelas(int quantidadeDeParcelas){
		this.quantidadeDeParcelas = quantidadeDeParcelas;
	}

	public double getValorDasParcelas(){
		return this.valorDasParcelas;
	}
	public void setValorDasParcelas(){
		this.valorDasParcelas = this.getTotalAPagar() / this.getQuantidadeDeParcelas();
	}

	public String getDataDoPedido(){
		return this.dataDoPedido;
	}
	public void setDataDoPedido(String dataDoPedido){
		this.dataDoPedido = dataDoPedido;
	}

	public String getDataDeEntrega(){
		return this.dataDeEntrega;
	}
	public void setDataDeEntrega(String dataDeEntrega){
		this.dataDeEntrega = dataDeEntrega;
	}
}
