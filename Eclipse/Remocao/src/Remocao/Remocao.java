package Remocao;

import java.util.Scanner;

public class Remocao {
	private int vetor[];
	private int quant;

	public Remocao(int quant) {
		this.vetor = new int[quant];
		this.quant = 0;

	}

	public boolean inserir(int valor) {
		if (quant < vetor.length) {
			vetor[quant++] = valor;
			return true;
		}
		return false;
	}

	public boolean remover(int chave) {// chave é o valor q eu quero incrementar

		for (int i = 0; i < quant; i++) 
			if (chave == vetor[i]) {
				vetor[i] = vetor[quant-1];
				quant--;
				return true;
				
			}	
		return false;
	}
	public void exibir(){
		for (int i = 0; i < quant; i++) {
			System.out.println(vetor[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		int remover;
		Remocao lista = new Remocao(50);
		for (int i = 0; i < 10; i++) {
			System.out.println("insira um valor");
			valor = ler.nextInt();
			lista.inserir(valor);
				
		}
		lista.exibir();
		System.out.println("numero pra remover");
		remover= ler.nextInt();
		lista.remover(remover);
		lista.exibir();
		
		
	}

}
