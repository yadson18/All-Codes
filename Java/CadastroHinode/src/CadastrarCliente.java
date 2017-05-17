import java.util.*;
import java.io.*;

public class CadastrarCliente{
	public static void cadastrarCliente(BancoDeDados db){
		Scanner leitor = new Scanner(System.in);
		System.out.println("\nDigite o nome do cliente:");
		String nome = leitor.nextLine();
		System.out.println("\nDigite o endereço:");
		String endereco = leitor.nextLine();
		System.out.println("\nDigite o telefone:");
		String telefone = leitor.next();
		System.out.println("\nDigite o email:");
		String email = leitor.next();
		Cliente cliente = new Cliente(nome, endereco, telefone, email);
		db.setCliente(cliente);
		System.out.println("\nCliente " + db.getCliente(db.getTopC() - 1).getNome() + " cadastrado com sucesso:");
	}
}
