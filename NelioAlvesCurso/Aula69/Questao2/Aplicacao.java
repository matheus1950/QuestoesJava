package Questao2;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Empregado empregado = new Empregado();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite nome, salário e taxa de imposto do empregado(nesta ordem):");
		empregado.nome = scan.next();
		empregado.salarioBruto = scan.nextDouble();
		empregado.taxa = scan.nextDouble();
		
		
		System.out.println("Digite o percentual de incremento salarial:");
		double taxa = scan.nextDouble();
		empregado.incrementarSalario(taxa);
		
		System.out.println(empregado);
		
		scan.close();
		}
}
