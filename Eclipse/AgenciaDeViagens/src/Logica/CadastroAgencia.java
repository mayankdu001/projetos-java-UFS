package Logica;

public class CadastroAgencia {
	String nome;
	Agencia inicio;
	Agencia fim;

	// metodos de agencias
	public boolean vazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}

	}

	public void inserirCabeca(int codigo, String destino, String horarios) {
		if (vazio()) {
			inicio = fim = new Agencia(codigo, destino, horarios);
		} else {
			inicio.proximo = new Agencia(codigo, destino, horarios);
			inicio = inicio.proximo;
		}
	}

	public Agencia pesquisa(String chave) {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}
		Agencia atual = inicio;

		while (atual != null) {
			if (atual.getDestino().equals(chave)) {

				return atual;

			}

		}
		return null;

	}

	// modo de retorno de objetos para retornar os nomes
	public void imprimirDados(String chave) {
		Agencia pont = pesquisa(chave);

		System.out.println("Nome: " + pont.getCodigo());
		System.out.println("Nome: " + pont.getDestino());
		System.out.println("Nome: " + pont.getHorarios());

	}

	public void escluir(String chave) {
		Agencia atual = pesquisa(chave);

		if (atual == inicio) {
			inicio = inicio.proximo;

		}
		Agencia primeiro = inicio;
		Agencia depois = inicio.proximo;
		while (primeiro != atual) {
			if (depois == atual) {
				primeiro.proximo = primeiro.proximo.proximo;
				atual = null;

			}

		}

	}

}
