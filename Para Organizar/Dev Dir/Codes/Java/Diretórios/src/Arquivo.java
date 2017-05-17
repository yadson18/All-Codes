import java.util.*;

public class Arquivo{
	private String nome;
	private String data;
	private String conteudo;

	Arquivo(String nome){
		this.nome = nome;
		Calendar calendario = Calendar.getInstance();
		this.data = calendario.get(Calendar.DAY_OF_MONTH) + "/" + calendario.get(Calendar.MONTH) + "/" + calendario.get(Calendar.YEAR);
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setConteudo(String conteudo){
		this.conteudo = conteudo;
	}
	
	String getNome(){
		return this.nome;
	}
	String getData(){
		return this.data;
	}
	String getConteudo(){
		return this.conteudo;
	}

	public String toString(){
		return "\n ---------- Arquivo ---------- " +
		       " | Nome:" + this.getNome()+" | " +
			   " | Data:" + this.getData()+" | " +
			   " ----------------------------- ";
	}
}
