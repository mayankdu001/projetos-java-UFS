package Pilha;

class Pilha {
	int numero;
	Pilha proximo;

	Pilha(int numero, Pilha proximo) {
		this.numero = numero;
		this.proximo = proximo;
	}

	Pilha(int numero) {
		this(numero, null);
	}

	public int getNumero() {
		return numero;
	}

	public Pilha getNextNode() {
		return proximo;
	}

}

public class Lista {
	Pilha topo;
	String nome;

	public Lista() {
		this("Lista", null);
	}

	public Lista(String nome, Pilha topo) {

		this.nome = nome;
		this.topo = topo;

	}

	public boolean isEmpty() {
		if (topo == null)
			return true;
		else
			return false;
	}

	public void insereNaFrente(int itemInserido) {
		if (isEmpty()) {

			topo = new Pilha(itemInserido);

		} else {

			topo = new Pilha(itemInserido, topo);

		}
	}

	public int removerNaFrente() {
		if (isEmpty()) {
			System.out.println("lista vazia");
			return -1;
		}

		int removido = topo.numero;

		topo = topo.proximo;

		return removido;

	}

}
