package Questao1;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (largura * altura) * 2;
	}
	
	public double diagonal() {
		return	Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	/*public String toString() {
		return "Area: " +  area() + ", Perimetro: " + perimetro() + ", Diagonal: " + diagonal();
	}*/
}
