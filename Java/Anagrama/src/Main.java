import java.util.*;

public class Main{
	
	public static String removeAcento(String s) { 
		String aux = new String(s); 
		aux = aux.replaceAll("[ÈÉÊË]","E"); 
		aux = aux.replaceAll("[ÛÙ]","U"); 
		aux = aux.replaceAll("[ÏÎ]","I"); 
		aux = aux.replaceAll("[ÀÂ]","A"); 
		aux = aux.replaceAll("Ô","O"); 
		return aux; 
	}
	
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);

		String text1 = leitor.next().toUpperCase();
		text1 = removeAcento(text1);
		String text2 = leitor.next().toUpperCase();
		text2 = removeAcento(text2);
		
		if(text1.length() == text2.length()){
			char t1[] = new char[text1.length()];
			char t2[] = new char[text2.length()];
			
			for(int i = 0; i < text1.length(); i++){
				t1[i] = text1.charAt(i);
				t2[i] = text2.charAt(i);
			}
			Arrays.sort(t1);
			Arrays.sort(t2);
			
			text1 = "";
			text2 = "";
			for(int j = 0; j < t1.length; j++){
				text1 += text1 + t1[j];
				text2 += text2 + t2[j];
			}
			
			if(text1.equals(text2)){
				System.out.println("\n1");
			}
			else{
				System.out.println("\n0");
			}
		}
		else{
			System.out.println("\n0");
		}
	}
}
