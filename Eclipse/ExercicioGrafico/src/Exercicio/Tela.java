package Exercicio;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Tela extends JFrame {

	public Tela() {
		super("Tela Intera��o");
		JPanel painel1 = new JPanel();
		JPanel painel2 = new JPanel();
		JPanel painel3 = new JPanel();
		JPanel painel4 = new JPanel();
		JTextField texto = new JTextField(25);

		JLabel novo = new JLabel("informe alguma coisa ");

		JButton butaoOeste1 = new JButton("Leste 1");
		JButton butaoOeste2 = new JButton("Leste 2");
		JButton butaoOeste3 = new JButton("Leste 3");
		JButton butaoOeste4 = new JButton("Leste 4");
		JButton butaoOeste5 = new JButton("Leste 5");
		JButton butaoNorte1 = new JButton("norte 1");
		JButton butaoNorte2 = new JButton("norte 2");
		JButton butaoNorte3 = new JButton("norte 3");
		JButton butaoNorte4 = new JButton("norte 4");
		
		JButton butaoLeste = new JButton("leste");
		JButton butaoOeste = new JButton("oeste");
		
		painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
		//painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));
		add(painel1, BorderLayout.WEST);
		add(painel2, BorderLayout.NORTH);
		add(painel3, BorderLayout.SOUTH);
		
		painel1.add(butaoOeste1);
		
		painel1.add(butaoOeste2);
		painel1.add(butaoOeste3);
		painel1.add(butaoOeste4);
		painel1.add(butaoOeste5);
		
		painel2.add(butaoNorte1);
		painel2.add(butaoNorte2);
		painel2.add(butaoNorte3);
		painel2.add(butaoNorte4);
		painel3.add(novo);
		painel3.add(texto);
		setSize(500, 250);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Tela();

	}

}
