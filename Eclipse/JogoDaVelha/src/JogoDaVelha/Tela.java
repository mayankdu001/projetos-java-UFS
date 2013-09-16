package JogoDaVelha;

import java.awt.BorderLayout;

import javax.swing.*;

public class Tela extends JFrame {

	JButton adicionar;
	JButton nome2;
	JTextField campoJogador1;
	JTextField campoJogador2;
	JTextField campoPartidas;
	JPanel painel1;
	JLabel jogador1;
	JLabel jogador2;
	JLabel partidas;
//	JFrame frame2;

	public Tela() {
		super("adicionar Jogadores");

		painel1 = new JPanel();
		adicionar = new JButton("Adicionar");
		nome2 = new JButton();
		campoJogador1 = new JTextField(15);
		campoJogador2 = new JTextField(15);
		campoPartidas = new JTextField(3);
		jogador1 = new JLabel("Jogador 1: ");
		jogador2 = new JLabel("Jogador 2: ");
		partidas = new JLabel("partidas: ");
		//painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
		//painel1.setSize(10,10);
		//campo1.setLayout(new BoxLayout(campo1, BoxLayout.Y_AXIS));
		//campo2.setLayout(new BoxLayout(campo2, BoxLayout.Y_AXIS));
		//campo1.setSize(10,10);
		
		getContentPane().add(painel1, BorderLayout.WEST);
		
		painel1.add(jogador1);
		painel1.add(campoJogador1);
		painel1.add(jogador2);
		painel1.add(campoJogador2);
		
		painel1.add(partidas);
		painel1.add(campoPartidas);
		painel1.add(adicionar);

	}

	public static void main(String[] args) {

		Tela jogo = new Tela();
		
		jogo.setSize(700, 300);
		jogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jogo.setVisible(true);

	}

}