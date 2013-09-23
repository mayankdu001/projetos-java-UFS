package JogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {
	JButton adicionar, sair;
	JTextField campoJogador1, campoJogador2;
	JLabel jogador1, jogador2;
	JPanel painel[] = new JPanel[20];

	public Cadastro() {

		adicionar = new JButton("adicionar");
		sair = new JButton("Sair");
		campoJogador1 = new JTextField(10);
		campoJogador2 = new JTextField(10);
		jogador1 = new JLabel("Jogador 1");
		jogador2 = new JLabel("jogador 2");
		for (int i = 0; i < 20; i++) {
			painel[i] = new JPanel();
		}

		painel[0].setLayout(new GridLayout(6, 0));
		painel[6].setLayout(new GridLayout(6, 0));
		painel[12].setLayout(new GridLayout(6, 0));
		for (int i = 1; i < 6; i++) {
			painel[0].add(painel[i]);
			// painel[i].setBackground(Color.BLUE);
		}

		for (int i = 7; i < 13; i++) {
			painel[6].add(painel[i]);
		}

		for (int i = 13; i < 19; i++) {
			painel[12].add(painel[i]);
			// painel[i].setBackground(Color.green);
		}

		// painel[7].setBackground(Color.yellow);
		painel[2].add(jogador1);
		painel[3].add(campoJogador1);

		painel[14].add(jogador2);
		painel[15].add(campoJogador2);
		painel[10].add(adicionar);
		painel[11].add(sair);
		// painel[1].add(adicionar);

		add(painel[0], BorderLayout.WEST);
		add(painel[6], BorderLayout.CENTER);
		add(painel[12], BorderLayout.EAST);

		MouseAdapter mouseClic = new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
		
				
				if (e.getSource() == adicionar) {
					int tamanho1 = campoJogador1.getText().length();
					int tamanho2 = campoJogador2.getText().length();

					if (tamanho1 == 0 || tamanho2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Informe todos os Campos");
					} else {
						Prototipo c = new Prototipo();
						
						campoJogador1.setEnabled(false);
						campoJogador2.setEnabled(false);
						
						
						

						c.jogadora = campoJogador1.getText();
						c.jogadorb = campoJogador2.getText();

						if(c.setVisible(false))
							campoJogador1.setEnabled(true);
							campoJogador2.setEnabled(true);
						
						
						
						
						
						c.setVisible(true);
						c.setSize(660, 300);
					}
				}
				if (e.getSource() == sair) {
					System.exit(0);
				}

			}

		};
		
		adicionar.addMouseListener(mouseClic);
		sair.addMouseListener(mouseClic);

	}

	public static void main(String[] args) {
		Cadastro cadastrar = new Cadastro();
		cadastrar.setVisible(true);
		cadastrar.setSize(355, 300);
		cadastrar.setResizable(false);
		cadastrar.setLocationRelativeTo(null);

	}

}
