package Questao10;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos números vai digitar?");
		int N = scan.nextInt();
		scan.nextLine();
		
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		String[] nome = new String[N];
		
		for(int i  = 0; i < nome.length; i++) {
			System.out.println("Digite o nome da pessoa " + (i + 1));
			nome[i] = scan.nextLine();
			System.out.println("Digite as notas da pessoa " + (i + 1));
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("Aprovados: ");
		for(int i = 0; i < nome.length; i++) {
			if((nota1[i] + nota2[i])/2 >= 6)
				System.out.println(nome[i]);
		}
		
		scan.close();
	}

}
