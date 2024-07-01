package Aula93;

public class Quarto {
	private int numeroDoQuarto;
	private String email;
	private String nome;
	
	
	public Quarto(int numeroDoQuarto, String email, String nome) {
		this.numeroDoQuarto = numeroDoQuarto;
		this.email = email;
		this.nome = nome;
	}
	
	public Quarto() {
		
	}
	
	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}
	
	public void setNumeroDoQuarto(int numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
