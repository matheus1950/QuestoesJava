package Questao3;
import java.util.Scanner;

public class Vetor {
	
	public void mediaAltura(double somaAltura, int N) {
		System.out.println("A média de altura é: " + somaAltura/N);
	}
	
	public void menosDe16Anos(Pessoa pessoa[], int N) {
		System.out.println();
		int pessoas = 0;
		for(Pessoa cont : pessoa) {
			if(cont.getIdade() < 16) {
				pessoas++;
				System.out.println(cont.getNome());
			}
		}
		System.out.println("Pessoas c/ menos de 16 anos: " + ((double)pessoas/(double)N * 100) + "%");
	}

	public static void main(String[] args) {
		System.out.println("Quantas pessoas serão digitadas?");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		
		Pessoa pessoa[] = new Pessoa[N];
		Vetor vetor = new Vetor();
		double somaAltura = 0;
		
		for(int i = 0; i < N; i++) {
			pessoa[i] = new Pessoa();
			System.out.println("Digite nome, altura e idade da pessoa " + (i+1));
			pessoa[i].setNome(scan.nextLine()); 
			pessoa[i].setAltura(scan.nextDouble());
			pessoa[i].setIdade(scan.nextInt());
			scan.nextLine();
			
			somaAltura += pessoa[i].getAltura();
		}
		
		vetor.mediaAltura(somaAltura, N);
		vetor.menosDe16Anos(pessoa, N);
		
		scan.close();
	}

}
