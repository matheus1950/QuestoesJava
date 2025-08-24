	import java.io.IOException;
	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args)  throws IOException{
			Scanner scan = new Scanner(System.in);
			String linha;
			
			do {
				linha = scan.nextLine();
				if (linha.equals("0 0")) break;
				
				String[] partes = linha.split(" ");
	            String digitoFalho = partes[0];
	            String numeroOriginal = partes[1];
	            
				
				if(partes[1].contains(partes[0])) 
					partes[1] = partes[1].replace(partes[0], "");			
				
				if(partes[1].isEmpty() || partes[1].replace("0", "").isEmpty()) {
					System.out.println("0");
				}
				else {				
					partes[1] = partes[1].replaceFirst("^0+", "");					
					System.out.println(partes[1].isEmpty()? "0" : partes[1]);
				}			
			}while(true);
		}
	}
