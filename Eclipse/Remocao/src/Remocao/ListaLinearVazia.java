package Remocao;

public class ListaLinearVazia {

	private int vetor[];
	private int quant;

	// cria��o de lista vazia
	public ListaLinearVazia(int quantidade) {
		this.vetor = new int[quantidade];
		this.quant = 0;
	}

	// iser��o de n� em uma lista n�o ordenada
	public boolean inserir(int elem) {

		if (quant < vetor.length) {
			vetor[quant++] = elem;
			return true;
		}
		return false;

	}

	// pesquisa sequencial passo o elemento como parametro
	// testo s o elemento � = a algum do vetor caso seja retorno a posi��o
	// caso n�o seja retorno -1
	public int peSequencial(int chave) {
		for (int i = 0; i < quant - 1; i++) {
			if (chave == vetor[i]) {
				return i;

			}
		}

		return -1;

	}

	// pesquisa binaria passo o elemento como parametro
	// testo s � = ao elemento do meio s n�o for testo s � mior q o meio
	// caso seja testo todos do meio ao fim
	// caso n�o seja testo do inicio ate o meio
	public int pesBiaria(int chave) {
		int inicio = 0;
		int meio;
		int fim = quant - 1;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			if (chave == vetor[meio]) {
				return meio;
			}
			if (chave > vetor[meio]) {
				inicio = meio++;
			} else {
				fim = meio--;
			}

		}
		return -1;
	}

	// iserir em lista ordenada
	// esse algo ele procura qual � o menor elemento que chavee empurra os
	// outros pra fente e pronto
	public boolean isereOrdenado(int chave) {
		if (quant < vetor.length) {

			int x = quant - 1;

			while (x >= 0 && chave < vetor[x]) {
				vetor[x + 1] = vetor[x];
				x--;

			}
			vetor[x + 1] = chave;
			quant++;
			return true;

		}
		return false;

	}

	// remo��o de lista n�o ordenada
	// chamando o metodo de pesquisa binaria
	// pego o ultimo e joga em cima do indici pesquisado
	public boolean remocao(int chave) {
		if (pesBiaria(chave) >= 0) {
			vetor[pesBiaria(chave)] = vetor[quant - 1];
			quant--;
			return true;
		}
		return false;

	}

	// remo��o de lista n�o ordenada
	// dessa vez ele testa o elemento no mesmo metodo
	public boolean remocao2(int chave) {
		for (int i = 0; i < quant - 1; i++) {
			if (vetor[i] == chave) {
				vetor[i] = vetor[quant - 1];
				return true;
			}

		}

		return false;
	}

	// remo��o de posicao em lista ordenada
	// pego o proximo e jogo em cima do anterior aparti do indicador q eu quero
	public boolean remocaoOrdenada(int chave) {

		for (int i = 0; i < quant - 1; i++) {
			if (chave == vetor[i]) {
				vetor[i] = vetor[i + 1];
				return true;
			}
		}
		return false;

	}

	// remo��o de posicao em lista ordenada
	// remove da mesma forma q o anterior s� q pesquisa pelo indice
	public boolean remocaoOrdenada2(int indice) {
		if (indice < quant) {
			for (int i = indice; i < quant - 1; i++) {
				vetor[i] = vetor[i + 1];
				return true;
			}
		}
		return false;
	}

	public boolean iserirEnesima(int chave, int ind) {
		if (quant < vetor.length) {

			vetor[++quant] = vetor[ind];
			vetor[ind] = chave;
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ListaLinearVazia vetor = new ListaLinearVazia(5);

	}

}
