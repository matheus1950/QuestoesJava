package Questao8;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos número vai ter cada vetor?");
		int N = scan.nextInt();
		int pares = 0;
		int soma = 0;
		int[] vetor = new int[N];
		
		
		System.out.println("Digite N números em A:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
			if(vetor[i] % 2 == 0) {
				pares += 1;
				soma += vetor[i];
			}
		}
		
		if(pares == 0)
			System.out.println("NENUM NÚMERO PAR!");
		else
			System.out.printf("MEDIA DOS PARES: %.1f", (double)soma/pares);
		
		scan.close();
	}

}
