import java.util.*;

public class Main{
	public static void main(String[] args){
		int a[] = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = 0;
		}
		//a[0] = 2;
		if(a[0] == 0){
			System.out.println("Zero");
		}
		for(int i = 0; i < a.length; i++){
			
			System.out.println(a[i]);
		}
	}
}
