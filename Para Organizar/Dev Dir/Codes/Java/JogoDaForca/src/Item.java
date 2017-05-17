import java.util.*;

public class Item{
	private String dica;
	private String palavra;
	
	Item(String dica, String palavra){
		this.dica = dica;
		this.palavra = palavra;
	}
	
	String getDica(){
		return this.dica;
	}
	String getPalavra(){
		return this.palavra;
	}
	
	void setDica(String dica){
		this.dica = dica;
	}
	void setPalavra(String palavra){
		this.palavra = palavra;
	}
	
	
	int checkPalavra(char letra){
		int qtndLetra = 0;
		
		for(int i = 0; i < this.palavra.length();){
			if(this.palavra.charAt(i) == letra){
				qtndLetra++;
				i++;
			}
			else{
				i++;
			}
		}
		return qtndLetra;
	}
	char[] convSort(String palavra){
		char letras[] = new char[palavra.length()];
		for(int i = 0; i < palavra.length(); i++){
			letras[i] = palavra.charAt(i);
		}
		Arrays.sort(letras);
		
		return letras;
	}
	boolean cmp(char palavra1[], char palavra2[]){
		boolean check;
		String str1 = new String(palavra1);
		String str2 = new String(palavra2);
		
		if(str1.equals(str2)){
			check = true;
		}
		else{
			check = false;
		}
		
		return check;
	}
}
