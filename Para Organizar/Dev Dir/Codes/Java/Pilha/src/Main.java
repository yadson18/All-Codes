import java.util.*;

class Item{
	int valor[];
	int ultimo;
	
	Item(){
		this.valor = new int[5];
		this.ultimo = 0;
	}
	
	void addItem(int n){
		if(this.ultimo == this.valor.length){
			System.out.println("\nA pilha está cheia.");
			return;
		}
		else{
			this.valor[this.ultimo++] = n;
		}
	}
	
	String removeItem(){
		this.ultimo -= 1;
		String resu = "";
		if(this.ultimo == 0){
			resu = this.valor[this.ultimo] + "\n\nA pilha está vazia.";
		}
		else{
			resu += this.valor[this.ultimo];
		}
		return resu;
	}
}
public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		Item it = new Item();
		
		for(int i = 0; i < it.valor.length; i++){
			it.addItem(i+1);
			System.out.println(i+1);
		}
		
		for(int i = 0; i < it.valor.length; i++){
			System.out.println("\n" + it.removeItem());
		}
		
		for(int i = 0; i < 20; i++){
			it.addItem(i+1);
			System.out.println(i+1);
		}

		for(int i = 0; i < it.valor.length; i++){
			System.out.println("\n" + it.removeItem());
		}
	}
}
