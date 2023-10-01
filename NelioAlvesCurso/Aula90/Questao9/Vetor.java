package Questao9;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos número serão digitados no vetor?");
		int N = scan.nextInt();
		scan.nextLine();
		int maior = 0, posicao = 0;
		
		String[] vetorNome = new String[N];
		int[] vetorIdade = new int[N];
		
		
		for(int i  = 0; i < vetorNome.length; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1));
			vetorNome[i] = scan.nextLine();
			System.out.println("Digite a idade da pessoa " + (i + 1));
			vetorIdade[i] = scan.nextInt();
			scan.nextLine();
		}
		
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(vetorIdade[j] > vetorIdade[i] && vetorIdade[j] > maior) {
					maior = vetorIdade[j];
					posicao = j;
				}
			}
		}

		
		System.out.println("Pessoa mais velha: " + vetorNome[posicao]);
			
		
		scan.close();
	}

}
