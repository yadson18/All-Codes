import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Nome:");
		String name = leitor.next();
		char crip[] = new char[name.length()];
		int number = (int) Math.round((Math.random() * name.length()) + 1);
		System.out.println(number);
		for(int i = 0; i < name.length(); i++){
			int n = (int) name.charAt(i);
			crip[i] = (char) (n + (number+10));
		}
		
		System.out.println("\n\nDigite a chave:");
		int key = leitor.nextInt();
		System.out.println("");
		for(int j = 0; j < crip.length; j++){
			int n = (int) crip[j];
			char letra;
			int numero;
			if(key < 10){
				numero = 10 - key;
			}
			else{
				numero = key - 10;
			}
			
			if(n < numero){
				letra = (char) (numero - n);
			}
			else{
				letra = (char) (n - numero);
			}
			System.out.print(letra);
		}
	}
}
