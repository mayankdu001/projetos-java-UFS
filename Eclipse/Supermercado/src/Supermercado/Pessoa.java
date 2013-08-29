package Supermercado;

public class Pessoa {

	private int matricula;
	private String nome;
	private int idade;
	private char sexo;
	private int cpf;
	private int telefone;
	private String endereco;

	public Pessoa() {
		this.matricula = 0;
		this.nome = null;
		this.idade = 0;
		this.sexo = ' ';
		this.cpf = 0;
		this.telefone = 0;
		this.endereco = null;

	}

	public Pessoa(int matricula, String nome, int idade, char sexo, int cpf,
			int telefone, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;

	}

	public Pessoa(int matricula, String nome, int telefone, String endereco) {
		// parametro pra o fornecedor
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void exibirDados() {
		System.out.println("Matricula: " + matricula);
		System.out.println("nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereco: " + endereco);
	}

}
