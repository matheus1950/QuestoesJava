import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;	
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "USA"));
		double salario, vendas;
        
        Scanner scan = new Scanner(System.in);
        
        scan.nextLine();
        
        salario = scan.nextDouble();
        
        vendas = scan.nextDouble();
        
        salario = salario + (0.15 * vendas);
        
        System.out.printf("TOTAL = R$ %.2f\n", salario);
        
        scan.close();    
    }
 
}