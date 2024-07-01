package Questao;

public class Conversao {
	double precoDolar;
	double dolaresComprados;
	static double IOF = 0.06;
	
	public double custoEmReal() {
		double valorDoImposto = (precoDolar * dolaresComprados) * IOF;
		return (precoDolar * dolaresComprados) + valorDoImposto;
	}
}
