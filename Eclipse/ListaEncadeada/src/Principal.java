import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome= null;
		
		List list = new List();

		list.insereNaFrente(ler.next());
		list.mostrar();
		list.insereNaFrente(ler.next());
		list.mostrar();
		list.insereNaFrente(ler.next());
		list.mostrar();
		list.insereNaFrente(ler.next());
		list.mostrar();
		
		
		list.removerNaFrente();
		list.mostrar();
		
		
		
		
		
		

	}

}
