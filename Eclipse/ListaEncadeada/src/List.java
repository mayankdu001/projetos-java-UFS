class list {

	Object data;
	list nextNode;

	list(Object objeto, list node) {
		data = objeto;
		nextNode = node;
	}

	list(Object objeto) {
		this(objeto, null);
	}

	public Object getData() {
		return data;
	}

	public list getNextNode() {
		return nextNode;
	}

}

public class List {
	private list firstNode;
	private list lastNode;
	private String name;

	public List() {
		this("Lista");
	}

	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	public boolean isEmpty() {
		if (firstNode == null)
			return true;
		else
			return false;
	}

	public void insereNaFrente(Object itemInserido) {
		if (isEmpty()) {

			firstNode = lastNode = new list(itemInserido);

		} else {

			firstNode = new list(itemInserido, firstNode);

		}
	}

	public void insereNoFim(Object itemInserido) {
		if (isEmpty()) {

			firstNode = lastNode = new list(itemInserido);

		} else {

			lastNode.nextNode = new list(itemInserido, firstNode);

			lastNode = lastNode.nextNode;

		}
	}

	public void mostrar() {
		if (isEmpty()) {
			System.out.println("Lista Vazia" + name);
			return;
		}

		list atual = firstNode;

		while (atual != null) {
			System.out.println(atual.getData());
			atual = atual.nextNode;
		}

	}

	public Object removerNaFrente() {
		if (isEmpty()) {
			System.out.println("lista vazia");
			return null;
		}

		Object removido = firstNode.data;

		if (firstNode == lastNode) {
			lastNode = null;
		}
		firstNode = firstNode.nextNode;

		return removido;

	}

	public Object removerAtraz() {

		if (isEmpty()) {
			System.out.println("lista vazia");
			return null;
		}
		
		if (firstNode == lastNode) {
			
	}
		
		Object aux ;
		list atual = firstNode;

		while (atual != null) {
			aux = atual;
			
		}

		lastNode = null;
		atual = atual.nextNode;
		return aux;

	}

}