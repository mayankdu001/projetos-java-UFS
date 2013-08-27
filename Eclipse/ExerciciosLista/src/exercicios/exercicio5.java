package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero1, numero2;
		System.out.println("informe o primeiro numero");
		numero1 = ler.nextInt();
		System.out.println("informe o segundo numero");
		numero2 = ler.nextInt();

		System.out.println("SOMA: " + (numero1 + numero2));

	}

}
