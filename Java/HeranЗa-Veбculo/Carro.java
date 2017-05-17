class Carro extends Veiculo{
	private String modelo;
	private String tipoDeCarro;
	private int capacidadeDaMala;
	private int quantidadeDePortas;

	Carro(String tipoDeVeiculo, String nomeDoVeiculo, String modelo, String tipoDeCarro, int capacidadeDaMala, int quantidadeDePortas){
		super(tipoDeVeiculo, nomeDoVeiculo);
		this.modelo = modelo;
		this.tipoDeCarro = tipoDeCarro;
		this.capacidadeDaMala = capacidadeDaMala;
		this.quantidadeDePortas = quantidadeDePortas;
	}

	void setModelo(String modelo){
		this.modelo = modelo;
	}
	void setTipoDeCarro(String tipoDeCarro){
		this.tipoDeCarro = tipoDeCarro;
	}
	void setCapacidadeDaMala(int capacidadeDaMala){
		this.capacidadeDaMala = capacidadeDaMala;
	}
	void setQuantidadeDePortas(int quantidadeDePortas){
		this.quantidadeDePortas = quantidadeDePortas;
	}

	String getModelo(){
		return this.modelo;
	}
	String getTipoDeCarro(){
		return this.tipoDeCarro;
	}
	int getCapacidadeDaMala(){
		return this.capacidadeDaMala;
	}
	int getQuantidadeDePortas(){
		return this.quantidadeDePortas;
	}

	String toString(){
		return "Tipo de veiculo: " + getTipoDeVeiculo() + "\n" +
			   "Nome do veiculo: " + getNomeDoVeiculo() + "\n" + 
			   "Modelo: " + getModelo() + "\n" +
			   "Tipo de carro: " + getTipoDeCarro() + "\n" + 
			   "Capacidade da mala (em litros): " + getCapacidadeDaMala() + "\n" + 
			   "Quantidade de portas: " + getQuantidadeDePortas();
	}

}