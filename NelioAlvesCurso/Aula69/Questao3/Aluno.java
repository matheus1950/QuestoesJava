package Questao3;

public class Aluno {
	String nome;
	double nota1, nota2, nota3;
	
	public double notaFinal(){
		return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35;
	}
	
	public String passou() {
		if(notaFinal() >= 60)
			return "PASSOU";
		else
			return "FALHOU\n FALTANDO " + (60 - notaFinal()) + "PONTOS";
	}
	
	public String toString() {
		return "NOTA FINAL = " + notaFinal() + "\n" + passou();
	}
}
