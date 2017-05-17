import java.util.*;

public class Pasta{
	private String nome;
	private String data;
	private Arquivo arquivos[];
	private Pasta pastas[];
	
	Pasta(String nome){
		this.nome = nome;
		Calendar calendario = Calendar.getInstance();
		this.data = calendario.get(Calendar.DAY_OF_MONTH) + "/" + calendario.get(Calendar.MONTH) + "/" + calendario.get(Calendar.YEAR);
		this.arquivos = new Arquivo[100];
		this.pastas = new Pasta[50];
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setArquivo(Arquivo arquivo){
		for(int i = 0; i < this.arquivos.length;){
			if(this.arquivos[i] == null){
				this.arquivos[i] = arquivo;
			}
			else{
				i++;
			}
		}
	}
	void setPasta(Pasta pasta){
		for(int i = 0; i < this.pastas.length;){
			if(this.pastas[i] == null){
				this.pastas[i] = pasta;
			}
			else{
				i++;
			}
		}
	}
	
	String getNome(){
		return this.nome;
	}
	String getData(){
		return this.data;
	}

	public String toString(){
		String pastasDados = "";
		for(int i = 0; i < this.pastas.length;){
			if(this.pastas[i] != null){
				pastasDados += "\n ---------- Pasta ---------- " +
				               " | Nome: " + this.nome + " | " +
							   " | Data: " + this.data + " | " +
							   " --------------------------- ";
			}
			else{
				break;
			}
		}
		return pastasDados;
	}
	
	public String toStringAll(){
		String pastasData = "";
		String arquivosData = "";
		for(int i = 0; i < this.arquivos.length;){
			if(this.arquivos[i] != null){
				arquivosData += this.arquivos.toString();
			}
			else{
				break;
			}
		}
		for(int i = 0; i < this.pastas.length;){
			if(this.pastas[i] != null){
				pastasData += this.pastas.toString();
			}
			else{
				break;
			}
		}
		return pastasData + "\n" + arquivosData;
	}
}
