package Forca;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Random;

public class Forcaa extends JFrame {

	JTextField campoLetras = new JTextField(1);
	JTextField campoPalavra = new JTextField(10);
	int acertos = 0;

	Random randomPalavras = new Random();

	String[] palavra = { "aabccc", "abc", "aaabbb", "aaabbbcc" };
	// indicePalavras == indice onde esta a palavra
	int indicePalavras;
	int indice;

	JLabel lblTexto[] = new JLabel[15];
	JButton adicionar = new JButton("testa");

	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	int tentativa;
	JLabel texto2 = new JLabel("tentativas " + tentativa);
	int achou = 0;

	// metodo palavra nova
	public void novaPalavra() {

		indicePalavras = randomPalavras.nextInt(palavra.length);

		tentativa = 7;
		texto2.setText("Tentativas " + tentativa);

		for (int i = 0; i < palavra[indicePalavras].length(); i++) {

			lblTexto[i] = new JLabel("_");
			panel2.add(lblTexto[i]);

		}

	}

	
	public Forcaa() {
		super("Forca");

		novaPalavra();

		add(campoLetras, BorderLayout.SOUTH);
		panel.add(adicionar);
		panel.add(texto2);
		// panel.add(b2);
		panel.add(panel2);
		getContentPane().add(panel);

		MouseAdapter mouse = new MouseAdapter() {

			public void mousePressed(MouseEvent g) {

				if (g.getSource() == adicionar)
					testa(indicePalavras);

			}
		};

		adicionar.addMouseListener(mouse);

	}

	// testa a letra
	public void testa(int indi) {

		char vetor[] = new char[palavra[indi].length()];
		char testarLetra;

		testarLetra = campoLetras.getText().charAt(0);

		achou = 0;

		for (int i = 0; i < palavra[indi].length(); i++) {

			if (testarLetra == palavra[indi].charAt(i)) {

				achou = 1;
				acertos++;

				lblTexto[i].setText("" + campoLetras.getText().charAt(0));
				vetor[i] = testarLetra;

			}

		}

		boolean test = false;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] == lblTexto[indi].getText().charAt(i)) {
				test = true;

			}
		}

		if (test) {
			System.out.println("ganhou");
		} else {
			System.out.println("perdeu");
		}

		if (achou == 0) {

			tentativa--;
		}

		texto2.setText("tentativa " + tentativa);

		perdeu(tentativa);
		ganhou(acertos, indicePalavras);
	}

	
	
	// testa o fim das tentativas
	public void perdeu(int tents) {

		if (tents == 0) {
			JOptionPane.showMessageDialog(Forcaa.this, "Você errou");
			panel2.removeAll();
			novaPalavra();
		}
	}

	
	public void ganhou(int acerts, int indi) {

		if (acerts == palavra[indi].length()) {

			JOptionPane
					.showMessageDialog(Forcaa.this, "Voce acertou a palavra");
			panel2.removeAll();
			novaPalavra();
			acertos = 0;
		}

	}

	public static void main(String[] args) {
		Forcaa f = new Forcaa();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		//f.setVisible(true);
	}
}
