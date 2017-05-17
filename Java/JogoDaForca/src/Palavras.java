public class Palavras{
	private Palavra palavras[];
	
	Palavras(){
		palavras = new Palavra[500];
		Palavra um = new Palavra("aaa", "aaa");
		palavras[0] = um;
		Palavra dois = new Palavra("bbb", "bbb");
		palavras[1] = dois;
		Palavra tres = new Palavra("ccc", "ccc");
		palavras[2] = tres;
		Palavra quatro = new Palavra("ddd", "ddd");
		palavras[3] = quatro;
		Palavra cinco = new Palavra("eee", "eee");
		palavras[4] = cinco;
		Palavra seis = new Palavra("fff", "fff");
		palavras[5] = seis;
		Palavra sete = new Palavra("ggg", "ggg");
		palavras[6] = sete;
		Palavra oito = new Palavra("hhh", "hhh");
		palavras[7] = oito;
	}
	
	void setPalavra(Palavra palavra, int i){
		this.palavras[i] = palavra;
	}
	
	Palavra getPalavra(int i){
		return this.palavras[i];
	}
	int getLength(){
		return this.palavras.length;
	}
}
