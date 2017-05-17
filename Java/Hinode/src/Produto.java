public class Produto{
	private String nome;
	private int quantidadeProduto;
	private float valorDeCompra;
	private float valorDeVenda;
	private String tipoDoProduto;

	Produto(String nome, int quantidadeProduto, float valorDeCompra, float valorDeVenda, String tipoDoProduto){
		this.nome = nome;
		this.quantidadeProduto = quantidadeProduto;
		this.valorDeCompra = valorDeCompra;
		this.valorDeVenda = valorDeVenda;
		this.tipoDoProduto = tipoDoProduto;
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public int getQuantidadeProduto(){
		return this.quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto){
		this.quantidadeProduto = quantidadeProduto;
	}

	public float getValorDeCompra(){
		return this.valorDeCompra;
	}
	public void setValorDeCompra(float valorDeCompra){
		this.valorDeCompra = valorDeCompra;
	}

	public float getValorDeVenda(){
		return this.valorDeVenda;
	}
	public void setValorDeVenda(float valorDeVenda){
		this.valorDeVenda = valorDeVenda;
	}

	public String getTipoDoProduto(){
		return this.tipoDoProduto;
	}
	public void setTipoDoProduto(String tipoDoProduto){
		this.tipoDoProduto = tipoDoProduto;
	}
	
	public String toString(){
		return "║ Nome do produto: " + this.getNome()  + "\n" +
			   "║ Quantidade em estoque: " + this.getQuantidadeProduto() + "\n" + 
			   "║ Valor de compra: " + this.getValorDeCompra() + "\n" +
			   "║ Valor de venda: " + this.getValorDeVenda() + "\n" +
			   "║ Tipo do produto: " + this.getTipoDoProduto() + "\n" +
			   "╚═════════════════════════════════════════════════════";
	}
}

