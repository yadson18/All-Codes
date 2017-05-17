package main;

class Main{
	public static void main(String[] args) {
                Treinador pT = new PokeTrainer("Yadson", "Matheus", 18, 3);
                pT.setMon(new Pokemon("Drag", 10, 20, "Dragao", "Fogo"));
                
                System.out.println(pT.toString());
	}
}