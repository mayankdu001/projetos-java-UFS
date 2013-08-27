package Aula_13_08_13_Heranca;


public class Funcionario extends Pessoa {

	private int matricula;
	private String cargo;
	private double salario;
	private String email;

	public Funcionario(String nome, String cpf, int idade, char sexo,
			int matricula, String cargo, double salario, String email) {

		super(nome, cpf, idade, sexo);

		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.email = email;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setEmail(String email) {

		this.email = email.toLowerCase();
	}

	public String getEmail() {

		return email.toLowerCase();
	}

	public double calcularAlmentoSalario(double taxa) {

		setSalario(getSalario() + (getSalario() * (taxa / 100)));

		return getSalario();
	}

	public double decimoTerceiro() {
		double decimo;
		decimo = getSalario() * 2;

		return decimo;
	}

}
