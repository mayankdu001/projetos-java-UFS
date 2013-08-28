package Supermercado;

public class Cliente extends Pessoa {
	private double rendimento;
	private double limite;
	private double valorCompra;
	private double valorPagamento;
	private double saldo;

	public Cliente() {
		super();
		rendimento = 0;
		limite = 0;
		valorCompra = 0;
		valorPagamento = 0;
		saldo = 0;

	}

	public Cliente(int matricula, String nome, int idade, char sexo, int cpf,
			int telefone, String endereco, double rendimento, double limite,
			double saldo) {

		super(matricula, nome, idade, sexo, cpf, telefone, endereco);

		this.rendimento = rendimento;
		this.limite = limite;
		this.saldo = saldo;

	}

	public void setCliente(double rendimento) {

		this.rendimento = rendimento;

	}

	public double getCliente() {

		return rendimento;
	}

	public void setLimite(double limite) {

		this.limite = (limite-saldo);

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

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public double getSaldo() {
		return saldo;
	}

	public void saldo(double valorCompra) {
		if (testCompra(valorCompra)) {
			saldo += valorCompra;
		}

	}

	// testar v s o cliente tem saldo suficiente pra realizar uma compra
	public boolean testCompra(double valorCompra) {
double limiteTotal = getLimite();

		if (valorCompra + saldo <= getLimite()) {
			if (valorCompra == getLimite()) {

				limiteTotal += limiteTotal * (10 / 100);
				
				setLimite(limiteTotal);
				
			}
			return true;
		}

		return false;
	}

	public void pagamento(double valorPagamento) {
		double troco = 0;
		if (testCompra(valorCompra)) {
			if (valorPagamento >= valorCompra) {
				troco = valorPagamento - valorCompra;
				
				
				
			}
			if(valorPagamento<valorCompra && valorPagamento>0){
				troco = valorCompra - valorPagamento;
			}
		}
		setSaldo(troco);
	}

}
