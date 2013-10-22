package JogoDaVelha;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jogador2 extends JFrame {
	
	JLabel Jogador2 = new JLabel("JOGADOR 2");
	JLabel titulo = new JLabel("Taz");
	

	JLabel simbolo2 = new JLabel("Simbolo: X");

	JLabel vitorias = new JLabel("Vitorias: ");
	JLabel quantidade = new JLabel();
JPanel painel[] = new JPanel[6];
	public Jogador2() {
		super();
		
		for (int i = 0; i < 6; i++) {
			painel[i] = new JPanel();
			
			
		}
		painel[0].setLayout(new GridLayout(6,0));
		for (int i = 1; i < 6; i++) {
			painel[0].add(painel[i]);
		}
		
		painel[1].add(Jogador2);
		painel[2].add(titulo);
		painel[3].add(simbolo2);
		painel[5].add(vitorias);
		painel[5].add(quantidade);
		
		add(painel[0], BorderLayout.CENTER);
		setSize(100,300);
		setVisible(true);
	
	}
	
	public static void main(String[]args){
		new Jogador2();
		
	}
	

	
}
