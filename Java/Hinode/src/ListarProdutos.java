public class ListarProdutos{
	public static void listarProdutos(DataBase db){
		for(int i = 0; i < db.getTopProduto(); i++){
			System.out.println("╔═════════════════════════════════════════════════════\n" +
							   "║ Código do produto: " + (i+1) + "\n" +
							   db.getProduto(i).toString()
							   );
		}
	}
}
