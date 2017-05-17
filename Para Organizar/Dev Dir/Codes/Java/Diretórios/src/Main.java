import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		String nome;
		Pasta p = new Pasta("dir");
		Pasta p2 = new Pasta("dir2");
		
		System.out.println("\nDigite o nome do arquivo:");
		nome = leitor.next();
		Arquivo a = new Arquivo(nome);
		p.setArquivo(a);
		p2.setPasta(p);
		System.out.println(p2.toString());
	}
}
