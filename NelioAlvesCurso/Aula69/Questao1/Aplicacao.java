package Questao1;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retângulo:");
		retangulo.largura = scan.nextDouble();
		retangulo.altura = scan.nextDouble();
		
		System.out.println("area : " + retangulo.area());
		System.out.println("diagonal: " + retangulo.diagonal());
		System.out.println("perimetro: " + retangulo.perimetro());
		
		scan.close();
	}

}
