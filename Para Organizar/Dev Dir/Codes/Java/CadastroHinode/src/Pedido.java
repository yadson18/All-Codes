import java.util.*;

public class Pedido{
	private String data;
	private String descricao;
	private double valorTotal;
	private String formaDePagamento;
	private int quantidadeDeParcelas;
	private double valorDaParcela;
	private String dataDePagamento;
	private Produto[] produtos;
	private Cliente cliente;
	private int top;
	
	Pedido(String data, String descricao, String formaDePagamento, int quantidadeDeParcelas, double valorDaParcela, String dataDePagamento){
		this.data = data;
		this.descricao = descricao;
		this.valorTotal = 0;
		this.formaDePagamento = formaDePagamento;
		this.quantidadeDeParcelas = quantidadeDeParcelas;
		this.valorDaParcela = valorDaParcela;
		this.dataDePagamento = dataDePagamento;
		this.produtos = new Produto[100];
		this.top = 0;
	}
	
	void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	void setProduto(Produto produto){
		this.produtos[this.top] = produto;
		this.top++;
	}
	
	Produto getProduto(int i){
		return this.produtos[i];
	}
	Cliente getCliente(){
		return this.cliente;
	}
}
