public class Cliente{
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	Cliente(String nome, String endereco, String telefone, String email){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setEndereco(String endereco){
		this.endereco = endereco;
	}
	void setTelefone(String telefone){
		this.telefone = telefone;
	}
	void setEmail(String email){
		this.email = email;
	}
	
	String getNome(){
		return this.nome;
	}
	String getEndereco(){
		return this.endereco;
	}
	String getTelefone(){
		return this.telefone;
	}
	String getEmail(){
		return this.email;
	}

	public String toString(){
		return "\nNome: " + getNome() + "\n" +
		       "Endereço: " + getEndereco() + "\n" +
			   "Telefone: " + getTelefone() + "\n" +
			   "Email: " + getEmail();
	}
}
