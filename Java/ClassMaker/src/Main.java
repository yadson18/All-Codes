import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		MakeClass c = new MakeClass();
		System.out.println("\nDigite o acesso da classe:");
		String acs = leitor.next();
		System.out.println("\nNome da classe:");
		String className = leitor.next();
		System.out.println("\nDigite a quantidade de atributos:");
		int attrSize = leitor.nextInt();
		leitor.nextLine();
		String attrs[] = new String[attrSize];
		for(int i = 0; i < attrSize; i++){
			System.out.println("\nDigite o atributo " + (i+1) + " da classe:");
			attrs[i] = leitor.nextLine();
		}
		c.makeClass(acs, className, attrSize, attrs);
		System.out.println(c.toString());
	}
}
