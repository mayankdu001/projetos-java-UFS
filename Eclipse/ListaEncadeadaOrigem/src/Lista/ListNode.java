package Lista;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.ImageIcon;

class Node {
	Object data;
	Node nextNode;

	public Node(Object elemento, Node node) {
		this.data = elemento;
		this.nextNode = node;
	}

	public Node(Object objeto) {
		this(objeto, null);
	}

	public Object getObject() {
		return data;
	}

	public Node getNext() {
		return nextNode;
	}

}

public class ListNode {
	Node firstNode;
	Node lastNode;
	String nome;

	public ListNode() {
		this("nome");
	}

	public ListNode(String nome) {
		this.nome = nome;
		firstNode = lastNode = null;

	}

	public boolean inEpmpty() {
		if (firstNode == null) {
			return true;
		} else {
			return false;
		}

	}

	public boolean inserirNaFrente(Object elemento) {
		if (inEpmpty()) {
			firstNode = lastNode = new Node(elemento);
		} else {
			firstNode = new Node(elemento, firstNode);

		}
		return true;

	}

	public boolean inserirAtraz(Object elemento) {

		if (inEpmpty()) {
			firstNode = lastNode = new Node(elemento);
		} else
			lastNode.nextNode = new Node(elemento);
		lastNode = lastNode.nextNode;
		return true;
	}

	public void mostrar() {
		if (inEpmpty()) {
			System.out.println("lista vasia");
		}

		Node atual = firstNode;

		while (atual != null) {
			System.out.println(atual.getObject());
			atual = atual.nextNode;

		}

	}

	public Object removernaFrente() {
		if (inEpmpty()) {
			System.out.println("lista vazia");
			return null;
		}
		Object removido = firstNode.getObject();

		if (firstNode == lastNode) {
			lastNode = null;
		}

		firstNode = firstNode.nextNode;

		return removido;
	}

	public void inserirPesquisa(Object elemento, Node atual) {

		if (inEpmpty()) {
			System.out.println("lista vazia");

		}

		if (firstNode == lastNode) {

		}

		if (atual == null) {
			System.out.println("endere�o invalido");
			return;
		}

		atual.nextNode = new Node(elemento, atual.nextNode);
		if (atual == lastNode) {

			lastNode.nextNode = new Node(elemento, atual.nextNode);
		}
	}

	public Node pesquisa(Object chave) {
		Node atual = firstNode;

		while (atual != null) {

			if (chave.equals(atual.getObject())) {
				return atual;

			}
			atual = atual.nextNode;
		}
		return null;

	}

}
