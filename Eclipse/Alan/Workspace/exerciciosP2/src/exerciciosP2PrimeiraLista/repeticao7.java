package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, y;

		do {
			System.out.println("cordenada X");
			x = ler.nextInt();
			if (x == 0) {
				System.out.println("programa finalizado");

				break;

			}
			System.out.println("conrdenada Y");
			y = ler.nextInt();

			if (x > 0 & y >= 0) {
				System.out.println(x + " " + y + "primeiro quadrante");
				break;
			}
			if (x < 0 & y >= 0) {
				System.out.println(x + " " + y + "segundo quadrante");
				break;

			}
			if (x < 0 & y < 0) {
				System.out.println(x + " " + y + "terceiro quadrante");
				break;

			}
			if (x > 0 & y < 0) {
				System.out.println(x + " " + y + "quarto quadrante");
				break;

			}

		} while (x != 0);

	}

}
