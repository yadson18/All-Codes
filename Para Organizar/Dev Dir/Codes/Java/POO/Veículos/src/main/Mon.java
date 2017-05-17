package main;

abstract class Mon{
	private String apelido;
	private int poderInicial;
	private int experienciaAtual;

	Mon(String apelido, int poderInicial, int experienciaAtual){
		this.apelido = apelido;
		this.poderInicial = poderInicial;
		this.experienciaAtual = experienciaAtual;
	}

	void setApelido(String apelido){
		this.apelido = apelido;
	}
	void setPoderInicial(int poderInicial){
		this.poderInicial = poderInicial;
	}
	void setExperienciaAtual(int experienciaAtual){
		this.experienciaAtual = experienciaAtual;
	}	

	String getApelido(){
		return this.apelido;
	}
	int getPoderInicial(){
		return this.poderInicial;
	}
	int getExperienciaAtual(){
		return this.experienciaAtual;
	}
}