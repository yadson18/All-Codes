import java.util.*;

class Item{
	int valor[];
	int primeiro;
	int ultimo;
	
	Item(){
		this.valor = new int[5];
		this.primeiro = 0;
		this.ultimo = 0;
	}
	
	void addItem(int n){
		if((this.ultimo+1) == (this.valor.length)){
			if(this.valor[0] == this.valor[this.primeiro]){
				System.out.println("A fila esta cheia.");
				return;
			}
			else{
				this.valor[0] = n;
				this.ultimo = 0;
			}
		}
		else{
			if(this.valor[0] == 0){
				this.valor[this.ultimo] = n;
			}
			else{
				this.valor[++this.ultimo] = n;
			}
		}
	}
	
	int removeItem(){
		return this.valor[this.primeiro++];
	}
}
public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		Item it = new Item();
		
		for(int i = 0; i < 10; i++){
			System.out.println("\nValor " + (i+1) + ":");
			int n = leitor.nextInt();
			it.addItem(n);
		}
		
		for(int i = 0; i < it.valor.length; i++){
			System.out.println("\nValor " + (i+1) + ": " + it.removeItem());
		}
	}
}
