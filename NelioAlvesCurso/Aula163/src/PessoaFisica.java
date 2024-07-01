
public class PessoaFisica extends Contribuinte{
	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		if(this.getRendaAnual() < 20000)
			return (this.getRendaAnual() * 0.15) - (this.gastosSaude * 0.50);
		else 
			return this.getRendaAnual() * 0.25 - (this.gastosSaude * 0.50);
	}
}
