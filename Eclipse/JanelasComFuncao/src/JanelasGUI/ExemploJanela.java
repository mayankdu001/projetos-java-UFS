package JanelasGUI;

import javax.swing.*;

public class ExemploJanela extends JFrame {

	JButton but;
	JLabel texto;
	JPanel painel;

	public ExemploJanela() {

		super("Aplica��o Swing");

		but = new JButton("Sou um bot�o");
		texto = new JLabel("Quantidade de clicks: 0");
		painel = new JPanel();

		painel.add(but);
		painel.add(texto);
		/*
		 * for (int i = 0; i < 5; i++) { painel.add(new JButton("but�o: "+i));
		 * 
		 * }
		 */
		getContentPane().add(painel);
	}

	public static void main(String args[]) {

		ExemploJanela janela = new ExemploJanela();

		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Nova
																			// linha
		janela.pack();
		janela.setVisible(true);

	}

}