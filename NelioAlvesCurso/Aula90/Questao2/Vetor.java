package Questao2;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar?");
		int N = scan.nextInt();
		double soma = 0;
		
		double[] vetor = new double[N];
		
		System.out.println("Digite N números:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextDouble();
		}
		
		System.out.print("Valores: ");
		for(double i : vetor) {
				soma += i;
				System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", soma/N));
		
		scan.close();
	}

}
