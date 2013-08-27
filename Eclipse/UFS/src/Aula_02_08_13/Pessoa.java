package Aula_02_08_13;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String p_nome) {
		this.nome = p_nome;

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int p_idade) {
		this.idade = p_idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char p_sexo) {
		this.sexo = p_sexo;
	}

	public void aniver() {
		idade++;
	}

}
