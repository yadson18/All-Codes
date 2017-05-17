import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o tipo de veiculo, nome do veiculo, modelo, tipo de carro, capacidade da mala e a quantidade de portas:");
		String tipoDeVeiculo = leitor.next();
		String nomeDoVeiculo = leitor.next();
		String modelo = leitor.next();
		String tipoDeCarro = leitor.next();
		int capacidadeDaMala = leitor.nextInt();
		int quantidadeDePortas = leitor.nextInt();
		Carro carro = new Carro(tipoDeVeiculo, nomeDoVeiculo, modelo, tipoDeCarro, capacidadeDaMala, quantidadeDePortas);

		System.out.println(carro.toString());
	}
}