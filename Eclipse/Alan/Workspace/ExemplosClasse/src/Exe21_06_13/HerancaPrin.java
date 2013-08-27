package Exe21_06_13;

import java.util.Scanner;
import java.util.Set;

public class HerancaPrin {

	public static void main(String[] args) {
		Gerentes gerente = new Gerentes();
		Scanner impNome = new Scanner(System.in);
		Scanner impNumero = new Scanner(System.in);

		System.out.println("informe o nome ");
		gerente.setNome(impNome.next());
		System.out.println("informe a idade");
		gerente.setIdade(impNome.nextInt());
		System.out.println("informe o sexo [M]asculino [F]eminino");
		gerente.setSexo(impNome.next().charAt(0));
		System.out.println("infrme o cargo");
		gerente.setCargo(impNome.next());
		System.out.println("informe o salario");
		gerente.setSalario(impNumero.nextDouble());
		System.out.println("informe o setor");
		gerente.setSetor(impNome.next());

		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Idade: " + gerente.getIdade());
		System.out.println("Sexo: " + gerente.getSexo());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("salario: " + gerente.getSalario());
		System.out.println("Setor: " + gerente.getSetor());

	}

}
