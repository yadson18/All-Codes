import java.util.*;

public class Estoque{
	private Calendar data;
	private Produto[] produtos;
	private int top;
	
	Estoque(){
		
		this.produtos = new Produto[500];
		this.top = 0;
	}
	
	int getQuantidadeProdutos(){
		return this.produtos.length;
	}
	boolean getProduto(String nomeProduto){
		boolean emEstoque = false;
		for(int i = 0; i < this.produtos.length;){
			if(this.produtos[i] != null){
				if(!nomeProduto.equals(this.produtos[i])){
					i++;
				}
				else{
					emEstoque = true;
				}
			}
			else{
				break;
			}
		}
		return emEstoque;
	}
	
	void setProduto(Produto produto, int quantidadeDoProduto){
		this.produtos[this.top] = produto;
		produto.setCodigo(this.top + 1);
		produto.setQuantidade(quantidadeDoProduto);
		this.top++;
	}
}
