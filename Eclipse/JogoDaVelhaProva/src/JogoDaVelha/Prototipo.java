package JogoDaVelha;

/*
 * Universidade Federal de Sergipe 
 * Campus Dr.Alberto Carvalho
 * Curso de Sistemas De Informação
 * Matéria: Programação 2
 * Prof:Mai-Ly Vanessa
 * 
 * Sistema Desenvolvido Por 
 * 
 * Alan de Jesus Passos
 * Brendel Francisco Lima Santos 
 * 
 */

import java.applet.AudioClip;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Prototipo extends JFrame {

	String jogadora;
	String jogadorb;
	boolean iniciar = false;

	// JComboBox partidas;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;

	JButton exit;

	JButton nome2;

	JTextField t1;
	JTextField t2;
	JTextField t3;

	JPanel painelTest1 = new JPanel();
	JPanel painelTest2 = new JPanel();
	JPanel painelTest3 = new JPanel();
	JPanel painelTest4 = new JPanel();
	JPanel painelTest5 = new JPanel();
	JPanel painelTest6 = new JPanel();
	JPanel painelTest7 = new JPanel();
	JPanel painelTest8 = new JPanel();
	JPanel painelTest9 = new JPanel();
	JPanel painelTest10 = new JPanel();
	JPanel painelTest11 = new JPanel();
	JPanel painelTest12 = new JPanel();

	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JPanel nulo;
	JPanel painel1;

	JLabel jogador01;
	JLabel jogador02;
	JLabel titulo;
	JLabel jog1;
	JLabel jog2;
	JLabel tipojo1;
	JLabel tipojo2;
	JLabel informacoes1;
	JLabel informacoes2;
	JLabel empate;
	JLabel simbolo1;
	JLabel simbolo2;
	JLabel campo4;
	JLabel partida;

	boolean jogador1 = true;
	boolean jogador2 = false;

	int vit1, vit2, emp;

	Font fonte = new Font(null, Font.BOLD + Font.ITALIC, 15);
	Font fonte2 = new Font(null, Font.CENTER_BASELINE, 20);
	Font fonte3 = new Font(null, Font.ROMAN_BASELINE, 38);

	// Metodo definição turnos
	public void TurnoJogador() {

		if (jogador1 == true) {
			jogador1 = false;
			jogador2 = true;
		} else {
			jogador1 = true;
			jogador2 = false;
		}

		Teste("X");
		Teste("O");

	}

	public void iniciarZerarTudo() {

		LimpaCampos();

		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);

	}

	public Prototipo() {

		super("APLICAÇÃO jAVA");

		nome2 = new JButton();

		iniciar = true;
		// botoes

		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		b0 = new JButton("");

		exit = new JButton("Sair");
		exit.setToolTipText("Retorna a Tela de Cadastro");

		// paineis
		painel1 = new JPanel();
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		nulo = new JPanel();

		titulo = new JLabel("JOGO DA VELHA");
		titulo.setForeground(Color.white);
		tipojo1 = new JLabel();
		tipojo1.setForeground(Color.white);
		jog1 = new JLabel("Jogador 1: ");
		jog1.setForeground(Color.white);
		simbolo1 = new JLabel("Simbolo: X");
		simbolo1.setForeground(Color.white);
		informacoes1 = new JLabel("Vitórias = " + vit1);
		informacoes1.setToolTipText("Quantidade de Vitorias");
		informacoes1.setForeground(Color.white);
		tipojo2 = new JLabel();
		tipojo2.setForeground(Color.white);
		jog2 = new JLabel("Jogador 2: ");
		jog2.setForeground(Color.white);
		simbolo2 = new JLabel("Simbolo: O");
		simbolo2.setForeground(Color.white);
		informacoes2 = new JLabel("Vitórias = " + vit2);
		informacoes2.setToolTipText("Quantidade de Vitorias");
		informacoes2.setForeground(Color.white);
		empate = new JLabel("Empates = " + emp);
		empate.setForeground(Color.white);
		jogador01 = new JLabel("Jogador 1: ");
		jogador01.setForeground(Color.white);
		jogador02 = new JLabel("Jogador 2: ");
		jogador02.setForeground(Color.white);
		campo4 = new JLabel("Partidas: ");
		campo4.setForeground(Color.white);

		titulo.setFont(fonte2);

		jog1.setFont(fonte);
		jog2.setFont(fonte);
		empate.setFont(fonte);
		informacoes1.setFont(fonte);
		informacoes2.setFont(fonte);
		simbolo1.setFont(fonte);
		simbolo2.setFont(fonte);

		panel.setLayout(new GridLayout(3, 3));

		panel.add(b1).setFont(fonte3);
		panel.add(b2).setFont(fonte3);
		panel.add(b3).setFont(fonte3);
		panel.add(b4).setFont(fonte3);
		panel.add(b5).setFont(fonte3);
		panel.add(b6).setFont(fonte3);
		panel.add(b7).setFont(fonte3);
		panel.add(b8).setFont(fonte3);
		panel.add(b9).setFont(fonte3);

		panel2.setLayout(new GridLayout(6, 3));
		panel5.setLayout(new GridLayout(4, 10));
		panel6.setLayout(new GridLayout(4, 10));

		Container c = getContentPane();
		c.setLayout(new BorderLayout(7, 7));

		painelTest1.setBackground(Color.blue);
		painelTest2.setBackground(Color.blue);
		painelTest3.setBackground(Color.blue);
		painelTest4.setBackground(Color.blue);
		painelTest5.setBackground(Color.blue);
		painelTest6.setBackground(Color.blue);
		painelTest7.setBackground(Color.blue);
		painelTest8.setBackground(Color.blue);
		painelTest9.setBackground(Color.blue);
		painelTest10.setBackground(Color.blue);
		painelTest11.setBackground(Color.blue);
		painelTest12.setBackground(Color.blue);

		panel.setBackground(Color.blue);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.blue);
		panel6.setBackground(Color.blue);
		nulo.setBackground(Color.blue);
		painel1.setBackground(Color.blue);

		panel2.add(painelTest7);
		panel2.add(painelTest8);
		panel2.add(painelTest9);
		panel2.add(painelTest10);
		panel2.add(painelTest11);
		panel2.add(painelTest12);

		painelTest8.add(jog2);
		painelTest9.add(tipojo2);
		painelTest10.add(simbolo2);
		painelTest12.add(informacoes2);

		panel4.add(empate);

		panel4.add(exit);

		panel3.add(titulo);

		painel1.setLayout(new GridLayout(6, 5));

		painel1.add(painelTest1);
		painel1.add(painelTest2);
		painel1.add(painelTest3);
		painel1.add(painelTest4);
		painel1.add(painelTest5);
		painel1.add(painelTest6);

		painelTest2.add(jog1);
		painelTest3.add(tipojo1);
		painelTest4.add(simbolo1);

		painelTest6.add(informacoes1);

		c.add(painel1, BorderLayout.WEST);
		c.add(panel3, BorderLayout.NORTH);
		c.add(panel, BorderLayout.CENTER);
		c.add(panel2, BorderLayout.EAST);
		getContentPane().add(panel4, BorderLayout.SOUTH);

		// saber qual botao o jogador vai clicar
		MouseAdapter mouse = new MouseAdapter() {

			public void mousePressed(MouseEvent g) {
				if (iniciar) {

					if (g.getSource() == b1) {

						if (jogador1) {
							if (b1.getText().equals("")) {
								b1.setText("X");

								TurnoJogador();

							}

						} else {
							if (b1.getText().equals("")) {
								b1.setText("O");

								TurnoJogador();

							}
						}
					}
					if (g.getSource() == b2) {
						if (jogador1) {
							if (b2.getText().equals("")) {
								b2.setText("X");

								TurnoJogador();
							}
						} else {
							if (b2.getText().equals("")) {
								b2.setText("O");
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b3) {
						if (jogador1) {
							if (b3.getText().equals("")) {
								b3.setText("X");

								TurnoJogador();
							}
						} else {
							if (b3.getText().equals("")) {
								b3.setText("O");
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b4) {
						if (jogador1) {
							if (b4.getText().equals("")) {
								b4.setText("X");

								TurnoJogador();
							}
						} else {
							if (b4.getText().equals("")) {
								b4.setText("O");
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b5) {
						if (jogador1) {
							if (b5.getText().equals("")) {
								b5.setText("X");

								TurnoJogador();
							}
						} else {
							if (b5.getText().equals("")) {
								b5.setText("O");
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b6) {
						if (jogador1) {
							if (b6.getText().equals("")) {
								b6.setText("X");

								TurnoJogador();
							}
						} else {
							if (b6.getText().equals("")) {
								b6.setText("O");
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b7) {
						if (jogador1) {
							if (b7.getText().equals("")) {
								b7.setText("X");

								TurnoJogador();
							}
						} else {
							if (b7.getText().equals("")) {
								b7.setText("O");
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b8) {
						if (jogador1) {
							if (b8.getText().equals("")) {
								b8.setText("X");

								TurnoJogador();
							}
						} else {
							if (b8.getText().equals("")) {
								b8.setText("O");
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b9) {
						if (jogador1) {
							if (b9.getText().equals("")) {
								b9.setText("X");

								TurnoJogador();
							}
						} else {
							if (b9.getText().equals("")) {
								b9.setText("O");
								TurnoJogador();
							}
						}
					}

				}
				if (g.getSource() == exit) {

					dispose();
				}

			}

		};

		b1.addMouseListener(mouse);
		b2.addMouseListener(mouse);
		b3.addMouseListener(mouse);
		b4.addMouseListener(mouse);
		b5.addMouseListener(mouse);
		b6.addMouseListener(mouse);
		b7.addMouseListener(mouse);
		b8.addMouseListener(mouse);
		b9.addMouseListener(mouse);

		exit.addMouseListener(mouse);

	}

	public void Teste(String valor) {
		// Testando Linhas
		if (b1.getText().equals(valor) && b2.getText().equals(valor)
				& b3.getText().equals(valor)) {
			if (b1.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
				
			} else {
				Vitorias("jog2");
				LimpaCampos();

			}
			//JOptionPane.showMessageDialog(null, "vitoria bonus");
		}
		if (b4.getText().equals(valor) && b5.getText().equals(valor)
				& b6.getText().equals(valor)) {
			if (b4.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();
			}
		}

		if (b7.getText().equals(valor) && b8.getText().equals(valor)
				& b9.getText().equals(valor)) {
			if (b7.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();

			}
		}
		// Testando Colunas
		if (b1.getText().equals(valor) && b4.getText().equals(valor)
				&& b7.getText().equals(valor)) {
			if (b1.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();

			}
		}

		if (b2.getText().equals(valor) && b5.getText().equals(valor)
				&& b8.getText().equals(valor)) {
			if (b2.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();
			}
		}

		if (b3.getText().equals(valor) && b6.getText().equals(valor)
				&& b9.getText().equals(valor)) {
			if (b3.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();
			}
		}
		// Testando Diagonais

		if (b1.getText().equals(valor) && b5.getText().equals(valor)
				&& b9.getText().equals(valor)) {
			if (b1.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();

			}
		}

		if (b3.getText().equals(valor) && b5.getText().equals(valor)
				&& b7.getText().equals(valor)) {

			if (b3.getText().equals("X")) {
				Vitorias("jog1");
				LimpaCampos();
			} else {
				Vitorias("jog2");
				LimpaCampos();

			}

		}

		// testando empate

		if (!b1.getText().equals("") && !b2.getText().equals("")
				&& !b3.getText().equals("") && !b4.getText().equals("")
				&& !b5.getText().equals("") && !b6.getText().equals("")
				&& !b7.getText().equals("") && !b8.getText().equals("")
				&& !b9.getText().equals("")) {

			Vitorias("empate");
			LimpaCampos();
		}
	}

	public void Vitorias(String vencedor) {

		if (vencedor.equals("jog1")) {

			JOptionPane.showMessageDialog(Prototipo.this, "Vencedor: "
					+ jogadora);
			// quando mudar d epc tem q dar o caminho da imagem do pc q esta
			// localizado a aplicacao
			JOptionPane.showMessageDialog(null, new ImageIcon(
					"E:/Projetos_Eclipse/trunk/Eclipse/JogoDaVelhaProva/src/img/"
							+ jogadora + ".png"));

			tipojo1.setText(jogadora);
			vit1++;

			informacoes1.setText("Vitórias = " + vit1);
		}

		if (vencedor.equals("jog2")) {
			JOptionPane.showMessageDialog(Prototipo.this, "Vencedor: "
					+ jogadorb);
			// quando mudar d epc tem q dar o caminho da imagem do pc q esta
			// localizado a aplicacao
			JOptionPane.showMessageDialog(null, new ImageIcon(
					"E:/Projetos_Eclipse/trunk/Eclipse/JogoDaVelhaProva/src/img/"
							+ jogadorb + ".png"));

			tipojo2.setText(jogadorb);

			vit2++;

			informacoes2.setText("Vitórias = " + vit2);
		}

		if (vencedor.equals("empate")) {
			JOptionPane.showMessageDialog(Prototipo.this, "O jogo Deu Velha");

			emp++;
			empate.setText("Empates = " + emp);

		}

	}

	public void LimpaCampos() {

		b1.setText("");
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");

		jogador1 = true;
		jogador2 = false;

	}

	public void zeraDados() {

		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		tipojo1.setText("");
		tipojo2.setText("");

		jogador1 = true;
		jogador2 = false;

		vit1 = 0;
		vit2 = 0;
		emp = 0;

		informacoes1.setText("Vitórias = " + vit1);
		informacoes2.setText("Vitórias = " + vit2);
		empate.setText("Empates = " + emp);
	}
	}