import java.util.*;

public class Main{
	public static void main(String[] args){
		int n[] = {89, 97, 100, 115, 111, 110};
		char nome[] = new char[n.length];
		
		for(int i = 0; i < nome.length; i++){
			nome[i] = (char) n[i];
		}
		
		for(int j = 0; j < n.length; j++){
			System.out.print(nome[j]);
		}
	}
}
