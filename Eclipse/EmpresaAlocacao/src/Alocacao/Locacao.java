package Alocacao;



public class Locacao {
	private int idLocacao;
	private String dataSaida;
	private boolean status;
	private double valorLocacao;

	Carro carro;
	Cliente cliente;

	public void setLocacao(Carro carro, Cliente cliente) {
		this.carro = carro;
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}

	public int getIdLocacao() {
		return idLocacao;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getdataSaida() {
		return dataSaida;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}
}
