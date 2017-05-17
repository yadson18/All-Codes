public class Pasta extends Dado{
	private Pasta pastas[];
	private int topPasta;
	private Arquivo arquivos[];
	private int topArquivo;
	
	Pasta(){
		this.pastas = new Pasta[100];
		this.topPasta = 0;
		this.arquivos = new Arquivo[100];
		this.topArquivo = 0;
	}
	
	void addArquivo(Pasta pasta){
		this.pastas[topPasta] = pasta;
		this.topPasta++;
	}
	void addPasta(Arquivo arquivo){
		this.arquivos[topArquivo] = arquivo;
		this.topArquivo++;
		
	}
}
