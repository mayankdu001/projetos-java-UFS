package ListaEncadeadaSimples;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista list = new Lista();
		
		list.inserirFrente("Alan", "22");
		list.inserirFrente("Edson", "23");
		list.inserirFrente("Brendel", "21");
		list.mostrar();
		list.inserirAtraz("Anderson", "19");
		list.mostrar();
		list.inserirChave("Brendel", "10");	
		list.mostrar();
		list.inserirChave("Anderson", "10");	
		list.mostrar();
		
		list.inserirChave("Alan", "10");	
		list.mostrar();
		list.mostrarAoContrario();


	}

}
