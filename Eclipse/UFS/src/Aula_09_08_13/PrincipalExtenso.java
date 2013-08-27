package Aula_09_08_13;

import java.util.Scanner;

public class PrincipalExtenso {

	public static void main(String[] args) {
		EscreverExtenso myExtenso = new EscreverExtenso();

		Scanner impNumero = new Scanner(System.in);

		int test;

		System.out.println("informe o numero");
		test = impNumero.nextInt();

		myExtenso.mostra(test);

	}

}
