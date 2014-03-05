package ListaEncadeadaSimples;

public class Lista {
	No inicio;
	No fim;
	String nome;

	public Lista() {
		this("Lista");

	}

	public Lista(String nome) {
		inicio = fim = null;
	}

	public boolean vazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarAoContrario() {
		if (vazio()) {
			System.out.println("lista vazia");
			return;
		}

		No atual = fim;
		while (atual != null) {

			System.out.print("{" + atual.nome + " - " + atual.idade + "}");

			atual = atual.anterior;
		}

	}

	public void inserirFrente(String nome, String idade) {

		if (vazio()) {
			inicio = fim = new No(nome, idade, null, null);

		} else {
			inicio.anterior = new No(nome, idade, null, inicio);
			inicio = inicio.anterior;
		}

	}

	public void inserirAtraz(String nome, String idade) {
		if (vazio()) {
			inicio = fim = new No(nome, idade, null, null);
		} else {
			fim.proximo = new No(nome, idade, fim, null);
			fim = fim.proximo;

		}
	}

	public void inserirChave(String nome, String idade) {
		if (vazio()) {
			inicio = fim = new No(nome, idade, null, null);
			return;
		}

		No atual = pesquisa(nome);

		No novo = new No(nome, idade, null, null);

		if (atual == fim) {
			fim.proximo = novo;
			novo.anterior = fim;
			fim = novo;

			return;
		}
		novo.proximo = atual.proximo;
		atual.proximo.anterior = novo;
		novo.anterior = atual;
		atual.proximo = novo;
	}

	public String removerFrente() {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}
		String dado = "{" + inicio.nome;
		dado += " - " + inicio.idade + "}";
		if (inicio == fim) {
			inicio = fim = null;
			return null;
		}

		inicio = inicio.proximo;
		inicio.anterior = null;

		return dado;

	}

	public String removerAtraz() {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}
		String dado = "fudeu";

		dado = "{" + fim.nome;
		dado += " - " + fim.idade + "}";
		if (inicio == fim) {
			inicio = fim = null;
			return null;
		}

		fim.anterior.proximo = null;
		fim.anterior = null;

		return dado;

	}

	public void removerPesquisa(String chave) {
		if (vazio()) {
			System.out.println("lista vazia");
			return;
		}
		No pont = pesquisa(chave);

		if (pont == null) {
			System.out.println("Chave invalida");
			return;
		}
		if (pont == inicio) {
			pont = pont.proximo;
			pont.anterior = null;
			return;
		}
		if (pont == fim) {
			fim.anterior.proximo = null;
			fim.anterior = null;

		}

		pont.anterior.proximo = pont.proximo;
		pont.proximo.anterior = pont.anterior;

	}

	public No pesquisa(String chave) {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}
		No atual = inicio;

		while (atual != null) {
			if (atual.getNome().equals(chave)) {
				return atual;
			}
			atual = atual.proximo;
		}
		return null;
	}

	public void mostrar() {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return;
		}

		No atual = inicio;
		while (atual != null) {

			System.out.print("{" + atual.nome + " - " + atual.idade + "}");

			atual = atual.proximo;

		}
		System.out.println();

	}

	public void mostarFim() {
		if (vazio()) {
			System.out.println("Lista vazia");
			return;
		}
		System.out.println("{" + fim.nome + " - " + fim.idade + "}");
	}

	public void mostarInicio() {
		if (vazio()) {
			System.out.println("Lista vazia");
			return;
		}

		System.out.println("{" + inicio.nome + " - " + inicio.idade + "}");
	}
}
