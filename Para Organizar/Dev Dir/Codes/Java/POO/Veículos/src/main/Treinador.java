package main;

abstract class Treinador{
	private String nome;
	private String sobrenome;
	private int idade;
        private Mon mon[];

	Treinador(String nome, String sobrenome, int idade, int quantidadeDeMonstros){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
                this.mon = new Mon[quantidadeDeMonstros];
	}

	void setNome(String nome){
		this.nome = nome;
	}
	void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	void setIdade(int idade){
		this.idade = idade;
	}
        void setMon(Mon mon){
            this.mon[0] = mon;
        }

	String getNome() {
	 return this.nome; 
	}
	String getSobrenome() {
	 return this.sobrenome; 
	}
	int getIdade() {
	 return this.idade; 
	}
        Mon getMon(int i){
            return this.mon[i];
        }
}