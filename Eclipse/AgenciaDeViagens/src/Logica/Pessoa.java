package Logica;

class Pessoa {
	int codigo;
	String nome;
	int idade;
	String cpf;
	String telefone;
	String endereco;
	String estadia;
	Pessoa prox;

	public Pessoa(int codigo, String nome, int idade, String cpf,
			String telefone, String endereco, String estadia) {
		this(codigo, nome, idade, cpf, telefone, endereco, estadia, null);
	}

	public Pessoa(int codigo, String nome, int idade, String cpf,
			String telefone, String endereco, String estadia, Pessoa prox) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.estadia = estadia;
		this.prox = prox;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstadia() {
		return estadia;
	}

	public void setStadia(String estadia) {
		this.estadia = estadia;
	}

	public Pessoa getProx() {
		return prox;
	}

	public void setProx(Pessoa prox) {
		this.prox = prox;
	}

}
