package ContaBancaria;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		ContaBancaria novaConta = new ContaBancaria("joao", "1231231", "123123");

		novaConta.depositar(1000);
		novaConta.sacar(104);
		novaConta.verNome();
		novaConta.verSaldo();

	}

}
