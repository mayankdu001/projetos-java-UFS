//classe nó.
class Aluno {
	String mat;
	String dicente;
	Aluno prox;

	public Aluno(String mat, String dicente, Aluno prox) {
		this.mat = mat;
		this.dicente = dicente;
		this.prox = prox;

	}

	public Aluno(String mat, String dicente) {
		this(mat, dicente, null);
	}

	public String getMat() {
		return mat;
	}

	public String getDicente() {
		return dicente;
	}
}

// classe cabeça.
class Cabecalho {
	String disciplina;
	String docente;
	int quant;

	public Cabecalho(String disciplina, String docente, int quant) {
		this.disciplina = disciplina;
		this.docente = docente;
		this.quant = quant;
	}

	public Cabecalho(String disciplina, String docente) {
		this(disciplina, docente, 0);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public String getDocente() {
		return docente;
	}

	public int getQuant() {
		return quant;
	}
}

public class Exercicio1 {

	String nome;
	Aluno inicio;// firstnode
	Aluno fim;// lastnode
	Cabecalho cabeca;

	// cabeça do no.
	public Exercicio1(String disciplina, String docente, int quant) {
		this("Lista");
		cabeca = new Cabecalho(disciplina, docente, quant);
	}

	public Exercicio1(String nome) {
		this.nome = nome;
		inicio = fim = null;
	}

	public boolean estaVazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void inserirDepois(String mat, String dicente) {
		if (estaVazio()) {
			inicio = fim = new Aluno(mat, dicente);
			cabeca.quant++;
		} else {
			fim.prox = new Aluno(mat, dicente);
			fim = fim.prox;
			cabeca.quant++;
		}
	}

	public void Mostrar() {
		System.out
				.println("##################################################");
		System.out.println("Diciplina: " + cabeca.getDisciplina());
		System.out.println("Professor: " + cabeca.getDocente());
		System.out.println("Quantidade de alunos: " + cabeca.getQuant());
		System.out.println();
		Aluno aluno = inicio;
		if (estaVazio()) {
			System.out.println("Sem cadastro");
			return;
		}

		while (aluno != null) {
			System.out
					.println("##################################################");
			System.out.println("Matricula: " + aluno.getMat());
			System.out.println("Aluno: " + aluno.getDicente());
			System.out.println();
			aluno = aluno.prox;
		}
	}

	public Aluno Busca(Object chave) {
		Aluno busc = inicio;
		while (busc != null) {
			if (chave.equals(busc.getMat())) {
				return busc;
			}
			busc = busc.prox;
		}
		return null;
	}

	public boolean Remover(Object chave) {
		Aluno remov = Busca(chave);
		if (remov == null) {
			System.out.println("Objeto de busca não encontrado");
			return false;
		}

		if (remov == inicio) {
			inicio = inicio.prox;
			cabeca.quant--;
			return true;
		}

		Aluno atual = inicio;
		Aluno ant = inicio.prox;

		while (ant != remov) {
			if (atual == remov) {
				ant.prox = ant.prox.prox;
				remov = null;
			}
			atual = atual.prox;
			ant = ant.prox;
		}
		cabeca.quant--;
		return true;
	}
}
