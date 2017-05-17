public class Player{
	private String nome;
	private int idade;
	private int score;
	
	Player(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		this.score = 0;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setIdade(int idade){
		this.idade = idade;
	}
	void setScore(int score){
		this.score += this.score + score;
	}
	
	String getNome(){
		return this.nome;
	}
	int getIdade(){
		return this.idade;
	}
	int getScore(){
		return this.score;
	}
}
