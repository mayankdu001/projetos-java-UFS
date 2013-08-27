package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repetição2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero;
		int cont = 1;
		System.out.println("informe o numero");
		numero = ler.nextDouble();

		while (cont <= numero) {
			if (cont % 4 == 0) {
				System.out.println(cont);

			}
			cont++;
		}

	}

}
