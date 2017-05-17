import java.util.*;

public class BuscarCliente{
	public static void buscarCliente(DataBase db){
		Scanner leitor = new Scanner(System.in);
		int dados[]; 
		
		System.out.println("Digite um atributo do cliente que procura (Nome, Sobrenome, Estado, Cidade, Bairro, Telefone, Email).");
		String atributo = leitor.next();
		System.out.println("Digite o(a) " + atributo + " do cliente:");
		String busca = leitor.next();
		dados = db.acharCliente(atributo, busca);
		for(int i = 0; i< dados.length; i++){
			if(dados[i] != 0){
				System.out.println(db.getCliente((dados[i]-1)).toString());
			}
		}
	}
}
