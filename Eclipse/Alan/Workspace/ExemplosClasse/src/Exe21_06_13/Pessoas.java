package Exe21_06_13;

public class Pessoas {
	private String nome;
	private int idade;
	private char sexo;

	public Pessoas(String p_nome, int p_idade, char p_sexo) {

		this.nome = p_nome;
		this.idade = p_idade;
		this.sexo = p_sexo;
	}

	public Pessoas() {
		nome = null;
		idade = 0;
		sexo = ' ';

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
