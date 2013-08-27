package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao5 {
	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		String nome, nometest = null;
		int idade = 0, maior = 0;

		do {

			System.out.println("informe o nome");
			nome = ler.next();
			if ((nome.equals("fim"))) {
				break;

			}
			maior = idade;
			System.out.println("informe a idade");
			idade = ler.nextInt();

			if (idade >= maior) {
				nometest = nome;
				maior = idade;

			}

		} while (!(nome.equals("fim")));

		if (maior == 0) {
			System.out.println("nenuma pessoa cadastrada");
		} else {
			System.out.println("nome: " + nometest);
			System.out.println("idade: " + maior);
		}

	}

}
