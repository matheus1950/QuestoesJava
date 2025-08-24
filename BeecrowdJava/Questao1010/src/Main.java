import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;	
 
public class Main {
 
     public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "USA"));
		double decimal[] = new double[2], valor;
		int int1, int2[] = new int[2];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            int1 = scan.nextInt();
            int2[i] = scan.nextInt();
            
            decimal[i] = scan.nextDouble();
        }
        
        valor = int2[0] * decimal[0] + int2[1] * decimal[1];
    
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
        
        scan.close();    
    }
 
}