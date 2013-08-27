package Aula_02_08_13;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Scanner impNome = new Scanner(System.in);
		Scanner impNumero = new Scanner(System.in);
		int opcao;
		Pessoa dados = new Pessoa();

		System.out.println("informe o nome ");
		dados.setNome(impNome.next());

		System.out.println("informe a idade");
		dados.setIdade(impNumero.nextInt());
		System.out.println("informe o sexo");
		dados.setSexo(impNome.next().charAt(0));

		System.out.println("1-sim");
		System.out.println("2-não");
		System.out.println("faz aniversario?");
		opcao = impNumero.nextInt();

		if (opcao == 1) {
			for (int i = 0; i < 20; i++) {
				dados.aniver();
			}

		}

		System.out.println("nome: " + dados.getNome());
		System.out.println("idade: " + dados.getIdade());
		System.out.println("Sexo: " + dados.getSexo());

	}

}
