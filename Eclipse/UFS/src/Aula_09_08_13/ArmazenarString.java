package Aula_09_08_13;

import javax.swing.JOptionPane;

public class ArmazenarString {

	String nome;

	public ArmazenarString(String p_nome) {
		nome = p_nome;

	}

	public void totalVogal(String p_nome) {
		String nome = p_nome.toUpperCase();

		int cont2 = 0;
		int cont = 0;
		for (int j = 0; j < nome.length(); j++) {

			if (p_nome.charAt(j) == 'a' || p_nome.charAt(j) == 'e'
					|| p_nome.charAt(j) == 'i' || p_nome.charAt(j) == 'o'
					|| p_nome.charAt(j) == 'u') {
				cont++;
			} else if (p_nome.charAt(j) == ' ') {
				cont2++;
			}
		}
		int cont3 = nome.length() - (cont + cont2);
		JOptionPane.showMessageDialog(null, "total de vogal: " + cont
				+ "\n total de concoantes: " + cont3 + "\ntotal de espacos: "
				+ cont2);
		// System.out.println("total de vogal" + cont);
		// System.out.println("total de concoantes: " + cont2);
		// System.out.println("total de espacos: " + cont3);
	}
}
