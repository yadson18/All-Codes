import java.util.*;

public class Terminal{
	public static void terminal(){
		Scanner leitor = new Scanner(System.in);
		while(true){
			
			String comand = leitor.next();
			String name = leitor.next();
			System.out.println(comand + " " + name);
		}
	}
}
