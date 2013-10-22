package PrototipoJogoDaVelha;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class Tela extends JFrame {
	JLabel tela = new JLabel("Aguarde Enquanto Capturamos Sua Imagem");
	JPanel painel = new JPanel();

	public Tela() {
		add(painel, BorderLayout.CENTER);
		painel.add(tela, BorderLayout.CENTER);


	}	

}
