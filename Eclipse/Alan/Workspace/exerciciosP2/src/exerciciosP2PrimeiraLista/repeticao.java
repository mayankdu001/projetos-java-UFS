package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero;
		int i = 1;
		System.out.println("informe o numero");
		numero = ler.nextDouble();

		while (i <= numero) {
			System.out.println(i);
			i++;

		}

	}

}
