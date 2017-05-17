public class Palavras{
	private Palavra palavras[];
	
	Palavras(){
		palavras = new Palavra[500];
		Palavra um = new Palavra("É um felino", "gato");
		palavras[0] = um;
		Palavra dois = new Palavra("É um réptil", "cobra");
		palavras[1] = dois;
		Palavra tres = new Palavra("É uma fruta vermelha", "maca");
		palavras[2] = tres;
		Palavra quatro = new Palavra("É uma verdura laranja", "cenoura");
		palavras[3] = quatro;
		Palavra cinco = new Palavra("É uma marca de sapato famosa", "nike");
		palavras[4] = cinco;
		Palavra seis = new Palavra("É uma das 7 maravilhas do mundo", "torrepizza");
		palavras[5] = seis;
		Palavra sete = new Palavra("É o maior mamífero da terra", "baleia");
		palavras[6] = sete;
		Palavra oito = new Palavra("É a pedra preciosa mais cara", "diamante");
		palavras[7] = oito;
	}
	
	void setPalavra(Palavra palavra, int i){
		this.palavras[i] = palavra;
	}
	
	Palavra getPalavras(int i){
		return this.palavras[i];
	}
	int getLength(){
		return this.palavras.length;
	}
	
	int palavraAleatoria(){
		int i = 0;
		while(this.palavras[i] != null){
			i += 1;
		}
		int number = (int) Math.round(1 * Math.random() * i);
		
		return number;
	}
}
