public class Palavra{
	private String dica;
	private String palavra;
	
	Palavra(String dica, String palavra){
		this.dica = dica;
		this.palavra = palavra;
	}
	
	void setDica(String dica){
		this.dica = dica;
	}
	void setPalavra(String palavra){
		this.palavra = palavra;
	}
	
	String getDica(){
		return this.dica;
	}
	String getPalavra(){
		return this.palavra;
	}
}
