package Pilha;

public class Pilha {

	String nome;
	No topo;

	public Pilha() {
		this("Pilha", null);
	}

	public Pilha(String nome, No topo) {
		this.nome = nome;
		this.topo = topo;

	}

	public boolean vazio() {
		if (topo == null) {
			return true;

		} else {
			return false;
		}
	}

	public void inserir(String chave) {
		if (vazio()) {
			topo = new No(chave, null);

		} else {
			topo = new No(chave, topo);

		}

	}
	
	
	public String remover(){
		
		if(vazio()){
			System.out.println("Lista vazia");
			return null;
			
		}
		
		String retorno = topo.getValor();
		topo = topo.proximo;
		return retorno;
		
	}

}
