package PrototipoJogoDaVelha;

import java.awt.BorderLayout;

import javax.swing.*;

public class Creditos extends JFrame {
	String como = "Sistema Criado e Desenvolvido Por:" + "\nParte Grafica:\n" +

	"\nBrendel Francisco Lima Santos" +

	"\nAlan De Jesus Passos" +

	"\nJalisson" +

	"\nTrabalho de Programa��o 2" +

	"\nResponsavel Profcional" +

	"\nMai-ly Vanessa" +

	"\nCurso de Sistemas de Informa��o";
	
	JLabel credito = new JLabel();
	JPanel test = new JPanel();
	

	public Creditos() {

		credito.setText(como);
		test.add(credito);
		add(test, BorderLayout.CENTER);

	}
}
