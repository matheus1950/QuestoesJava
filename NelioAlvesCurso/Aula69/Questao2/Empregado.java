package Questao2;

public class Empregado {
	String nome;
	double salarioBruto;
	double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void incrementarSalario(double percentual) {
		salarioBruto += (percentual/100) * salarioBruto;
	}
	
	public String toString() {
		return "Empregado : " + nome + ", $ " + salarioLiquido();
	}
}
