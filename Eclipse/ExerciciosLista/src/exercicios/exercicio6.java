package exercicios;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero1, numero2, quaciente;

		System.out.println("informe o primeiro numero");
		numero1 = ler.nextDouble();
		System.out.println("informe o segundo numero");
		numero2 = ler.nextDouble();

		System.out.println("divisor: " + numero1);
		System.out.println("dividendo: " + numero2);
		System.out.println("quanciente: " + (numero1 / numero2));
		System.out.println("resto: " + (numero1 % numero2));

	}

}
