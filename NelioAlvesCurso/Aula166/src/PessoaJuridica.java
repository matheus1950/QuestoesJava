
public class PessoaJuridica extends Contribuinte{
	private double numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, double numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public double getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(double numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calculoImposto() {
		if(this.getNumeroFuncionarios() > 10)
			return (0.14 * this.getRendaAnual());
		else 
			return (0.16 * this.getRendaAnual());
	}
}
