package Questao3;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome e as 3 notas do aluno:");
		aluno.nome = scan.nextLine();
		aluno.nota1 = scan.nextDouble();
		aluno.nota2 = scan.nextDouble();
		aluno.nota3 = scan.nextDouble();
		
		System.out.println(aluno);
		
		scan.close();
	}

}
