package projeto_lanchonete;

public class Produto {

	private int codigoProduto;
	private String nomeProduto;
	private char tipoProduto;
	private double precoProduto;

	public int getCodigoProduto() {
		return this.codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return this.nomeProduto;

	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public char getTipoProduto() {
		return this.tipoProduto;
	}

	public void setTipoProduto(char tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public double getPrecoProduto() {
		return this.precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
