package Logica;

class Agencia {
	int codigo;
	String destino;
	String horarios;
	Pessoa inicio;
	Pessoa fim;
	Agencia proximo;

	public Agencia(int codigo, String destino, String horarios, Agencia proximo) {
		this.codigo = codigo;
		this.destino = destino;
		this.horarios = horarios;
		this.proximo = proximo;

	}

	public Agencia(int codigo, String destino, String horarios) {
		this(codigo, destino, horarios, null);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public Pessoa getInicio() {
		return inicio;
	}

	public void setInicio(Pessoa inicio) {
		this.inicio = inicio;
	}

	public Pessoa getFim() {
		return fim;
	}

	public void setFim(Pessoa fim) {
		this.fim = fim;
	}

	public Agencia getProximo() {
		return proximo;
	}

	public void setProximo(Agencia proximo) {
		this.proximo = proximo;
	}

	// metodos da lista Pessoa ou seja a lista nó

	public boolean vazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void inserirPessoa(int codigo, String nome, int idade, String cpf,
			String telefone, String endereco, String stadia) {
		if (vazio()) {
			inicio = fim = new Pessoa(codigo, nome, idade, cpf, telefone,
					endereco, stadia);

		} else {

			fim.prox = new Pessoa(codigo, nome, idade, cpf, telefone, endereco,
					stadia);
			fim = fim.prox;

		}

	}

	public Pessoa pesquisa(String chave) {
		if (vazio()) {
			System.out.println("Lista Vazia");
			return null;
		}
		Pessoa atual = inicio;

		while (atual != null) {
			if (atual.getCpf().equals(chave)) {

				return atual;

			}

		}
		return null;

	}

	// modo de retorno de objetos para retornar os nomes
	public void imprimirDados(String chave) {
		Pessoa pont = pesquisa(chave);

		System.out.println("Nome: " + pont.getCodigo());
		System.out.println("Nome: " + pont.getNome());
		System.out.println("Nome: " + pont.getCpf());
		System.out.println("Nome: " + pont.getIdade());
		System.out.println("Nome: " + pont.getTelefone());
		System.out.println("Nome: " + pont.getEndereco());
		System.out.println("Nome: " + pont.getEstadia());

	}

	public void escluir(String chave) {
		Pessoa atual = pesquisa(chave);

		if (atual == inicio) {
			inicio = inicio.prox;

		}
		Pessoa primeiro = inicio;
		Pessoa depois = inicio.prox;
		while (primeiro != atual) {
			if (depois == atual) {
				primeiro.prox = primeiro.prox.prox;
				atual = null;

			}

		}

	}

}
