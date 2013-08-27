package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class RaisSucessiva {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero, cont = 1, i = 1, total = 0;

		System.out.println("informe o numero");
		numero = ler.nextInt();

		total = numero - i;

		while (total > 0) {
			i++;
			if (i % 2 == 0) {
				i++;
				total -= i;
				cont++;

			}

		}
		if (total == 0) {
			System.out.println("raiz = " + cont);
		} else {

			System.out.println("não existe raiz exata");

		}

	}

}
