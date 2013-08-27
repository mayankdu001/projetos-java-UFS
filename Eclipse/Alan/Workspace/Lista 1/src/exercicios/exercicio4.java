package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		String end;
		int phone;

		System.out.println("informe o nome");
		nome = ler.nextLine();

		System.out.println("informe o endereço");
		end = ler.nextLine();

		System.out.println("informe o telefone");
		phone = ler.nextInt();

		System.out.println("nome: " + nome);
		System.out.println("endereço: " + end);
		System.out.println("telefone: " + phone);

	}

}
