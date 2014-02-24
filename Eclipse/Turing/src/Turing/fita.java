package Turing;

/* Fita basica para realizar testes. Mecanismo recebe uma string no formato "*xxxxx....xxxx#"
 * e transforma em um array de char
 */
public class fita {
	String entrada;
	char[] fita;
	
	public fita(String entrada) {
		fita = entrada.toCharArray();
	}
	
	public void imprima() {
		for (int x = 0; x < fita.length; x++) {
			System.out.print("| " + fita[x] + " " );
		}
		System.out.println(" | ... ");
	}

}
