public class ListarClientes{
	public static void listarClientes(DataBase db){
		for(int i = 0; i < db.getTopCliente(); i++){
			System.out.println(db.getCliente(i).toString());
		}
	}
}
