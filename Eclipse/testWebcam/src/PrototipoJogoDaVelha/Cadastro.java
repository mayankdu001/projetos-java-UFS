package PrototipoJogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.github.sarxos.webcam.Webcam;

public class Cadastro extends JFrame {

	JMenuBar menu = new JMenuBar();

	JMenu primeiro = new JMenu("File");
	JMenuItem help = new JMenuItem("help");
	JMenuItem credito = new JMenuItem("creditos");
	JMenuItem sair = new JMenuItem("sair");
	JPanel test = new JPanel();
	String campo1;
	String campo2;

	JButton adicionar, adicionar2, iniciar;
	JTextField campoJogador1, campoJogador2;
	JLabel jogador1, jogador2, titulo;
	int i = 0;
	JPanel painel[] = new JPanel[20];

	public void webcam(String nome) throws IOException {
		Webcam webcam = Webcam.getDefault();

		if (webcam != null) {

			Dimension d = new Dimension(320, 240);

			webcam.setViewSize(d);
			webcam.open();
			System.out.println("foi " + i++);

			ImageIO.write(webcam.getImage(), "PNG", new File(nome + ".png"));

			webcam.close();

		} else
			System.out.println("não foi");

	}

	public Cadastro() {

		super("MENU CADASTRO");

		add(menu, BorderLayout.NORTH);
		menu.add(primeiro);
		primeiro.add(help);
		primeiro.add(credito);
		primeiro.add(sair);
		adicionar = new JButton("adicionar");
		adicionar.setToolTipText("clic Para Adicionar O primeiro Jogador");
		adicionar.setForeground(Color.blue);
		adicionar2 = new JButton("adicionar");
		adicionar2.setForeground((Color.blue));
		adicionar2.setToolTipText("clic Para Adicionar O segundo Jogador");
		iniciar = new JButton("Iniciar");
		iniciar.setToolTipText("Clic Para Iniciar a Partida");
		iniciar.setForeground(Color.BLUE);

		// sair = new JButton("Sair");
		// sair.setForeground(Color.blue);
		sair.setToolTipText("clic Para Sair da tela de Cadastro");

		campoJogador1 = new JTextField(10);
		campoJogador1.setToolTipText("Adicione o nome do priemiro Jogador");
		campoJogador2 = new JTextField(10);
		campoJogador2.setToolTipText("Adicione o nome do segundo Jogador");
		jogador1 = new JLabel("Jogador 1");
		jogador1.setToolTipText("informe o primeiro jogador");
		jogador1.setForeground(Color.white);
		titulo = new JLabel("CADASTRO DE JOGADORES");
		titulo.setForeground(Color.white);
		jogador2 = new JLabel("jogador 2");
		jogador2.setToolTipText("informe o segundo jogador");
		jogador2.setForeground(Color.white);

		for (int i = 0; i < 20; i++) {
			painel[i] = new JPanel();
			painel[i].setBackground(Color.BLUE);
		}
		painel[0].setLayout(new GridLayout(6, 0));
		painel[6].setLayout(new GridLayout(6, 0));
		painel[12].setLayout(new GridLayout(6, 0));
		for (int i = 1; i < 6; i++) {
			painel[0].add(painel[i]);

		}

		for (int i = 7; i < 13; i++) {
			painel[6].add(painel[i]);

		}

		for (int i = 13; i < 18; i++) {
			painel[12].add(painel[i]);

			// painel[i].setBackground(Color.green);
		}
		// add(painel[19]);
		// painel[19].add(menu);
		// painel[7].setBackground(Color.yellow);
		painel[2].add(jogador1);
		painel[3].add(campoJogador1);
		painel[4].add(adicionar);
		painel[14].add(jogador2);
		painel[15].add(campoJogador2);
		painel[16].add(adicionar2);
		painel[10].add(iniciar);

		// painel[11].add(sair);
		// painel[1].add(adicionar);
		// painel[19].add(titulo);
		add(painel[0], BorderLayout.WEST);
		add(painel[6], BorderLayout.CENTER);
		add(painel[12], BorderLayout.EAST);
		// add(painel[19], BorderLayout.NORTH);

		MouseAdapter mouseClic = new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				
				int tamanho2 = campoJogador2.getText().length();
				int tamanho1 = campoJogador1.getText().length();

				if (e.getSource() == adicionar) {

					campo1 = campoJogador1.getText();
					if (tamanho1 == 0) {
						JOptionPane.showMessageDialog(null,
								"Informe todos os Campos");
					} else {
						try {

							webcam(campo1);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

					}

				}

				if (e.getSource() == adicionar2) {

					campo2 = campoJogador2.getText();
					if (tamanho2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Informe todos os Campos");
					} else {
						try {

							// String test=
							// c.jogadorb =

							webcam(campo2);

						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				}

				if (e.getSource() == iniciar) {

					if (tamanho2 == 0 || tamanho2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Informe todos os Campos");
					} else {
						Prototipo c = new Prototipo();
						// jogoa

						c.jogadora = campoJogador1.getText();
						c.tipojo1.setText(c.jogadora);
						System.out.println(campoJogador1.getText() + "  +  "
								+ c.jogadora);
						// jogobb

						c.jogadorb = campoJogador2.getText();
						c.tipojo2.setText(c.jogadorb);
						System.out.println(campoJogador2.getText() + "  +  "
								+ campo2);

						campoJogador1.setText(null);
						campoJogador2.setText(null);

						System.out.println(campo1 + "+ " + campoJogador1.getText());
						System.out.println(campo2 + "+" + campoJogador2.getText());
						c.iniciar = true;
						c.setVisible(true);
						c.setSize(450, 300);
						c.setLocationRelativeTo(null);
						c.setResizable(false);

					}

					// Prototipo c = new Prototipo();

					
				}
				if (e.getSource() == credito) {
					// Creditos novo = new Creditos();
					// novo.setVisible(true);
					// novo.setSize(300,300);
					JOptionPane.showMessageDialog(null,
							"Sistema Criado e Desenvolvido Por:"
									+ "\nParte Grafica:\n" +

									"\nBrendel Francisco Lima Santos" +

									"\nAlan De Jesus Passos" +

									"\nJalisson" +

									"\nTrabalho de Programação 2" +

									"\nResponsavel Profcional" +

									"\nMai-ly Vanessa" +

									"\nCurso de Sistemas de Informação");
				}

				if (e.getSource() == sair) {
					System.exit(0);
				}

			}

		};
		credito.addMouseListener(mouseClic);
		iniciar.addMouseListener(mouseClic);
		adicionar2.addMouseListener(mouseClic);
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
