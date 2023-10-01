package Questao6;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos número vai ter cada vetor?");
		int N = scan.nextInt();
		
		double[] vetorA = new double[N];
		double[] vetorB = new double[N];
		double[] vetorC = new double[N];
		
		System.out.println("Digite N números em A:");
		for(int i  = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextDouble();
		}
		
		System.out.println("Digite N números em B:");
		for(int i  = 0; i < vetorB.length; i++) {
			vetorB[i] = scan.nextDouble();
		}
		
		
		for(int i  = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
			
		System.out.println("Vetor resultante:");
		for(double cont : vetorC) {
			System.out.println(cont);
		}
		
		scan.close();
	}

}
