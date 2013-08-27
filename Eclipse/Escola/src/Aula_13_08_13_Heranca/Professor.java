package Aula_13_08_13_Heranca;

import java.util.Scanner;

public class Professor extends Funcionario {
	private String turma;

	public Professor(String nome, String cpf, int idade, char sexo,
			int matricula, String cargo, double salario, String email,
			String turma) {

		super(nome, cpf, idade, sexo, matricula, cargo, salario, email);
		this.turma = turma;

	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void mudarTurma(String turma) {

		if (!(this.turma.equals(turma))) {
			this.turma = turma;
		} else {
			System.out.println("turma ja alocada a esse professor");
		}

	}

	public void imprimirDados() {

		System.out.println("Matricula: " + getMatricula());
		System.out.println("Nome; " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Salario: " + getSalario());
		System.out.println("Email: " + getEmail());
		System.out.println("turma: " + turma);

	}

	public boolean consultarProfessor(int matriculaTest) {

		if (matriculaTest == getMatricula()) {
			imprimirDados();
			return true;
		}
		return false;
	}


}
