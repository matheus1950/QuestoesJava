

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		int quantidade;
		int i = 0;
		double soma = 0;
		Character tipo;
		String nome;
		double renda;
		double funcionarios;
		double gastoSaude;
		ArrayList <Contribuinte>lista = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of tax payers:");
		
		quantidade = scan.nextInt();
		
		while(i < quantidade) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.println("Individual or company (i/c)?");
			tipo = scan.next().charAt(0);
			System.out.println("Name:");
			nome = scan.next();
			System.out.println("Anual income:");
			renda = scan.nextDouble();
			if(tipo.equals('i')) {
				System.out.println("Health expenditures:");
				gastoSaude = scan.nextDouble();	
				Contribuinte contribuinte = new PessoaFisica(nome, renda, gastoSaude);
				lista.add(contribuinte);
			}
			else {
				System.out.println("Number of employees:");
				funcionarios = scan.nextDouble();
				Contribuinte contribuinte = new PessoaJuridica(nome, renda, funcionarios);
				lista.add(contribuinte);
			}
			i++;
		}
		
		for(Contribuinte cont:lista) {
			System.out.println(cont.getNome() + ": $" + cont.calculoImposto());
			soma += cont.calculoImposto();
		}
		
		System.out.println(soma);
		
		
	}

}
