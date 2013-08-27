package exerciciosP2PrimeiraLista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, soma, contPessoas = 0, contPessoasgeral = 0, contPessoaIdade = 0, contAltura = 0, contPeso = 0;
		double porcentagemPessoas, peso, altura, somaAltura = 0, somaPeso = 0;
		do {
			System.out.println("informe o peso");
			peso = ler.nextDouble();
			if (peso == 0) {
				

			} else {

				System.out.println("informe a idade");
				idade = ler.nextInt();
				System.out.println("informe a altura");
				altura = ler.nextDouble();
				contPessoasgeral++;

				if (idade > 50) {
					contPessoaIdade++;

				}
				if (idade >= 10 & idade <= 20) {
					somaAltura += altura;
					contAltura++;

				}
				if (peso < 40) {
					contPessoas++;

				}
			}
		} while (peso != 0);
		System.out.println("total de pessoas > 50 anos: " + contPessoaIdade);
		System.out.println("media de altura maior idade 10 menor 20: "
				+ somaAltura / contAltura);
		System.out.println("porcento d epessoas co  peso menor q 40Kg: "
				+ ((contPessoas * 100) / contPessoasgeral)+"%");
		
	}

}
