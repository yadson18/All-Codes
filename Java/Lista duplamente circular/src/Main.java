import java.util.*;


/*Please dont change class name, Dcoder 
 and class must not be public*/

//Compiler version JDK 1.8

class No{
	int valor;
	No next;
	No prev;
}

class Main{ 
	public static void main(String args[]){ 
		No iniciar = new No();
		iniciar.next = iniciar;
		iniciar.prev = iniciar;

		No atual = iniciar;

		for(int i = 0; i < 10; i++){
			atual.valor = 10 + i;
			atual.next = new No();
			atual.next.prev = atual;
			System.out.println("prev: " + atual.prev.valor + " valor: " + atual.valor + " next: " + atual.next.valor);
			atual = atual.next;
		}

    }
}
