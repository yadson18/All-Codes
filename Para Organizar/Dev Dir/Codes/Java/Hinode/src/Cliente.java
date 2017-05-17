public class Cliente{
	private String nome;
	private String sobrenome;
	private String estado;
	private String cidade;
	private String bairro;
	private String telefone;
	private String email;

	Cliente(String nome, String sobrenome, String estado, String cidade, String bairro, String telefone, String email){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
		this.email = email;
	}
	Cliente(){
		
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public String getEstado(){
		return this.estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getCidade(){
		return this.cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getBairro(){
		return this.bairro;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getTelefone(){
		return this.telefone;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public String toString(){
		return "╔═════════════════════════════════════════════════════\n" +
			   "║ Nome e sobrenome: " + this.getNome() + " " + this.getSobrenome() +"\n" +
			   "║ Estado: " + this.getEstado() +                                    "\n" + 
			   "║ Cidade: " + this.getCidade() + 								    "\n" +
			   "║ Bairro: " + this.getBairro() + 								    "\n" +
			   "║ Telefone: " + this.getTelefone() + 							    "\n" +
			   "║ Email: " + this.getEmail() + 									    "\n" + 
			   "╚═════════════════════════════════════════════════════";
	}
}

