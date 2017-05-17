import java.util.*;

public class MenuCliente{
	public static void menuCliente(DataBase db){
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do{
			SubmenuCliente.submenuCliente();
			opcao = leitor.nextInt();
			
			switch(opcao){
				case 1:
					AddCliente.addCliente(db);
					break;
				case 2:
					ListarClientes.listarClientes(db);
					break;
				case 3:
					BuscarCliente.buscarCliente(db);
					break;
			}
		}
		while(opcao != 0);
	}
}
