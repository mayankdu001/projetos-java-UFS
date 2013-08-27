package Aula_13_08_13_Heranca;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private int matricula;
	private double media;

	public Aluno(String nome, String cpf, int idade, char sexo, int matricula,
			double media) {
		super(nome, cpf, idade, sexo);

		this.matricula = matricula;
		this.media = media;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public void imprimirDados() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome; " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Media: " + media);

	}

	public boolean consultarAluno(int matriculaTest) {

		if (matriculaTest == matricula) {
			imprimirDados();
			return true;
		}
		return false;

	}

	public static void cadastroAluno(Aluno newAluno[], int i) {
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);

		
		System.out.println("Aluno: " + (i + 1));
		System.out.println("informe a matricula do aluno");
		newAluno[i].setMatricula(imputNumeros.nextInt());

		System.out.println("informe o nome do aluno");
		newAluno[i].setNome(imputDados.next());

		System.out.println("informe o cpf do aluno");
		newAluno[i].setCpf(imputNumeros.next());

		System.out.println("informe a idade do aluno");
		newAluno[i].setIdade(imputNumeros.nextInt());

		System.out.println("informe o sexo [M]asculino   [F]eminino");
		newAluno[i].setSexo(imputDados.next().charAt(0));

		System.out.println("informe a media do aluno");
		newAluno[i].setMedia(imputNumeros.nextDouble());

	}

}
