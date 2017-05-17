package main;

class Digimon extends Mon{
	private String nome;

	Digimon(String apelido, int poderInicial, int experienciaAtual, String nome){
		super(apelido, poderInicial, experienciaAtual);
		this.nome = nome;
	}

	void setNome(String nome){
		this.nome = nome;
	}
	String getNome(){
		return this.nome;
	}

	public String toString(){
		return "\nApelido: " + this.getApelido() + "\n" +
			   "Poder Inicial: " + this.getPoderInicial() + "\n" + 
			   "Experiencia Atual: " + this.getExperienciaAtual() + "\n" + 
			   "Nome: " + this.nome;
	}
}