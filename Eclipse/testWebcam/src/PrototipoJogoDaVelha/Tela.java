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

	public Tela() {

		Container c = getContentPane();
		Container c2 = new JPanel();

		c2.setLayout(new GridLayout(6, 1));
		
		
		c2.add(new JLabel("Jogador 1"));
		c2.add(new JTextField(10));
		c2.add(new JButton("ADICIONAR"));
		
		
		
		
		//c.setLayout(new BorderLayout(30,30));
		c.add(c2);
		add(c2, BorderLayout.WEST);
		
		c.add(new JButton("centro"), BorderLayout.CENTER);

		setVisible(true);
		setSize(300, 300);

	}

	public static void main(String[] args) {
		new Tela();



		
		
	}

}
