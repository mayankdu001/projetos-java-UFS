package Alocacao;


import java.util.Scanner;

public class Titan {

	public static void main(String[] args) {
		Scanner importar = new Scanner(System.in);
		
		Locacao vetLocacao[] = new Locacao[10];

		Carro novoCarro;
		Cliente novoCliente;
		for (int i = 0; i < vetLocacao.length; i++) {
			// criado o objeto carro e cliente
			novoCarro = new Carro();
			novoCliente = new Cliente();

			// cadastrando cliente
			System.out.println("informe o id do cliente");
			novoCliente.setCodCliente(importar.nextInt());
			System.out.println("informe o nome do cliente");
			novoCliente.setNome(importar.next());
			System.out.println("informe o cpf do Cliente");
			novoCliente.setCpf(importar.nextInt());
			System.out.println("Informe o telefone do cleinte");
			novoCliente.setCodCliente(importar.nextInt());

			// cadastrar carro
			System.out.println("informe o id do carro");
			novoCarro.setCodCarro(importar.nextInt());
			System.out.println("informe a marca do carro");
			novoCarro.setMarca(importar.next());
			System.out.println("informe o modelo do carro");
			novoCarro.setModelo(importar.next());
			System.out.println("informe a placa do carro");
			novoCarro.setPlaca(importar.nextInt());
			System.out.println("informe a cor do carro");
			novoCarro.setCor(importar.next());
			System.out.println("informe o ano do carro");
			novoCarro.setAno(importar.next());
			System.out.println("informe o motor do carro");
			System.out.println("Gasolina/Alcool/flex");
			novoCarro.setMotor(importar.next());

		}

	}

}