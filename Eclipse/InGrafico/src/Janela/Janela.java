package Janela;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {

	public Janela() {
		
		super("ap�icacao java");
		
		JButton butao = new JButton("TOBA");
		JPanel painel = new JPanel();
		JTextField texto = new JTextField(25);
		
		add(painel);
		
		painel.add(butao);
		painel.add(texto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
		

	}

	public static void main(String[] args) {
		
		new Janela();
		
	}

}
