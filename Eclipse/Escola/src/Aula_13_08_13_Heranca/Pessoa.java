package Aula_13_08_13_Heranca;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;

	public Pessoa(String nome, String cpf, int idade, char sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {

		return nome;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;

	}

	public String getCpf() {
		return cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public int fazerAniver() {

		return getIdade() + 1;
	}

}
