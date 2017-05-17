public class Sgbd{
	private Item itens[];
	private int top;
	
	Sgbd(){
		this.itens = new Item[200];
		this.top = 0;
	}
	
	Item getRandomItem(){
		int number = (int) Math.round(Math.random() * 1);
		
		return this.itens[number];
	}
	
	void setItem(Item item){
		this.itens[this.top] = item;
		this.top++;
	}
}
