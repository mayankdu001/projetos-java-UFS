package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {

	public static void cadastrarFilho(Arvore arv) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome Do peste");
		String filho = ler.next();

		arv.insere(null, filho, 'D');

	}

	public static void cadastrarPaiMAe(Arvore arv) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome do filho q deseja inserir os pais");
		String nome = ler.next();

		System.out.println("nome do pai");
		String pai = ler.next();

		System.out.println("nome Mae");
		String mae = ler.next();

		Node noFilho = arv.procura(nome);

		arv.insere(noFilho, pai, 'D');
		arv.insere(noFilho, mae, 'E');

	}

	public static void cadastrarPai(Arvore arv) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome do filho q deseja inserir os pais");
		String nome = ler.next();

		System.out.println("nome do pai");
		String pai = ler.next();

		Node noFilho = arv.procura(nome);

		arv.insere(noFilho, pai, 'D');

	}

	public static void cadastroMae(Arvore arv) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do filho q deseja inserir os pais");
		String nome = ler.next();

		System.out.println("nome Mae");
		String mae = ler.next();

		Node noFilho = arv.procura(nome);

		arv.insere(noFilho, mae, 'E');

	}

	public static void cadastroArvore(Arvore arv) {

		Scanner ler = new Scanner(System.in);
		System.out.println("1- cadastrar pai e Mãe");
		System.out.println("2 - Cadastrar Pai");
		System.out.println("3 - Cadastrar Mãe");
		System.out.println("Informe a opção");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:

			cadastrarPaiMAe(arv);

			break;
		case 2:

			cadastrarPai(arv);
			break;
		case 3:
			cadastroMae(arv);
			break;
		}
	}

	public static void mostrar(Arvore arv) {
		Scanner ler = new Scanner(System.in);
		int tipo = 0;
		System.out.println("1-Pre-ordem ");
		System.out.println("2- Exibir Pai ");
		System.out.println("3 - Exibir Avós");

		try {
			System.out.println("Informe a forma de ordem q deseja exibir");
			tipo = ler.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Opção Invalida");
			return;
		}
		System.out.println("Informe o nome do cidadao");
		String nome = ler.next();
		Node no = arv.procura(nome);
		switch (tipo) {
		case 1:
			arv.preOrdemRec(no);

			break;
		case 2:
			try {
				Node paiEMae = arv.procura(nome);

				if (paiEMae.temFilhoDir()) {

					System.out.println(paiEMae.getFilhoDir().nome);

				} else {
					System.out.println("não tem pai ");
				}

				if (paiEMae.temFilhoEsq()) {
					System.out.println(paiEMae.getFilhoEsq().nome);
				} else {
					System.out.println("não tem Mãe ");
				}
			} catch (NullPointerException e) {
				System.out.println("Esse Individuoo não Existe");
			}
			break;
		case 3:

			try {
				Node pai = arv.procura(nome);

				if (pai.temFilhoEsq()) {
					Node avosMae = arv.procura(pai.getFilhoEsq().nome);
					System.out
							.println("###############################################");
					System.out.println("Mae: " + pai.getFilhoDir().nome);
					System.out
							.println("#######################################");
					if (avosMae.temFilhoDir()) {

						System.out.println("Avos Maternos");
						System.out.println(avosMae.getFilhoDir().nome);
						System.out.println(avosMae.getFilhoEsq().nome);
						System.out
								.println("#######################################");
						System.out.println();

					} else {
						System.out.println("Não tem avós Maternos");
					}

				} else {
					System.out.println("não tem Mae");
				}

				if (pai.temFilhoDir()) {
					Node avosPai = arv.procura(pai.getFilhoDir().nome);
					System.out
							.println("#######################################");

					System.out.println("Pai: " + pai.getFilhoDir().nome);
					if (avosPai.temFilhoEsq()) {
						System.out
								.println("#######################################");
						System.out.println("Avos Paternos");
						System.out.println(avosPai.getFilhoDir().nome);
						System.out.println(avosPai.getFilhoEsq().nome);
						System.out
								.println("#######################################");

					} else {
						System.out.println("Não tem Avós Paternos");

					}

				} else {
					System.out.println("Não tem pai");
				}

			} catch (NullPointerException e) {
				System.out.println("Esse individuoo não Existe");
			}
			break;
		case 0:
			System.out.println("opção não mostrada");
			break;
		}

	}

	public static void mostrarAtual(Arvore arv) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o nome do cidadão");
		String nome = ler.next();
		try {
			Node no = arv.procura(nome);

			System.out.println("Nome: " + no.nome);
			System.out.println("Decendencia: " + no.dec + " De: "
					+ arv.getRaiz().nome);
		} catch (NullPointerException e) {
			System.out.println("Não cidadão aqui");
		}

	}

	public static void menu() {

		System.out.println();
		System.out.println("###############################");

		System.out.println("1-Cadastrar");
		System.out.println("2-Remover");
		System.out.println("3-Mostrar");
		System.out.println("4-Mostrar Atual");
		System.out.println("0-sair");

		System.out.println("###############################");
		System.out.println();
		System.out.println("informe a opcao");

	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Arvore arv = new Arvore();
		int cabou = 0;

		do {
			menu();
			cabou = ler.nextInt();
			switch (cabou) {
			case 1:
				if (arv.estaVazia()) {
					cadastrarFilho(arv);
				} else {
					cadastroArvore(arv);
				}

				break;
			case 2:
				arv.excluir();

				// System.out.println("ainda em reforma");

				break;
			case 3:
				mostrar(arv);
				break;
			case 4:
				mostrarAtual(arv);
				break;
			default:
				break;
			}

		} while (cabou != 0);
	}
}
