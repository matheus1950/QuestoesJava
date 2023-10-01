package Aula93;
import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		int numero;
		int numeroQuartos;
		Quarto quarto[] = new Quarto[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados?");
		numeroQuartos = scan.nextInt();
		
		for(int i = 0; i < numeroQuartos; i++) {
			System.out.println("Qual quarto será alugado?");
			numero = scan.nextInt();
			quarto[numero] = new Quarto();
			
			scan.nextLine();
			
			quarto[numero].setNumeroDoQuarto(numero);
			System.out.println("Em nome de:");
			quarto[numero].setNome(scan.nextLine());
			System.out.println("Email:");
			quarto[numero].setEmail(scan.nextLine());
		}
		
		
		System.out.println("Quartos ocupados:");
		
		for(Quarto cont : quarto) {
			if(cont != null)
				System.out.println(cont.getNumeroDoQuarto() + ": " + cont.getNome() + ", " + cont.getEmail());
		}
		
		scan.close();

	}

}
