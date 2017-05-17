import java.util.*;

public class Menu{
	public static void menu(){
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do{
			System.out.println("\n*****   Sistema  *****");
			System.out.println("** (1) Sing in      **");
			System.out.println("** (2) Sing up      **");
			System.out.println("** (0) Sair         **");
			System.out.println("**********************");
			System.out.println("** Digite uma opcao **");
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					break;
				case 2:
					break;
			}
		}
		while(opcao != 0);
	}
}
