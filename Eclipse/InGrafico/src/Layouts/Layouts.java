package Layouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.event.*;

public class Layouts extends JFrame implements ActionListener {

	JButton butao;
	JPanel painel;
	JLabel texto;
	int i;

	public Layouts() {
		
		super("aplicacao java ");

		i = 0;

		painel = new JPanel();

		butao = new JButton("butao");
		texto = new JLabel("quantidades de clics: "+i);

		getContentPane().add(painel);

		painel.add(butao);
		painel.add(texto);
		butao.addActionListener(this);
		getContentPane().add(painel);

	}
@Override
	public void actionPerformed(ActionEvent e) {
		i++;
		texto.setText("quantidades de clics: " + i);
	}

	public static void main(String[] args) {
		Layouts aplicacao = new Layouts();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.setSize(300, 300);
		aplicacao.setVisible(true);
	}

}
