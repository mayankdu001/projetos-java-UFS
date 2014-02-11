package Pilha;

public class Principal {
	public void binario(int numero) {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int numero = 29;
		Lista list = new Lista();
		int resultado;
		int aux;

		resultado = numero / 2;
		aux = numero % 2;

		list.insereNaFrente(aux);

		while (resultado >= 2) {
			aux = resultado % 2;
			resultado = resultado / 2;
			list.insereNaFrente(aux);

		}
		list.insereNaFrente(resultado);
		
		while(list.topo!=null)
			System.out.print(list.removerNaFrente());
		
		
		
		
		
	}

}
