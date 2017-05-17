import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		int x1, y1, x2, y2, x3, y3, x4, y4;
		int x5, y5, x6, y6, x7, y7;
		
		x1 = leitor.nextInt();
		y1 = leitor.nextInt();
		x2 = leitor.nextInt();
		y2 = leitor.nextInt();
		x3 = leitor.nextInt();
		y3 = leitor.nextInt();
		x4 = leitor.nextInt();
		y4 = leitor.nextInt();
		x5 = leitor.nextInt();
		y5 = leitor.nextInt();
		x6 = leitor.nextInt();
		y6 = leitor.nextInt();
		x7 = leitor.nextInt();
		y7 = leitor.nextInt();
		
		if(((x5 < x3) & (x5 > x1)) & ((y5 > y1) & (y5 < y2)) &   ((x6 < x4) & (x6 > x2)) & ((y6 > y3) & (y6 < y4)) &    ((x7 < x3) & (x7 > x1)) & ((y7 > y3) & (y7 < y4))){
			System.out.println("SIM");
		}
		else{
			System.out.println("NÃO");
		}
	}
}
