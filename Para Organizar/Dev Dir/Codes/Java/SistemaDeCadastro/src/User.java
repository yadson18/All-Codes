public class User{
	private String nome;
	private int idade;
	private String login;
	private String password;
	
	User(String nome, int idade, String login, String password){
		this.nome = nome;
		this.idade = idade;
		this.login = login;
		this.password = password;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setIdade(int idade){
		this.idade = idade;
	}
	void setLogin(String login){
		this.login = login;
	}
	void setPassword(String password){
		this.password = password;
	}
	
	String getNome(){
		return this.nome;
	}
	int getIdade(){
		return this.idade;
	}
	String getLogin(){
		return this.login;
	}
	String getPassword(){
		return this.password;
	}
}
