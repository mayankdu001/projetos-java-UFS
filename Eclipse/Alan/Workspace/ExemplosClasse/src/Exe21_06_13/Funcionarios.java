package Exe21_06_13;

public class Funcionarios extends Pessoas {

	private String cargo;
	private double salario;

	public Funcionarios(String f_nome, int f_idade, char f_sexo,
			String f_Cargo, double f_Salario) {
		super(f_nome, f_idade, f_sexo);

		this.cargo = f_Cargo;
		this.salario = f_Salario;

	}

	public Funcionarios() {
		super();// por q o construtos q eu adicionei não possui parametros
		cargo = null;
		salario = 0;
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

}
