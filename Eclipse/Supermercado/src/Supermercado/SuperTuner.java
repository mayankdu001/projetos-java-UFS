package Supermercado;

import java.util.Scanner;

public class SuperTuner {

	public static Funcionario cadastroFuncionario(int posicaoFunc) {
		// cadastrando funcionario
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);

		int matricula = posicaoFunc;
		System.out.println("infrorme o nome do fundionario");
		String nome = imputDados.next();

		System.out.println("informe a idade do funcionario");
		int idade = imputNumeros.nextInt();

		System.out.println("infrome o sexo ");
		char sexo = imputDados.next().charAt(0);

		System.out.println("informe o cpf");
		int cpf = imputNumeros.nextInt();

		System.out.println("informe o telefone");
		int telefone = imputNumeros.nextInt();

		System.out.println("informe o endereco");
		String endereco = imputDados.next();

		System.out.println("informe o salario");
		double salario = imputNumeros.nextDouble();

		System.out.println("informe o turno de trabalho");
		String turno = imputDados.next();

		System.out.println("informe o cargo");
		String cargo = imputDados.next();

		double bonus = 0;
		if (turno.equals("noite")) {
			bonus = imputNumeros.nextDouble();
		}

		return new Funcionario(matricula, nome, idade, sexo, cpf, telefone,
				endereco, salario, turno, cargo, bonus);

	}

	public static void alterarFuncionario(Funcionario vetFuncionario[],
			int posicao) {
		// alterando dados do funcionario
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);

		int matriculaTest;

		System.out.println("informe a matricula para a pesnquisa");
		matriculaTest = imputNumeros.nextInt();
		if (vetFuncionario[posicao].getMatricula() == matriculaTest) {

			vetFuncionario[posicao].exibirDados();
			System.out.println();
			System.out.println("alterando dados");

			vetFuncionario[posicao] = cadastroFuncionario(posicao);
		}

	}

	public static void consultarFuncionario(Funcionario vetFuncionario[],
			int posicao) {
		// metodo de consulta de funcionario

		Scanner imputNumero = new Scanner(System.in);

		int matriculaTest;

		System.out
				.println("informe a matricula do funcionario q deseja consultar ");
		matriculaTest = imputNumero.nextInt();

		if (vetFuncionario[posicao].getMatricula() == matriculaTest) {
			vetFuncionario[posicao].exibirDados();
		}
	}

	public static void excluirFuncionario(Funcionario vetFuncionario[],
			int posicao) {
		Scanner imputNumero = new Scanner(System.in);
		int matriculaTest;
		int op;
		System.out
				.println("informe a matricula do funcionario q deseja excluir");
		matriculaTest = imputNumero.nextInt();
		if (vetFuncionario[posicao].getMatricula() == matriculaTest) {

			vetFuncionario[posicao].exibirDados();

			System.out.println("deseja exluir o funiocnario");
			System.out.println("1 - OK");
			System.out.println("2 - Cancelar");
			op = imputNumero.nextInt();
			if (op == 1) {
				for (int i = 0; i < posicao; i++) {

					vetFuncionario[i] = vetFuncionario[i + 1];

				}

			} else {
				System.out.println("funcionario n�o foi excluido");
			}

		}
	}

	public static Cliente cadastroCliente(int posicaoClie) {

		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);
		int matricula = posicaoClie;

		System.out.println("informe o nome: ");
		String nome = imputDados.next();

		System.out.println("informe a idade");
		int idade = imputNumeros.nextInt();

		System.out.println("informe o sexo");
		char sexo = imputDados.next().charAt(0);

		System.out.println("informe o cpf");
		int cpf = imputNumeros.nextInt();

		System.out.println("infome o telefone ");
		int telefone = imputNumeros.nextInt();

		System.out.println("infomre o endereco");
		String endereco = imputDados.next();

		System.out.println("informe o rendimento");
		double rendimento = imputNumeros.nextDouble();

		System.out.println("informe o limite de compras");
		double limite = imputNumeros.nextDouble();

		return new Cliente(matricula, nome, idade, sexo, cpf, telefone,
				endereco, rendimento, limite);

	}

	public static void alterarCliente(Cliente vetCliente[], int posicao) {
		Scanner imputNumero = new Scanner(System.in);

		System.out.println("informe a matricula do cliente que desja alterar");
		int matriculaTest = imputNumero.nextInt();

		if (vetCliente[posicao].getMatricula() == matriculaTest) {

			vetCliente[posicao].exibirDados();

			System.out.println();
			System.out.println("Alterando dados");

			vetCliente[posicao] = cadastroCliente(posicao);
		}

	}

	public static void consultarCliente(Cliente vetCliente[], int posicao) {
		Scanner imputNumero = new Scanner(System.in);

		System.out
				.println("informe a matricula do Cliente que deseja consultar");
		int matriculaTest = imputNumero.nextInt();

		if (vetCliente[posicao].getMatricula() == matriculaTest) {

			vetCliente[posicao].exibirDados();

		}

	}

	public static void excluirCliente(Cliente vetCliente[], int posicao) {

		Scanner imputNumero = new Scanner(System.in);
		System.out
				.println("informe a matricula do Cliente que deseja consultar");
		int matriculaTest = imputNumero.nextInt();
		if (vetCliente[posicao].getMatricula() == matriculaTest) {

			vetCliente[posicao].exibirDados();

			System.out.println("Deseja Excluir Funcionario");
			System.out.println("1- OK");

			System.out.println("2 - Cancelar");
			int op = imputNumero.nextInt();
			if (op == 1) {
				for (int i = 0; i < posicao; i++) {
					vetCliente[i] = vetCliente[i + 1];
				}
			} else {
				System.out.println("Cliente n�o foi Excluido");
			}
		}

	}

	public static void compraCliente(Cliente vetCliente[], int posicao) {
		Scanner imputNumero = new Scanner(System.in);
		System.out
				.println("infrme a matricula do cliente q esta realizado a compra");

		int matriculaTest = imputNumero.nextInt();

		if (vetCliente[posicao].getMatricula() == matriculaTest) {
			System.out.println("informe o valor da compra");
			double valorTest = imputNumero.nextDouble();

			if (vetCliente[posicao].testCompra(valorTest)) {

				vetCliente[posicao].setValorCompra(valorTest);

			} else {
				System.out.println("valor acima do limite");
			}
		}
	}

	// public static void PagamentoCliente(Cliente ){

	// }

	public static Fornecedor cadastroFornecedor(int posicaoForn) {
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumeros = new Scanner(System.in);
		int matricula = posicaoForn;
		System.out.println("informe o nome ");
		String nome = imputDados.next();

		System.out.println("informe o CNPJ");
		int cnpj = imputNumeros.nextInt();

		System.out.println("informe o telefone");
		int telefone = imputNumeros.nextInt();

		System.out.println("informe o endereco");
		String endereco = imputDados.next();

		System.out.println("1- Liquido");
		System.out.println("2- Solido");
		System.out.println("3- Pereciveis");
		System.out.println("4- N�o Pereciveis");
		System.out.println("inforem o tipo do produto [1] [2] [3] [4]");
		int tipoProduto = imputNumeros.nextInt();

		int idProduto = tipoProduto;

		System.out.println("inforem a quantidade de produto");
		int quantidade = imputNumeros.nextInt();

		return new Fornecedor(matricula, nome, telefone, endereco, cnpj,
				tipoProduto, idProduto, quantidade);

	}

	public static void menuPrincipal() {
		System.out.println("1-Funcionario");
		System.out.println("2-Fornecedor");
		System.out.println("3-Cliente");
		System.out.println("4-Sair");
		System.out.println("informe a opcao");

	}

	public static void menuFuncionario() {
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Alterar Dados");
		System.out.println("3 - Consultar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Voltar ao Menu Principal");
		System.out.println("Informe a Opcao");

	}

	public static void menuCliente() {

		System.out.println("1 - Cadastrar");
		System.out.println("2 - Alterar Dados");
		System.out.println("3 - Consultar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Realizar Compra");
		System.out.println("6 - Realizar Pagamento");
		System.out.println("7 - voltar ao menu Principal");
		System.out.println("informe a opcao");

	}

	public static void main(String[] args) {
		Scanner imputDados = new Scanner(System.in);
		Scanner imputNumero = new Scanner(System.in);

		Fornecedor vetFornecedor[] = new Fornecedor[2];
		Funcionario vetFuncionario[] = new Funcionario[2];
		Cliente vetCliente[] = new Cliente[2];
		// posicaoes dos vetores
		int posicaoFun = 0;
		int posicaoFor = 0;
		int posicaoCli = 0;

		int opcaoPrincipal;
		int opSub;

		do {
			menuPrincipal();
			opcaoPrincipal = imputNumero.nextInt();
			switch (opcaoPrincipal) {
			// case do menu peincipal
			case 1:
				// case funcionario
				do {
					menuFuncionario();
					opSub = imputNumero.nextInt();
					switch (opSub) {
					case 1:
						vetFuncionario[posicaoFun++] = cadastroFuncionario(posicaoFun);

						break;

					case 2:
						alterarFuncionario(vetFuncionario, posicaoFun);
						break;
					case 3:
						consultarFuncionario(vetFuncionario, posicaoFun);
						break;
					case 4:
						excluirFuncionario(vetFuncionario, posicaoFun);
						posicaoFun--;
						break;
					case 5:
						System.out.println("Menu Principal");
						break;
					default:

						System.out.println("Opcao Invalida ");
						System.out.println("Informe a Opcao Impressa no Menu");

						break;
					}

				} while (opSub != 5);

				break;

			case 2:
				// case cliente
				do {

					menuCliente();
					opSub = imputNumero.nextInt();
					switch (opSub) {

					case 1:

						vetCliente[posicaoCli++] = cadastroCliente(posicaoCli);

						break;
					case 2:

						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					default:
						break;

					}

				} while (opSub != 7);

				break;
			case 3:
				break;
			case 4:
				System.out.println("Programa Finalizado");
				break;

			default:
				System.out.println("Opcao Invalida ");
				System.out.println("Informe a Opcao Impressa no Menu");
				break;

			}

		} while (opcaoPrincipal != 4);

	}
}
