package Janela;

import javax.swing.*;

public class Janela {

	public static void main(String[] args) {
		int i = 0;
		JFrame frame = new JFrame("aplicacao java");
		frame.setSize(300,300);
		
		JButton but = new JButton("clic");
		
		JLabel texto = null;
		
		texto = new JLabel("quantidade de clics: ");
			
		

		JPanel panel = new JPanel();

		frame.add(panel);
		panel.add(but);

		panel.add(texto);

		frame.setVisible(true);

	}

}
