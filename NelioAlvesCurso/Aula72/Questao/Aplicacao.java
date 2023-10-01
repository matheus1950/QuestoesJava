package Questao;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conversao compra = new Conversao();
		
		System.out.println("Digite o preço do dólar e a quantidade comprada: ");
		compra.precoDolar = scan.nextDouble();
		compra.dolaresComprados = scan.nextDouble();
		
		System.out.println(compra.custoEmReal());
		
		scan.close();
	}

}
