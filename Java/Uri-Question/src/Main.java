import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		
		
		System.out.printf("TRIANGULO: %.3f", (a * c) / 2);
		System.out.println("");
		System.out.printf("CIRCULO: %.3f", 3.14159 * (c * c));
		System.out.println("");
		System.out.printf("TRAPEZIO: %.3f", ((a + b) * c) / 2);
		System.out.println("");
		System.out.printf("QUADRADO: %.3f", (b * b));
		System.out.println("");
		System.out.printf("RETANGULO: %.3f", (a * b));
		System.out.println("");
		
	}
}
