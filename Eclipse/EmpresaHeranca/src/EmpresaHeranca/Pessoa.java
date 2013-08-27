package EmpresaHeranca;

public class Pessoa {

	private String nome;
	private char sexo;
	private int cpf;

	public Pessoa(String nome, char sexo, int cpf) {

		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;

	}

	public Pessoa() {
		this.nome = null;
		this.sexo = 'm';
		this.cpf = 0;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

}
