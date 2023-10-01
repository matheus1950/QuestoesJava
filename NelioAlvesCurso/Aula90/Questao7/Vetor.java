package Questao7;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos número serão digitados no vetor?");
		int N = scan.nextInt();
		double soma = 0;
		
		double[] vetor = new double[N];
		
		
		System.out.println("Digite N números no vetor:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma/N;
		
		System.out.printf("Media do vetor = %.3f\n", media);
			
		System.out.println("Elementos abaixo da média:");
		for(double cont : vetor) {
			if(cont < media)
				System.out.println(cont);
		}
		
		scan.close();
	}

}
