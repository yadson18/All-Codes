public class Produto{
	private int codigo;
	private String produtoNome;
	private double valor;
	private int quantidade;
	
	Produto(String produtoNome, double valor){
		this.codigo = 0;
		this.produtoNome = produtoNome;
		this.valor = valor;
		this.quantidade = 0;
	}
	
	void setCodigo(int codigo){
		this.codigo = codigo;
	}
	void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
}
