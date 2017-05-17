class Veiculo{
	private String tipoDeVeiculo;
	private String nomeDoVeiculo;

	Veiculo(String tipoDeVeiculo, String nomeDoVeiculo){
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.nomeDoVeiculo = nomeDoVeiculo;
	}

	void setTipoDeVeiculo(String tipoDeVeiculo){
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
	void setNomeDoVeiculo(String nomeDoVeiculo){
		this.nomeDoVeiculo = nomeDoVeiculo;
	}

	String getTipoDeVeiculo(){
		return this.tipoDeVeiculo;
	}
	String getNomeDoVeiculo(){
		return this.nomeDoVeiculo;
	}
}