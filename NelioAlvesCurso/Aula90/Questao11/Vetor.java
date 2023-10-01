package Questao11;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vai cadastrar?");
		int N = scan.nextInt();
		double menor;
		double maior;
		double somaAlturaMulheres = 0;
		int homens = 0;
		
		
		double[] altura = new double[N];
		char[] genero = new char[N];
		
		for(int i  = 0; i < altura.length; i++) {
			System.out.println("Digite a altura da pessoa " + (i + 1));
			altura[i] = scan.nextDouble();
			scan.nextLine();
			System.out.println("Digite o genero da pessoa(M/F) " + (i + 1));
			genero[i] = scan.nextLine().charAt(0);
			
			if(genero[i] == 'F')
				somaAlturaMulheres += altura[i];
			else if(genero[i] == 'M')
				homens++;
		}
		
		menor = altura[0];
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(altura[j] < altura[i] && altura[j] < menor) {
					menor = altura[j];
				}
			}
		}
		
		System.out.println("Menor altura: " + menor);
		
		maior = altura[0];
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(altura[j] > altura[i] && altura[j] > maior) {
					maior = altura[j];
				}
			}
		}
		
		System.out.println("Maior altura: " + maior);
		System.out.printf("Media de altura das mulheres: %.2f", somaAlturaMulheres/N);
		System.out.println("Número de homens: " + homens);
		
		
		
		
		scan.close();
	}

}
