package Supermercado;

public class Cliente extends Pessoa {
	private double rendimento;
	private double limite;
	private double valorCompra;
	private double valorPagamento;

	public Cliente() {
		super();
		rendimento = 0;
		limite = 0;
		valorCompra = 0;
		valorPagamento = 0;

	}

	public Cliente(int matricula, String nome, int idade, char sexo, int cpf,
			int telefone, String endereco, double rendimento, double limite) {

		super(matricula, nome, idade, sexo, cpf, telefone, endereco);

		this.rendimento = rendimento;
		this.limite = limite;

	}

	public void setCliente(double rendimento) {

		this.rendimento = rendimento;

	}

	public double getCliente() {

		return rendimento;
	}

	public void setLimite(double limite) {

		this.limite = limite;

	}

	public double getLimite() {
		return limite;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	// testar v s o cliente tem saldo suficiente pra realizar uma compra
	public boolean testCompra(double valorCompra) {

		if (valorCompra <= limite) {
			if(valorCompra == limite ){
				limite += (10/100)*limite; 
			}
			return true;
		}

		return false;
	}

}