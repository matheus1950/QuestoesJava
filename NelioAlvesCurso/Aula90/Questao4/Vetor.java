package Questao4;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar?");
		int N = scan.nextInt();
		int soma = 0;
		
		int[] vetor = new int[N];
		
		System.out.println("Digite N números:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		
		System.out.print("Valores pares: ");
		for(int i : vetor) {
			if(i % 2 == 0) {
				System.out.printf("%d ", i);
				soma += 1;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares = " + soma);
		
		scan.close();
	}

}
