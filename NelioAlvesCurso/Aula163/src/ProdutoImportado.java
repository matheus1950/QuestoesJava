
public class ProdutoImportado extends Produto{
	
	private double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, double taxa) {
		super(nome, preco);
		taxaAlfandega = taxa;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	@Override
	public String toString() {
		return this.getNome() + " $ " + (taxaAlfandega + this.getPreco()) + " (Taxa Alfandegaria: $ " + taxaAlfandega + ")";
	}
	
}
