package Questao;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int depositoInicialOpcao; 
		Banco cliente;
		
		System.out.println("Entre com número da conta e nome do titular:");
		int numeroConta = scan.nextInt();
		String nome = scan.nextLine();

		System.out.println("Fará Deposito inicial? 1 - Sim, 0 - Não\n");
		depositoInicialOpcao = scan.nextInt();
		
		if(depositoInicialOpcao == 1) {
			System.out.println("Entre com o depósito inicial:");
			double depositoInicial = scan.nextDouble();
			cliente = new Banco(numeroConta, nome, depositoInicial);
		}
		else
			cliente = new Banco(numeroConta, nome);
		
		System.out.println(cliente);
		
		System.out.println("Insira o valor do depósito");
		double deposito = scan.nextDouble();
		cliente.deposito(deposito);
		System.out.println(cliente);
		
		System.out.println("Insira o valor do saque");
		double saque = scan.nextDouble();
		cliente.saque(saque);
		System.out.println(cliente);
		
		scan.close();
	}

}
