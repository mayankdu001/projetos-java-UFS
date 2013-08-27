package EmpresaHeranca;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	// extends == a extenção ........

	private String nivel;
	private String cargo;
	private double salario;

	public Funcionario(String nome, char sexo, int cpf, String nivel,
			String cargo, double salario) {

		super(nome, sexo, cpf);

		this.nivel = nivel;
		this.cargo = cargo;
		this.salario = salario;

	}

	public Funcionario() {
		super();
		this.nivel = null;
		this.cargo = null;
		this.salario = 0;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;

	}

	public String getNivel() {
		return nivel;
	}

	public void setCargo(String cargo) {

	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

}
