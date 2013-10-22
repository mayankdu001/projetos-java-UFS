package Modelo_Ram;

public class PedidoVendas {
	String produto;
	int quantidade;
	double valor;
	String tipo;

	public PedidoVendas(String produto, int quantidade, double valor,
			String tipo) {

		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipo = tipo;
	}

	public void setProduto(String produto) {
		this.produto = produto;

	}

	public String getProduto() {
		return produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
