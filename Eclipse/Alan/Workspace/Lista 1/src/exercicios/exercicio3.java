package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);

		int numero1;
		int numero2;

		System.out.println("informe o primeiro numero");
		numero1 = ler.nextInt();
		System.out.println("infore o segundo numero");
		numero2 = ler.nextInt();
		
		
		System.out.println("antecessor: "+(numero1-1));
		
		System.out.println("sucessor: "+(numero2+1));

	}

}
