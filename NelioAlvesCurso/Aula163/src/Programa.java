import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		int quantidade;
		String nome;
		double preco;
		double taxa;
		String dataFabricacao;
		char tipo;
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		System.out.println("Entre com a quantidade de produtos:");
		Scanner scan = new Scanner(System.in);
		quantidade = scan.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Produto comum, usado ou importado(c/u/i)?");
			tipo = scan.next().charAt(0);
			System.out.println("Nome:");
			nome = scan.next();
			System.out.println("Preço:");
			preco = scan.nextDouble();
			if(tipo == 'u') {
				System.out.println("Data de fabricação:");
				dataFabricacao = scan.next();
				ProdutoUsado usado = new ProdutoUsado(nome, preco, dataFabricacao);
				lista.add(usado);
			}
			else if(tipo == 'i') {
				System.out.println("Taxa da Alfândega: ");
				taxa = scan.nextDouble();
				ProdutoImportado importado = new ProdutoImportado(nome, preco, taxa);
				lista.add(importado);
			}
			else {
				Produto produto = new Produto(nome, preco);
				lista.add(produto);
			}
		}
		
		for(Produto contador : lista) {
			System.out.println(contador.toString());
		}
		
		scan.close();
	}

}
