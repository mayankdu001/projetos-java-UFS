import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Gerente {

	public static Tecnico cadastroTecnico(int posicao) {

		Scanner imputDados = new Scanner(System.in);

		int matricula = posicao;

		System.out.println("informe o nome: ");
		String nome = imputDados.next();

		System.out.println("informe a idade");
		int idade = imputDados.nextInt();

		System.out.println("informe o cpf");
		int cpf = imputDados.nextInt();

		System.out.println("infrome o salario");
		double salario = imputDados.nextDouble();

		System.out.println("Informe o bonusSalarial");
		double bonusSalarial = imputDados.nextDouble();

		return new Tecnico(nome, idade, cpf, salario, matricula, bonusSalarial);

	}

	public static Administrativo cadastroAdminist(int posicao) {

		Scanner imputDados = new Scanner(System.in);

		int matricula = posicao;
		double addNoturno = 0;

		System.out.println("informe o nome ");
		String nome = imputDados.next();

		System.out.println("informe a idade");
		int idade = imputDados.nextInt();

		System.out.println("informe o cpf");
		int cpf = imputDados.nextInt();

		System.out.println("informe o salario");
		double salario = imputDados.nextDouble();

		System.out.println("informe o turno");
		String turno = imputDados.next();

		if (turno.equals("noite")) {
			System.out.println("informe o adicional noturno");
			addNoturno = imputDados.nextDouble();

		}

		return new Administrativo(nome, idade, cpf, salario, matricula, turno,
				addNoturno);
	}

	public static void main(String[] args) {
		Scanner imputDados = new Scanner(System.in);
		
		Administrativo newAdm[] = new Administrativo[5];
		
		Tecnico newTec[] = new Tecnico[5];
		
		int op;
		int opcao;
		int posicaoTec = 0;
		int posicaoAdm = 0;

		Administrativo newAdmin[] = new Administrativo[5];
		do {
			System.out.println("1-cadastrar");
			System.out.println("2-exibir dados");
			System.out.println("3-sair");
			System.out.println("informe a opcao");
			opcao = imputDados.nextInt();
			switch (opcao) {

			case 1:
				// cadastro
				do {
					System.out.println("1-assistente tecnico");
					System.out.println("2-assistente administrativo");
					System.out.println("3-voltar ao menu anterior");
					System.out.println("informe a opcao");
					op = imputDados.nextInt();
					switch (op) {

					case 1:
						newTec[posicaoTec++] = cadastroTecnico(posicaoTec);
						break;
					case 2:
						newAdmin[posicaoAdm++] = cadastroAdminist(posicaoAdm);
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

			case 2:
				// impressão de dados
				do {

					System.out.println("1-assistente tecnico");
					System.out.println("2-assistente administrativo");
					System.out.println("3-voltar ao menu anterior");
					System.out.println("informe a opcao");
					op = imputDados.nextInt();
					switch (op) {
					case 1:
						for (int i = 0; i < posicaoTec; i++) {

							newTec[i].exibirDados();
						}
						break;
					case 2:
						for (int i = 0; i < posicaoAdm; i++) {
							newAdmin[i].exibirDados();
						}
						break;
					}

				} while (op != 3);

				break;
			case 3:
				System.out.println("programa finalizado");
				break;
			default:
				System.out.println("opcao invalida");
				break;
			}

		} while (opcao != 3);

	}
}
