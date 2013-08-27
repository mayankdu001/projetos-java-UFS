package exerciciosP2PrimeiraLista;

import java.util.Scanner;

public class repeticao4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, idade, cont = 0;

		do {
			cont++;
			System.out.println("informe a idade");
			idade = ler.nextInt();
			if (idade == 0) {
				cont--;
				break;
			}
			soma += idade;

		} while (idade != 0);
     if (cont == 0) {
		System.out.println("não foi cadastrado nunguem");
	}
     else{
		System.out.println("media:" + soma / cont);
     }
	}

}
