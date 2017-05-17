public class Players{
	private Player players[];
	
	Players(){
		this.players = new Player[500];
	}
	
	void setPlayer(Player player, int i){
		this.players[i] = player;
	}
	
	Player getPlayer(int i){
		return this.players[i];
	}
	int getLength(){
		return this.players.length;
	}
}
