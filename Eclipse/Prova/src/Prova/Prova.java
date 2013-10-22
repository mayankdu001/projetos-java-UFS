package Prova;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Prova extends JFrame {
	int i = 0;
	JPanel painel[] = new JPanel[6];
	JButton clic = new JButton("clic ");
	JLabel quantidade = new JLabel("quantidade de clics: ");
	JLabel clics = new JLabel("0");

	public Prova() {
		super("aplicacao Java");

		for (int i = 0; i < 6; i++) {
			painel[i] = new JPanel();
		}

		add(painel[0]);

		painel[0].add(clic, BorderLayout.NORTH);
		painel[0].add(quantidade, BorderLayout.NORTH);
		painel[0].add(clics);
		
		MouseAdapter  mouse = new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
			
				if(e.getSource() == clic){
					i++;
					clics.setText(String.valueOf(i));
					
			}
			
				
			}
			
		
		};
		 
		clic.addMouseListener(mouse);
		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Prova();

	}

}
