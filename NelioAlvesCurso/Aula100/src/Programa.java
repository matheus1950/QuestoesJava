import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <Funcionario> lista = new ArrayList<Funcionario>();
		
		int quantidade;
		int id;
		String nome;
		double salario;
		double porcentagem;
	
		
		System.out.println("How many employees will be registred?");
		quantidade = scan.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Emplyoee #" + (i + 1));
			System.out.println("Id:");
			id = scan.nextInt();
			System.out.println("Name:");
			scan.nextLine();
			nome = scan.nextLine();
			System.out.println("Salary:");
			salario = scan.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		id = scan.nextInt();
		
		int verificador = 0;
		
		for(Funcionario contador : lista) {
			if(contador.getId() == id) 
				verificador = 1;
		}
		
		if(verificador != 1) {
			System.out.println("The employee id doesn't exist!");
			System.exit(1);
		}
		
		System.out.println("Enter the percentage: ");
		porcentagem = scan.nextDouble();
		
		for(Funcionario contador : lista) {
			if(contador.getId() == id) {
				contador.aumentarSalario(porcentagem);
				verificador = 1;
			}
		}
		
		for(Funcionario contador : lista) {
			System.out.println(contador.toString());
		}
		
		scan.close();
	}

}
