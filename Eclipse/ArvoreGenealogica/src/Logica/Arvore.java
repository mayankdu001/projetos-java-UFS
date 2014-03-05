package Logica;

import java.util.Scanner;

class Node {
	String nome;
	Node filhoEsq;
	Node filhoDir;
	Node pai;
	String dec;

	Node(String n, String dec, Node noPai) {
		nome = n;
		pai = noPai;
		filhoDir = filhoEsq = null;
		this.dec = dec;
	}

	Node(String n) {
		this(n, null, null);
	}

	boolean temFilhoEsq() {
		if (filhoEsq == null)
			return false;
		else
			return true;
	}

	boolean temFilhoDir() {
		if (filhoDir == null)
			return false;
		else
			return true;
	}

	void insFilhoEsq(Node filho) {
		filhoEsq = filho;
	}

	void insFilhoDir(Node filho) {
		filhoDir = filho;
	}

	Node getFilhoEsq() {
		return filhoEsq;
	}

	Node getFilhoDir() {
		return filhoDir;
	}

	String getNome() {
		return nome;
	}

}

public class Arvore {
	private Node raiz;
	private Node achou = null;
	int contF = 0;
	int contH = 0;

	public Arvore() {
		raiz = null;

	}

	public static String[] decMasculina = { " ", "Filho", "Pai", "Avô",
			"bisavô", "trisavô", "tetravô", "pentavô", "exavô", "heptavô",
			"octavô", "nonavô", "decavô", "undecavô", " dodecavô" };

	public static String[] decFeminina = { " ", "Filha", "Mãe", "Avó",
			"bisavó", "trisavó", "tetravó", "pentavó", "exavó", "heptavó",
			"octavó", "nonavó", "decavó", "undecavó", " dodecavó"

	};

	public boolean estaVazia() {
		if (raiz == null)
			return true;
		else
			return false;
	}

	public Node getRaiz() {
		return raiz;
	}

	public Node procura(String procurado) {

		achou = null;

		pesquisa(raiz, procurado);

		return achou;

	}

	public boolean pesquisa(Node inicio, String procurado) {

		if (inicio != null) {

			if (procurado.equals(inicio.getNome())) {
				achou = inicio;

				return true;

			}
			pesquisa(inicio.getFilhoEsq(), procurado);

			pesquisa(inicio.getFilhoDir(), procurado);

		}
		return false;
	}

	public Node pesquisaAtual(Node inicio, String procurado) {

		if (inicio != null) {

			if (procurado.equals(inicio.getNome())) {

				return inicio;

			}
			pesquisa(inicio.getFilhoEsq(), procurado);

			pesquisa(inicio.getFilhoDir(), procurado);

		}
		return null;
	}

	public boolean insere(Node noPai, String info, char tipoFilho) {
		Node aux;
		boolean Ok = false;

		if ((noPai == null) && (raiz == null)) {
			contF++;
			contH++;
			aux = new Node(info, decMasculina[contF], null);
			raiz = aux;
			Ok = true;
		} else {
			if ((tipoFilho == 'E') && (noPai.temFilhoEsq())) {

				System.out
						.println("*** ERRO: Impossível inserir, já possui Individuo esquerdo!");
				Ok = false;
				return false;
			} else if ((tipoFilho == 'D') && (noPai.temFilhoDir())) {
				System.out
						.println("*** ERRO: Impossível inserir, já possui Individuo direito! ***");
				Ok = false;
				return false;
			}

			if (tipoFilho == 'E') {
				contF++;
				noPai.insFilhoEsq(new Node(info, decFeminina[contF], noPai));

			} else {
				contH++;
				noPai.insFilhoDir(new Node(info, decMasculina[contH], noPai));

			}
			Ok = true;
		}
		return Ok;
	}// Fim do método insere

	public void excluir() {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o nome da crianca");
		String nome = ler.next();

		Node no = procura(nome);

		if (no != null) {
			if (no.filhoEsq != null || no.filhoDir != null) {

				System.out.println("Não pode ser removido");

			} else {
				System.out.println("Removido");
				if (no == raiz) {

					raiz = null;
					return;
				}

				if (no.pai.filhoEsq == no)
					no.pai.filhoEsq = null;

				else
					no.pai.filhoDir = null;
			}
		}
	}

	public void preOrdemRec(Node atual) {
		if (atual != null) {
			System.out.println(atual.getNome());
			preOrdemRec(atual.getFilhoEsq());
			preOrdemRec(atual.getFilhoDir());
		}
	}

}
