import java.util.Scanner;

public class Programa {
	//solução apenas com for each
	public static void main(String[] args) {
		int M; //linhas
		int N; //colunas
		int X;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas:");
		M = scan.nextInt();
		System.out.println("Digite o número de colunas:");
		N = scan.nextInt();
		
		int Matriz[][] = new int[M][N];
		
		System.out.println("Preencha a matriz(de cima para baixo e da esquerda para direita)");
		
		int linhas = 0;
		int colunas = 0;
		
		for(int[] linha : Matriz) {
			for(int coluna : linha) {
				Matriz[linhas][colunas] = scan.nextInt();
				colunas++;
			}
			linhas++;
			colunas = 0;
		}
		
		System.out.println("Digite o número que será pesquisado:");
		X = scan.nextInt();
		
		linhas = 0;
		colunas = 0;
		
		for(int[] linha : Matriz) {
			for(int coluna : linha) {
				if(coluna == X){
					System.out.println("Posição: " + linhas + ", " + colunas + ": ");
					if((colunas-1) >= 0 && (colunas-1) < N )
						System.out.println("Esquerda: " + Matriz[linhas][colunas-1]);
					if((colunas+1 ) >= 0 && (colunas+1) < N)
						System.out.println("Direita: " + Matriz[linhas][colunas+1]);
					if((linhas-1) >= 0 && (linhas-1) < M)
						System.out.println("Cima: " + Matriz[linhas-1][colunas]);
					if((linhas+1) >= 0 && (linhas+1) < M)		
						System.out.println("Baixo: " + Matriz[linhas+1][colunas]);
				}
				colunas++;
			}
			linhas++;
			colunas = 0;
		}
		
		scan.close();

	}

}
