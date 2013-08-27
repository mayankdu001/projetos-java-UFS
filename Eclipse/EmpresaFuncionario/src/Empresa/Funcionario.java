package Empresa;

public class Funcionario {

	private String nome;
	private String cargo;
	private double rendMensal;
	private double rendAnual;
	private double decimoTerceiro;
	private double ferias;

	public Funcionario() {

		nome = null;
		cargo = null;
		rendAnual = 0;
		decimoTerceiro = 0;
		ferias = 0;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setRendMensal(double rendMensal) {
		this.rendMensal = rendMensal;
	}

	public double getRendMensal() {
		return rendMensal;
	}

	public double DecimoTerceiro(double rendimentoMensal) {

		double decimo = rendimentoMensal * 2;

		return decimo;

	}

	public double Umterco(double rendimentoMensal) {

		double ferias = rendimentoMensal + (rendimentoMensal / 3);

		return ferias;

	}

	public double redimentoAnual(double rendimentoMensal) {

		double rendimentoAnual = (rendimentoMensal * 12)
				+ (Umterco(rendimentoMensal) + DecimoTerceiro(rendimentoMensal));

		return rendimentoAnual;
	}

	public void ImprimeDados(double rendimentoMensal) {
		System.out.println("Nome do Funcionario: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salario Mensal: " + rendMensal);
		System.out.println("Ferias: " + Umterco(rendimentoMensal));
		System.out.println("Decimo Terceiro Salario: "
				+ DecimoTerceiro(rendimentoMensal));
		System.out.println("rendimento anual: "
				+ redimentoAnual(rendimentoMensal));
	}

}
