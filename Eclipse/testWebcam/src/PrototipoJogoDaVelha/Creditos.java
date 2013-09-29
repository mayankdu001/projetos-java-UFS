package PrototipoJogoDaVelha;

import java.awt.BorderLayout;

import javax.swing.*;

public class Creditos extends JFrame {
	String como = "Sistema Criado e Desenvolvido Por:" + "\nParte Grafica:\n" +

	"\nBrendel Francisco Lima Santos" +

	"\nAlan De Jesus Passos" +

	"\nJalisson" +

	"\nTrabalho de Programação 2" +

	"\nResponsavel Profcional" +

	"\nMai-ly Vanessa" +

	"\nCurso de Sistemas de Informação";
	
	JLabel credito = new JLabel();
	JPanel test = new JPanel();
	

	public Creditos() {

		credito.setText(como);
		test.add(credito);
		add(test, BorderLayout.CENTER);

	}
}
