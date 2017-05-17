
import java.util.Calendar;
import java.util.Scanner;

public class Testa_Metodos_Set_Get_Calendar {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in); 
        
        Calendar c = Calendar.getInstance();
        
        System.out.println("Digite o dia");
        int day = leitor.nextInt();
        System.out.println("Digite o mes");
        int month = leitor.nextInt();
        System.out.println("Digite o ano");
        int year = leitor.nextInt();
        
                c.set(Calendar.DAY_OF_MONTH, day);
                c.set(Calendar.MONTH, month);
                c.set(Calendar.YEAR, year);
        
        System.out.println("Dia/Mes/Ano: " + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
        
    }
}


