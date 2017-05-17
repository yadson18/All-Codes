package main;

class Pokemon extends Mon{
	private String especie;
	private String tipo;

	Pokemon(String apelido, int poderInicial, int experienciaAtual, String especie, String tipo){
		super(apelido, poderInicial, experienciaAtual);
		this.especie = especie;
		this.tipo = tipo;
	}

	void setEspecie(String especie){
		this.especie = especie;
	}
	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getEspecie(){
		return this.especie;
	}
	String getTipo(){
		return this.tipo;
	}

	public String toString(){
		return "\nApelido: " + this.getApelido() + "\n" +
			   "Poder Inicial: " + this.getPoderInicial() + "\n" + 
			   "Experiencia Atual: " + this.getExperienciaAtual() + "\n" + 
			   "Especie: " + this.especie + "\n" +
			   "Tipo: " + this.tipo;
	}
}