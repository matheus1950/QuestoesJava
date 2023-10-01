package Questao1;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar?");
		int N = scan.nextInt();
		
		int[] vetor = new int[N];
		
		System.out.println("Digite N números:");
		for(int i  = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		
		for(int i : vetor) {
			if(i < 0)
				System.out.println(i);
		}
		
		scan.close();
	}

}
