package TrabalhoCD;

public class Cd {

	private String nomeCd;
	private String cantor;
	private String gravadora;
	private double tempoDuracao;
	private String estilo;
	private double preco;
	private String anoLancamento;

	public Cd() {

		this.nomeCd = null;
		this.cantor = null;
		this.gravadora = null;
		this.tempoDuracao = 0;
		this.estilo = null;
		this.preco = 0;
		this.anoLancamento = null;

	}

	/*
	 * public Cd(String nome, String cantor, String gravadora, double
	 * tempoExecucao, String estilo, double preco, String anoLancamento) {
	 * 
	 * this.nomeCd = nome; this.cantor = cantor; this.gravadora = gravadora;
	 * this.tempoDuracao = tempoExecucao; this.estilo = estilo; this.preco =
	 * preco; this.anoLancamento = anoLancamento;
	 * 
	 * }
	 */

	public void setNome(String nome) {
		this.nomeCd = nome;

	}

	public String getNome() {
		return nomeCd;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getCantor() {
		return cantor;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public double getTempoduracao() {
		return tempoDuracao;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void imprimirDados() {

		System.out.println("nome: " + getNome());
		System.out.println("cantor: " + getCantor());
		System.out.println("Estilo: " + getEstilo());
		System.out.println("Valor: " + getPreco());

	}

	public void reajusteCd(double taxa) {

		this.preco = getPreco() + (getPreco() * (taxa / 100));

	}

	public String retornarAnoLancamento(String data) {

		String anoTest = null;

		if (data.equals(anoLancamento)) {

			anoTest = anoLancamento;
		}
		return anoTest;
	}

}
