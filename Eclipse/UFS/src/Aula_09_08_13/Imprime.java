package Aula_09_08_13;

import javax.swing.JOptionPane;

public class Imprime {

	public static void main(String[] args) {

		
		ArmazenarString string = new ArmazenarString(null);
		
		String nome = JOptionPane.showInputDialog("informe o nome");
		string.totalVogal(nome);
		
		
		
		
		

	}

}
