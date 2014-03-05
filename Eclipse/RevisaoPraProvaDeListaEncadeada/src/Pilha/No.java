package Pilha;

class No {
	String valor;
	No proximo;

	public No(String valor,No topo) {
		this.valor = valor;
		this.proximo = topo;

	}

	public String getValor() {
		return valor;
	}

}

