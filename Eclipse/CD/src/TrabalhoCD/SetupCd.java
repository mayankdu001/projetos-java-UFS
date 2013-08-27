package TrabalhoCD;

import java.util.Scanner;



public class SetupCd {

	public static void cadastro(Cd newCd[], int i) {

		Scanner imputDados = new Scanner(System.in);

		Scanner imputNumero = new Scanner(System.in);

		newCd[i] = new Cd();
		System.out.println("Cd: " + (i + 1));
		System.out.println("informe o nome do CD");
		newCd[i].setNome(imputDados.next());
		System.out.println("informe o nome do cantor");
		newCd[i].setCantor(imputDados.next());
		System.out.println("informe  o nome da Gravadora");
		newCd[i].setGravadora(imputDados.next());
		System.out.println("informe o tempo de duracao");
		newCd[i].setTempoDuracao(imputNumero.nextDouble());
		System.out.println("informe o estilo ");
		newCd[i].setEstilo(imputDados.next());
		System.out.println("informe o preco do CD");
		newCd[i].setPreco(imputNumero.nextDouble());
		System.out.println("informe o ano de lancamento");
		newCd[i].setAnoLancamento(imputDados.next());

	}

	public static void menu() {
		System.out.println("1-Exibir Dados");
		System.out.println("2-Exibir cd's Lancados em determinado ano");
		System.out.println("3-reajustar valor dos cds");
		System.out.println("4-sair");
		System.out.println("informe a opcao");

	}

	public static void main(String[] args) {

		Scanner imputDados = new Scanner(System.in);

		Scanner imputNumero = new Scanner(System.in);

		boolean test = false;
		String testData;
		double taxa;
		int opcao;
		// int op;
		// int posicao = 0;

		Cd newCd[] = new Cd[2];

		for (int i = 0; i < newCd.length; i++) {

			cadastro(newCd, i);
		}
		do {

			menu();
			opcao = imputNumero.nextInt();

			switch (opcao) {
			case 1:
				// imprimir dados

				for (int i = 0; i < newCd.length; i++) {
					newCd[i].imprimirDados();
				}
				break;
			case 2:
				// Exibir cd's Lancados em determinado ano
				System.out.println("informe o ano que deseja consultar");
				testData = imputDados.next();
				for (int i = 0; i < newCd.length; i++) {
					if (testData.equals(newCd[i]
							.retornarAnoLancamento(testData))) {
						test = true;
					}
				}
				if (test) {
					for (int i = 0; i < newCd.length; i++) {
						if (testData.equals(newCd[i]
								.retornarAnoLancamento(testData))) {

							newCd[i].imprimirDados();

						}

					}

					for (int i = 0; i < newCd.length; i++) {
						if (testData.equals(newCd[i]
								.retornarAnoLancamento(testData))) {
							System.out.println("Ano de Lancamento: "
									+ newCd[i].retornarAnoLancamento(testData));
						}
					}
				} else {
					System.out.println("Data n�o confere");
				}
				break;

			case 3:
				// reajustar valor dos cds
				System.out.println("informe a taxa ");
				taxa = imputNumero.nextDouble();
				for (int i = 0; i < newCd.length; i++) {
					newCd[i].reajusteCd(taxa);
				}
				System.out.println("Taxa Calculada");
				System.out.println("valor reajustado");
				break;
			case 4:
				System.out.println("programa finalzado");
				break;

			default:
				System.out.println("opcao invalida");
				System.out.println("Informa a opcao desejada");
				break;
			}

		} while (opcao != 4);

	}

}