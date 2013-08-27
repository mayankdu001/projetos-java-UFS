package Aula_13_08_13_Heranca;

import java.util.Scanner;

public class Escola {

	public static Professor cadastroProfessor() {

		System.out.println("informe a matricula");
		int matricula = new Scanner(System.in).nextInt();
		System.out.println("inforem o nome");
		String nome = new Scanner(System.in).next();
		System.out.println("informe a turma");
		String turma = new Scanner(System.in).next();
		System.out.println("informe o cpf");
		String cpf = new Scanner(System.in).next();
		System.out.println("informe a idade");
		int idade = new Scanner(System.in).nextInt();
		System.out.println("informe o sexo");
		char sexo = new Scanner(System.in).next().charAt(0);
		System.out.println("informe o cargo");
		String cargo = new Scanner(System.in).next();
		System.out.println("informe o salario");
		double salario = new Scanner(System.in).nextDouble();
		System.out.println("informe o email");
		String email = new Scanner(System.in).next();

		return new Professor(nome, cpf, idade, sexo, matricula, cargo, salario,
				turma, email);
	}

	public static Aluno cadastroAluno() {
		System.out.println("informe a matricula");
		int matriculaAluno = new Scanner(System.in).nextInt();
		System.out.println("inforem o nome");
		String nomeAluno = new Scanner(System.in).next();
		System.out.println("informe o cpf");
		String cpfAluno = new Scanner(System.in).next();
		System.out.println("informe a idade");
		int idadeAluno = new Scanner(System.in).nextInt();
		System.out.println("informe o sexo");
		char sexoAluno = new Scanner(System.in).next().charAt(0);
		System.out.println("informe a media");
		double media = new Scanner(System.in).nextDouble();

		return new Aluno(nomeAluno, cpfAluno, idadeAluno, sexoAluno,
				matriculaAluno, media);

	}

	public static void menuPrincipal() {

		System.out.println("1-cadastrar");
		System.out.println("2-consultar ");
		System.out.println("3- excluir");
		System.out.println("4-alterar");
		System.out.println("5-sair");

	}

	public static void menuSecundario() {
		System.out.println("1- Professor");
		System.out.println("2- Aluno");
		System.out.println("3- Voltar o menu anterior");
	}

	public static void main(String[] args) {
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);

		Professor newProfessor[] = new Professor[10];
		Aluno newAluno[] = new Aluno[10];

		int matriculaTest;
		int posicao = 0;
		int opcao;
		int op;

		int posicaoAluno = 0;
		int posicaoProfessor = 0;

		do {
			menuPrincipal();
			System.out.println("informe a opcao");
			opcao = imputNumeros.nextInt();
			switch (opcao) {
			case 1:
				// cadastro
				do {

					menuSecundario();
					System.out.println("informe a opcao");
					op = imputNumeros.nextInt();

					switch (op) {
					case 1:

						newProfessor[posicaoProfessor++] = cadastroProfessor();

						break;
					case 2:

						newAluno[posicaoAluno++] = cadastroAluno();

						break;
					case 3:
						System.out.println("menu principal");
						break;

					default:
						System.out.println("opcao invalida ");
						System.out.println("por favor informe outra opcao");
						break;
					}
				} while (op != 3);
				break;
			case 2:
				// consulta
				do {
					menuSecundario();
					System.out.println("informe a opcao");
					op = imputNumeros.nextInt();

					switch (op) {
					case 1:
						System.out
								.println("Informe a matricula que deseja consultar");
						matriculaTest = imputNumeros.nextInt();
						for (int i = 0; i < posicaoProfessor; i++) {
							newProfessor[i].consultarProfessor(matriculaTest);

						}
						break;

					case 2:
						System.out.println("informe a matricula do aluno");
						matriculaTest = imputNumeros.nextInt();
						for (int i = 0; i < posicaoAluno; i++) {
							newAluno[i].consultarAluno(matriculaTest);
						}
						break;

					case 3:
						System.out.println("menu principal");
						break;

					default:
						System.out.println("opcao invalida");
						break;

					}
				} while (op != 3);

				break;
			case 3:
				// excluir
				do {

					menuSecundario();
					System.out.println("inforem a opcao");
					op = imputNumeros.nextInt();

					switch (op) {

					case 1:
						System.out.println("informe a matricula");
						matriculaTest = imputNumeros.nextInt();

						for (int j = 0; j < posicaoProfessor; j++) {

							// System.out.println(newProfessor[j].consultarProfessor(matriculaTest));

							if (newProfessor[j]
									.consultarProfessor(matriculaTest)) {
								posicao = j;
							}

						}

						for (int i = posicao; i < posicaoProfessor - 1; i++) {
							newProfessor[i] = newProfessor[i + 1];
						}
						System.out.println("Professor Excluido");
						posicaoProfessor--;

						break;
					case 2:
						System.out.println("informe a matricula");
						matriculaTest = imputNumeros.nextInt();
						for (int j = 0; j < posicaoAluno; j++) {

							// System.out.println(newAluno[j].consultarAluno(matriculaTest));
							if

							(newAluno[j].consultarAluno(matriculaTest)) {
								posicao = j;
							}

						}
						for (int i = posicao; i < posicaoAluno - 1; i++) {
							newAluno[i] = newAluno[i + 1];
						}
						System.out.println("Aluno excluido");
						posicaoAluno--;

						break;
					case 3:
						System.out.println("menu principal");
						break;
					default:
						System.out.println("opcao invalida ");
						System.out.println("por favor informe outra opcao");

						break;
					}
				} while (op != 3);
				break;
			case 4:
				// alterar
				menuSecundario();
				System.out.println("informe a opcao");
				op = imputNumeros.nextInt();
				do {

					switch (op) {
					case 1:
						System.out.println("inforem a matricula");
						matriculaTest = imputNumeros.nextInt();
						for (int i = 0; i < posicaoProfessor; i++) {
							System.out.println(newProfessor[i]
									.consultarProfessor(matriculaTest));
							if (newProfessor[i]
									.consultarProfessor(matriculaTest)) {
								posicao = i;
							}

						}

						newProfessor[posicao] = cadastroProfessor();

						break;
					case 2:
						System.out.println("inforem a matricula");
						matriculaTest = imputNumeros.nextInt();
						for (int i = 0; i < posicaoAluno; i++) {
							System.out.println(newAluno[i]
									.consultarAluno(matriculaTest));
							if (newAluno[i].consultarAluno(matriculaTest)) {
								posicao = i;
							}

						}

						newAluno[posicao] = cadastroAluno();

						break;
					case 3:
						System.out.println("menu principal");
						break;
					default:
						System.out.println("opcao invalida ");
						System.out.println("por favor informe outra opcao");

						break;

					}

				} while (op != 3);

				break;
			case 5:
				// fim
				System.out.println("Programa finalizado");
				break;

			default:
				System.out.println("opcao invalida ");
				System.out.println("por favor informe outra opcao");

				break;
			}

		} while (opcao != 5);

	}
}
