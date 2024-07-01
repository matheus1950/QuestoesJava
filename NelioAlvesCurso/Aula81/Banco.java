package Questao;

public class Banco {
	private int numeroDaConta;
	private String nomeTitular;
	private double saldo;
	
	public Banco(int numeroDaConta, String nomeTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		this.saldo = depositoInicial;
	}
	
	public Banco(int numeroDaConta, String nomeTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		if(valor > 0)
			saldo -= valor + 5;
		else
			System.out.println("Valor de saque menor ou igual a 0!");
	}
	

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String toString() {
		return "Dados atualizados da conta\nConta: " + numeroDaConta + ", Titular: " + nomeTitular + ", Saldo: " + saldo;
	}
	
	
}
