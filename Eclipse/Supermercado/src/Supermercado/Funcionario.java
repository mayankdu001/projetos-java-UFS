package Supermercado;

public class Funcionario extends Pessoa {

	private double salario;
	private String turno;
	private String cargo;
 	private double bonus;

	public Funcionario(int matricula, String nome, int idade, char sexo,
			int cpf, int telefone, String endereco, double salario,
			String turno, String cargo, double bonus) {

		super(matricula, nome, idade, sexo, cpf, telefone, endereco);
		this.salario = salario;
		this.turno = turno;
		this.cargo = cargo;
		this.bonus = bonus;

	}

	public Funcionario() {
		super();
		this.salario = 0;
		this.turno = null;
		this.cargo = null;
		this.bonus = 0;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	// saber s o turno � noite ou dia
	public boolean testTurno(String turno) {
		if (turno.equals("noite")) {
			return true;
		}
		return false;
	}

	// calculando o decimo terceiro
	public double decimo() {
		double decimo = salario * 2;
		return decimo;
	}

	// calculando as ferias
	public double ferias() {

		double ferias = (salario / 3) + salario;
		return ferias;
	}

	// calculando o bonus caso o funcionario trabalhe a noite
	public double bonusTurno() {
		double bonus = 0;

		if (testTurno(getTurno())) {

			bonus = salario + getBonus();

		}

		return bonus;
	}

	// calculando o rendimento anual do funcionario a folha de pagamento por ano
	public double rendimentoAnual() {

		double total = (salario * 12) + (decimo() + ferias());
		if (testTurno(getTurno())) {

			total += bonusTurno();
		}

		return total;

	}

	// imprimindo por override os dados
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("ferias: " + ferias());
		System.out.println("decimo: " + decimo());
		System.out.println("rendimento anual: " + rendimentoAnual());
	}
}