package Empresa;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		// TODO code application logic here

		Scanner input = new Scanner(System.in);

		Scanner inputNumber = new Scanner(System.in);

		Funcionario pessoa = new Funcionario();

		System.out.println("Entre com o nome do funcionario: ");
		pessoa.setNome(input.nextLine());

		System.out.println("Entre com o cargo do funcionario: ");
		pessoa.setCargo(input.nextLine());

		System.out.println("Entre com a renda mensal: ");
		pessoa.setRendMensal(inputNumber.nextDouble());

		pessoa.ImprimeDados(pessoa.getRendMensal());

	}
}
