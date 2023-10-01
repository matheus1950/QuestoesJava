package Questao5;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar?");
		int N = scan.nextInt();
		
		double[] vetor = new double[N];
		
		System.out.println("Digite N números:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextDouble();
		}
		
		double maior = vetor[0];
		int posicao = 0;
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(vetor[j] > vetor[i] && vetor[j] > maior) {
					maior = vetor[j];
					posicao = j;
				}
			}
		}
			
			
		System.out.println("Maior valor = " + maior);
		System.out.println("Posicao do maior valor = " + posicao);
		
		scan.close();
	}

}
