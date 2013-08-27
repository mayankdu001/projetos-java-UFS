package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, idade, cont = 0;

		while (cont < 10) {
			cont++;
			System.out.println("informe a idade");
			idade = ler.nextInt();

			soma += idade;

		}
		System.out.println("media: " + soma / cont);
	}
}
