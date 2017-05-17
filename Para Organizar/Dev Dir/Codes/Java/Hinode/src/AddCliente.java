import java.util.*;

public class AddCliente{
	public static void addCliente(DataBase db){
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\nNome e sobrenome do cliente:");
		String nome = leitor.next();
		String sobrenome = leitor.next() + " ";
		System.out.println("\nSigla do estado do cliente (Ex: PE).");
		String estado = leitor.next();
		System.out.println("\nCidade:");
		String cidade = leitor.nextLine() + " ";
		System.out.println("Bairro:");
		String bairro = leitor.nextLine() + " ";
		System.out.println("\nDDD + Telefone do cliente (Ex: (81)98343-5908).");
		String telefone = leitor.next();
		System.out.println("\nEmail do cliente (Ex: example@hotmail.com).");
		String email = leitor.next();
		Cliente cliente = new Cliente(nome, sobrenome, estado, cidade, bairro, telefone, email);
		db.setCliente(cliente);
		System.out.println("\n\nCliente " + cliente.getNome() + " " + cliente.getSobrenome() + " cadastrado com sucesso.");
	}
}
