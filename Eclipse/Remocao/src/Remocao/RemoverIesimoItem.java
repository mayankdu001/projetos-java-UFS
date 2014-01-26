package Remocao;

import java.util.Scanner;

public class RemoverIesimoItem {

	private int vetor[];
	private int quant;

	public RemoverIesimoItem(int quant) {
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

	public boolean excluir(int posicao) {
		
			if(posicao<quant){
				for (int j = posicao; j < quant-1; j++) {
					vetor[j] = vetor[j + 1];	
				}
				
				quant--;
				return true;
			}
			
		

		return false;

	}

	public void exibir() {
		for (int i = 0; i < quant; i++) {
			System.out.println(vetor[i]);
		}

	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		RemoverIesimoItem removIn = new RemoverIesimoItem(50);
		
		System.out.println("informou os valores");
		for (int i = 0; i < 10; i++) {

			
			// valor = ler.nextInt();
			removIn.inserir(i);

		}
		
		System.out.println("infome a posicao");
		removIn.excluir(ler.nextInt());

		removIn.exibir();

	}

}
