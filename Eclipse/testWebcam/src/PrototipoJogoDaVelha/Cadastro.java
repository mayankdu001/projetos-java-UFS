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
import java.io.Closeable;
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
			Tela nova = new Tela();

			Dimension d = new Dimension(320, 240);

			webcam.setViewSize(d);
			webcam.open();

			ImageIO.write(webcam.getImage(), "PNG", new File(nome + ".png"));
			webcam.close();
			JOptionPane.showMessageDialog(null, "Capturamos Sua Foto"
					+ "\n Para Continuar o Cadastro" + "\nClick OK");

		} else
			JOptionPane.showMessageDialog(null, "Camera Não Disponivel");

	}

	public Cadastro() {

		super("MENU CADASTRO");
		JOptionPane.showMessageDialog(null, "A Aplicaçãoo"
				+ "\n 'JOGO DA VELHA'" + "\n Necessita de Captura de Imagem"
				+ "\n Para o Cadastro de Seus Jogadores"
				+ "\n Caso Deseje Continuar o Cadastro"
				+ "\n Seus Direitos Altorais Serão Preservados"
				+ "\n Caso Nao deseje Que Suas Fotos"
				+ "\n Seja Salva Em Nosso Banco de Dados"
				+ "\n Por Favor Click Em 'SAIR' "
				+ "\n No Menu Situado No Canto Superior Esquerdo"
				+ "\n Ocorrendo o Termino da Seção de Cadastro"
				+ "\n Sem Que o Usuario jogue" + "\n Para Continuar"
				+ "\nClik 'OK' ");

		add(menu, BorderLayout.NORTH);

		menu.add(primeiro);
		menu.setToolTipText("help - creditos- sair");
		primeiro.add(help);
		help.setToolTipText("Regas do jogo");
		primeiro.add(credito);
		credito.setToolTipText("Dados Sobre a Criação da Aplicação");
		primeiro.add(sair);
		adicionar = new JButton("adicionar");
		adicionar.setToolTipText("Adiciona O primeiro Jogador");
		adicionar.setForeground(Color.blue);
		adicionar2 = new JButton("adicionar");
		adicionar2.setForeground((Color.blue));
		adicionar2.setToolTipText("Adiciona O segundo Jogador");
		iniciar = new JButton("Iniciar");
		iniciar.setToolTipText("Clic Para Iniciar a Partida");
		iniciar.setForeground(Color.BLUE);

		// sair = new JButton("Sair");
		// sair.setForeground(Color.blue);
		sair.setToolTipText("Sair da tela de Cadastro");

		campoJogador1 = new JTextField(10);
		campoJogador1.setToolTipText("Campo Para Adicionar o Priemiro Jogador");
		campoJogador2 = new JTextField(10);
		campoJogador2.setToolTipText("Campo Para Adicionar o Segundo Jogador");
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

						c.jogadora = campo1;
						c.tipojo1.setText(campo1);
						// jogobb

						c.jogadorb = campo2;
						c.tipojo2.setText(campo2);

						campoJogador1.setText(null);
						campoJogador2.setText(null);

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
							"_________________________________\n"
									+ "\nCREDITOS"
									
									+ "\nUniversidade Federal de Sergipe "
									
									+ "\nCampus Dr.Alberto Carvalho"

									+ "\nCurso de Sistemas de Informação"

									+ "\nSegundo Periodo"

									+ "\nTrabalho de Programação 2"

									+ "\nProfessor(a): Mai-ly Vanessa"

									+ "\nSistema Desenvolvido Por:"

									+ "\nAlan De Jesus Passos"

									+ "\nBrendel Francisco Lima Santos\n"
									+ "______________________________"

					);
				}
				if (e.getSource() == help) {
					JOptionPane
							.showMessageDialog(
									null,
									"REGRAS"
											+ "\nO Primeiro Jogador Joga com os xis ( X)"
											+ "\n O Segundo Jogador Joga com o círculo ( O ) "
											+ "\nCada  jogador, na sua vez, Marca seu Simbolo,"
											+ "\n numa lacuna que esteja vazia."
											+ "\nQuando há empate costuma-se dizer que o jogo “deu velha”.");
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
		help.addMouseListener(mouseClic);
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
