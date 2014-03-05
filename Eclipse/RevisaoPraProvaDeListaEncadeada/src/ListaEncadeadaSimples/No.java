package ListaEncadeadaSimples;

class No {
	String nome;
	String idade;
	No proximo;
	No anterior;
	
	
	

	public No(String nome, String idade, No anterior, No proximo) {
		this.nome = nome;
		this.idade = idade;
		this.anterior = anterior;
		this.proximo = proximo;

	}

	public String getNome() {
		return nome;
	}

	public String getIdade() {
		return idade;
	}

}
