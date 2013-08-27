package EmpresaHeranca;

public class Cliente extends Pessoa {
	private double rendimento;
	private double crediario;

	public Cliente(String nome, char sexo, int cpf, double rendimento,
			double crediario) {
		super(nome, sexo, cpf);
		this.rendimento = rendimento;
		this.crediario = crediario;
	}

	public Cliente() {
		super();
		this.rendimento = 0;
		this.crediario = 0;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setCrediario(double crediario) {
		this.crediario = crediario;
	}

	public double getCrediario() {
		return crediario;
	}

}
