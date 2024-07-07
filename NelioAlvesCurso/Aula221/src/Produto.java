
public class Produto {
	private String nome;
	private double preço;
	
	public Produto(String nome, double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preço=" + preço + "]";
	}
	
	
	
}
