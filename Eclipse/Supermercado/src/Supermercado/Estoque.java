package Supermercado;

public class Estoque {

	private int liquido;
	private int solidos;
	private int pereciveis;
	private int naoPereciveis;

	public Estoque(int liquido, int solido, int pereciveis, int naoPereciveis) {

		this.liquido = liquido;
		this.solidos = solidos;
		this.pereciveis = pereciveis;
		this.naoPereciveis = naoPereciveis;

	}

	public Estoque() {
		this.liquido = 0;
		this.solidos = 0;
		this.pereciveis = 0;
		this.naoPereciveis = 0;
	}

	public int getLiquido() {
		return liquido;
	}

	public void setLiquido(int liquido) {
		this.liquido = liquido;
	}

	public int getSolidos() {
		return solidos;
	}

	public void setSolidos(int solidos) {
		this.solidos = solidos;
	}

	public int getPereciveis() {
		return pereciveis;
	}

	public void setPereciveis(int pereciveis) {
		this.pereciveis = pereciveis;
	}

	public int getNaoPereciveis() {
		return naoPereciveis;
	}

	public void setNaoPereciveis(int naoPereciveis) {
		this.naoPereciveis = naoPereciveis;
	}

	public void salvandoEstoque(int tipoProduto, int qualtidade) {
		if (tipoProduto == 1) {
			liquido += qualtidade;

		}
		if (tipoProduto == 2) {
			solidos += qualtidade;
		}
		if (tipoProduto == 3) {
			pereciveis += qualtidade;
		}
		if (tipoProduto == 4) {
			naoPereciveis += qualtidade;
		}
	}

	public void retirandoEstoque(int tipoProduto, int qualtidade) {
		if (tipoProduto == 1) {
			liquido -= qualtidade;

		}
		if (tipoProduto == 2) {
			solidos -= qualtidade;
		}
		if (tipoProduto == 3) {
			pereciveis -= qualtidade;
		}
		if (tipoProduto == 3) {
			naoPereciveis -= qualtidade;
		}

	}

}