package Supermercado;

public class Fornecedor extends Pessoa {
	private int cnpj;
	private int tipoProduto;
	private int quaProduto;


	public Fornecedor(int matricula, String nome, int telefone,
			String endereco, int cnpj, int tipoProduto, int quaProduto) {
		super(matricula, nome, telefone, endereco);
		this.cnpj = cnpj;
		this.tipoProduto = tipoProduto;
		this.quaProduto = quaProduto;

	}

	public Fornecedor() {
		super();
		this.cnpj = 0;
		this.tipoProduto = 0;
		this.quaProduto = 0;
		
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public void setQuaProduto(int quaProduto) {
		this.quaProduto = quaProduto;
	}

	public int getQuaProduto() {
		return quaProduto;
	}


	@Override
	public void exibirDados() {
		// TODO Auto-generated method stub
		super.exibirDados();
		System.out.println("CNPJ: "+ cnpj);
	}
	
}
