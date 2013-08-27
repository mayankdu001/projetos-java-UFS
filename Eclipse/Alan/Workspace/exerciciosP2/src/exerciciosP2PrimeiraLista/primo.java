package exerciciosP2PrimeiraLista;

import javax.swing.JOptionPane;

public class primo {

	public static void main(String[] args) {
		int numero;
		boolean primo;
		numero = Integer.parseInt(JOptionPane.showInputDialog("informe o numero"));
		
		primo = true;
		for (int i = 2; i < numero-1; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		
		}
		if (primo == false) {
			JOptionPane.showMessageDialog(null, "não é primo");
			
		} else {
			JOptionPane.showMessageDialog(null, "é primo");

	    	}
			
	}

	}


