package ProjetoHeranca;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String nome2;

	
	
	public void pessoa(String p_nome, int p_idade, char p_sexo) {

		this.nome = p_nome;
		this.idade = p_idade;
		this.sexo = p_sexo;

	}

	public void pessoa() {
		nome2 = null;
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
