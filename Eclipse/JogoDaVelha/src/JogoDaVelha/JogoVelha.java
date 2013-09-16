package JogoDaVelha;

import java.applet.AudioClip;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class JogoVelha extends JFrame {
	int quantidadePartidas = 0;
	String jogadora;
	String jogadorb;
	boolean iniciar = false;
	String simbolox;
	String simboloO;

	// JComboBox simbolo;
	JComboBox partidas;

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
	JButton zerar;
	JButton exit;
	JButton adicionar;
	JButton nome2;

	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField campoJogador1;
	JTextField campoJogador2;

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

	// Metodo defini��o turnos
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
		b0.setText("");
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
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
		zerar.setEnabled(false);

	}

	/*
	 * metdodo pra colocar um plano de fundo na baga�a
	 * 
	 * public void ajustaFundo(String arquivo) { JLabel fundo = new JLabel(new
	 * ImageIcon(arquivo)); fundo.setLayout(new FlowLayout());
	 * setContentPane(fundo); }
	 * ajustaFundo("C:/Users/ALAN PASSOS/Pictures/hulk.JPG");
	 */
	public JogoVelha() {

		super("PROGRAMACAO ORIANTADA A GAMBIARRA");

		adicionar = new JButton("Adicionar");
		nome2 = new JButton();
		campoJogador1 = new JTextField(15);
		campoJogador2 = new JTextField(15);

		// botoes

		partidas = new JComboBox();
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
		zerar = new JButton("Zerar dados");
		exit = new JButton("Sair");

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
		tipojo1 = new JLabel();
		partida = new JLabel();
		jog1 = new JLabel("Jogador 1: ");
		simbolo1 = new JLabel("Simbolo: X");
		informacoes1 = new JLabel("Vit�rias = " + vit1);
		tipojo2 = new JLabel();
		jog2 = new JLabel("Jogador 2: ");
		simbolo2 = new JLabel("Simbolo: O");
		informacoes2 = new JLabel("Vit�rias = " + vit2);
		empate = new JLabel("Empates = " + emp);
		jogador01 = new JLabel("Jogador 1: ");
		jogador02 = new JLabel("Jogador 2: ");
		campo4 = new JLabel("Partidas: ");

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

		// deixar tudo opaco e sem aparecer nada
		iniciarZerarTudo();

		// cadastro de usuario

		MouseAdapter mousePartidas = new MouseAdapter() {
			public void mouseClicked(MouseEvent p) {
				if (p.getSource() == partidas) {

					if (partidas.getSelectedIndex() == 1) {
						quantidadePartidas = 1;
					} else if (partidas.getSelectedIndex() == 2) {
						quantidadePartidas = 2;
					}

				}

			}
		};

		MouseAdapter newMouse = new MouseAdapter() {
			public void mouseClicked(MouseEvent p) {

				if (p.getSource() == adicionar) {

					jogadora = campoJogador1.getText();
					jogadorb = campoJogador2.getText();
					int tamanho1 = jogadora.length();
					int tamanho2 = jogadorb.length();

					if (tamanho1 == 0 || tamanho2 == 0) {
						JOptionPane.showMessageDialog(null,
								"Todos Os Campos Devem Ser Peenchidos");
						// JOptionPane.showMessageDialog(null, );
					} else {

						iniciar = true;
						b0.setEnabled(true);
						b1.setEnabled(true);
						b2.setEnabled(true);
						b3.setEnabled(true);
						b4.setEnabled(true);
						b5.setEnabled(true);
						b6.setEnabled(true);
						b7.setEnabled(true);
						b8.setEnabled(true);
						b9.setEnabled(true);

						zerar.setEnabled(true);

						tipojo1.setText("    " + jogadora);
						tipojo2.setText("    " + jogadorb);
						campoJogador1.setText(null);
						campoJogador2.setText(null);
						campoJogador1.setEditable(false);
						campoJogador2.setEditable(false);
					}

				}

			}

		};

		adicionar.addMouseListener(newMouse);

		panel2.setLayout(new GridLayout(0, 3));
		panel5.setLayout(new GridLayout(4, 10));
		panel6.setLayout(new GridLayout(4, 10));

		// pintar panel
		panel.setBackground(Color.WHITE);
		painel1.setBackground(Color.lightGray);
		panel2.setBackground(Color.lightGray);
		panel3.setBackground(Color.lightGray);
		panel4.setBackground(Color.lightGray);
		panel5.setBackground(Color.lightGray);
		panel6.setBackground(Color.lightGray);
		nulo.setBackground(Color.lightGray);

		panel5.add(jog1);
		panel5.add(tipojo1);
		panel5.add(simbolo1);
		// panel5.add(partida);
		panel5.add(informacoes1);

		panel6.add(jog2);
		panel6.add(tipojo2);
		panel6.add(simbolo2);
		panel6.add(informacoes2);

		panel2.add(panel5);
		panel2.add(nulo);
		panel2.add(panel6);
		panel2.add(empate);

		panel4.add(zerar);
		panel4.add(exit);

		// panel4.add(empate);
		
		panel3.add(titulo);
		
		// painel1
		// painel1.setLayout(new BoxLayout(painel1, BoxLayout.X_AXIS));
		painel1.setLayout(new GridLayout(8, 20));

		painel1.add(jogador01);
		painel1.add(campoJogador1);
		// painel1.add(simbolo);
		painel1.add(jogador02);
		painel1.add(campoJogador2);

		// /painel1.add(campo4);

		partidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"Partidas", "1", "3", "5", "7", "9" }));

		// simbolo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// "Simbolo", "X", "O" }));

		painel1.add(partidas);
		painel1.add(adicionar);

		getContentPane().add(painel1, BorderLayout.WEST);
		getContentPane().add(panel3, BorderLayout.NORTH);
		getContentPane().add(panel, BorderLayout.CENTER);
		getContentPane().add(panel2, BorderLayout.EAST);
		getContentPane().add(panel4, BorderLayout.SOUTH);

		MouseAdapter mouse = new MouseAdapter() {

			public void mouseClicked(MouseEvent g) {
				if (iniciar) {

					if (g.getSource() == b1) {

						if (jogador1) {
							if (b1.getText().equals("")) {
								b1.setText("X");
								// b1.setBackground(Color.cyan);
								TurnoJogador();

							}

						} else {
							if (b1.getText().equals("")) {
								b1.setText("O");
								// b1.setBackground(Color.pink);
								TurnoJogador();

							}
						}
					}
					if (g.getSource() == b2) {
						if (jogador1) {
							if (b2.getText().equals("")) {
								b2.setText("X");
								// b2.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b2.getText().equals("")) {
								b2.setText("O");
								// b2.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b3) {
						if (jogador1) {
							if (b3.getText().equals("")) {
								b3.setText("X");
								// b3.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b3.getText().equals("")) {
								b3.setText("O");
								// b3.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b4) {
						if (jogador1) {
							if (b4.getText().equals("")) {
								b4.setText("X");
								// b4.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b4.getText().equals("")) {
								b4.setText("O");
								// b4.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b5) {
						if (jogador1) {
							if (b5.getText().equals("")) {
								b5.setText("X");
								// b5.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b5.getText().equals("")) {
								b5.setText("O");
								// b5.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b6) {
						if (jogador1) {
							if (b6.getText().equals("")) {
								b6.setText("X");
								// b6.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b6.getText().equals("")) {
								b6.setText("O");
								// b6.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == b7) {
						if (jogador1) {
							if (b7.getText().equals("")) {
								b7.setText("X");
								// b7.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b7.getText().equals("")) {
								b7.setText("O");
								// b7.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b8) {
						if (jogador1) {
							if (b8.getText().equals("")) {
								b8.setText("X");
								// b8.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b8.getText().equals("")) {
								b8.setText("O");
								// b8.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}
					if (g.getSource() == b9) {
						if (jogador1) {
							if (b9.getText().equals("")) {
								b9.setText("X");
								// b9.setBackground(Color.cyan);
								TurnoJogador();
							}
						} else {
							if (b9.getText().equals("")) {
								b9.setText("O");
								// b9.setBackground(Color.pink);
								TurnoJogador();
							}
						}
					}

					if (g.getSource() == zerar) {
						zeraDados();
						iniciar = false;
						campoJogador1.setEditable(true);
						campoJogador2.setEditable(true);

						iniciarZerarTudo();
						zerar.setEnabled(false);
					}

				}
				if (g.getSource() == exit)
					System.exit(0);
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
		zerar.addMouseListener(mouse);
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
			JOptionPane.showMessageDialog(JogoVelha.this, "Vencedor: "
					+ jogadora);
			JOptionPane.showMessageDialog(
					null,
					getContentPane().add(
							new JLabel(new ImageIcon(
									"C:/Users/ALAN PASSOS/Pictures/dia.GIF"))));
			tipojo1.setText(jogadora);
			vit1++;
			informacoes1.setText("Vit�rias = " + vit1);
		}

		if (vencedor.equals("jog2")) {
			JOptionPane.showMessageDialog(JogoVelha.this, "Vencedor: "
					+ jogadorb);
			JOptionPane.showMessageDialog(
					null,
					getContentPane().add(
							new JLabel(new ImageIcon(
									"C:/Users/ALAN PASSOS/Pictures/meuDeus.GIF"))));
			tipojo2.setText(jogadorb);

			vit2++;
			informacoes2.setText("Vit�rias = " + vit2);
		}

		if (vencedor.equals("empate")) {
			JOptionPane.showMessageDialog(JogoVelha.this, "O jogo empatou");
			emp++;
			empate.setText("Empates = " + emp);
		}

	}

	public void LimpaCampos() {

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

		informacoes1.setText("Vit�rias = " + vit1);
		informacoes2.setText("Vit�rias = " + vit2);
		empate.setText("Empates = " + emp);
	}

	public static void main(String[] args) {

		JogoVelha c = new JogoVelha();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.setSize(700, 300);
		c.setLocationRelativeTo(null);
		c.setVisible(true);

	}

}