package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int op, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, contvn = 0, contb = 0;
		do {
			System.out.println("1-Primeiro Candidato");
			System.out.println("2-Segundo Candidato");
			System.out.println("3-Terceiro Candidato");
			System.out.println("4-Quarto Candidato");
			System.out.println("5-voto nulo");
			System.out.println("6-voto em branco");
			System.out.println("0-sair");
			System.out.println("informe a opcao de voto");
			op = ler.nextInt();
			if (op == 0) {

				break;
			}
			switch (op) {
			case 1:
				cont1++;

				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			case 4:
				cont4++;
				break;
			case 5:
				contvn++;
				break;
			case 6:
				contb++;
				break;
			case 0:
				System.out.println("programa finalizado");

				break;

			default:
				System.out.println("opcao invalida");
				break;
			}
		} while (op != 0);
		if (cont1 == 0 & cont2 == 0 & cont3 == 0 & cont4 == 0 & contb == 0
				& contvn == 0) {
			System.out.println("nenhum candidato cadastrado");
		} else {

			System.out.println("total de votos");
			System.out.println("primeiro candidato: " + cont1);
			System.out.println("segundo candidato: " + cont2);
			System.out.println("terceiro candidato: " + cont3);
			System.out.println("quarto candidato: " + cont4);
			System.out.println("votos brancos: " + contb);
			System.out.println("votos nulos: " + contvn);
		}

	}

}
