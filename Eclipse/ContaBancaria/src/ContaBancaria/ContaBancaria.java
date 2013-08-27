package ContaBancaria;

import java.util.Scanner;

public class ContaBancaria {

	private String nomeProprietario;
	private double saldo;
	private String numeroConta;
	private String agencia;

	public ContaBancaria(String corretista, String conta, String agencia) {
		nomeProprietario = corretista;
		numeroConta = conta;
		agencia = agencia;
		saldo = 0;

	}

	public void verSaldo() {
		System.out.println("Saldo = R$ " + saldo);
	}

	public void depositar(double valor) {
		saldo = valor;
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {

			System.out
					.println("saldo negativo por favor deposite e algum valor ");

		}
	}

	public void verNome() {
		System.out.println("Nome: " + nomeProprietario);
	}

}
