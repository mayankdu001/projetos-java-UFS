package Busula;

import java.awt.*;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Busula {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Exemplo de aplica��o swing");
		JPanel c = new JPanel();
		frame.getContentPane().add(c);
		/*
		 * JButton butaoCentro = new JButton("Centro"); JButton butaoNorte = new
		 * JButton("Norte"); JButton butaoSul = new JButton("Sul"); JButton
		 * butaoLeste = new JButton("Leste"); JButton butaoOeste = new
		 * JButton("Oeste");
		 */
		frame.setSize(300, 300);

		/*
		 * c.add(butaoCentro, BorderLayout.CENTER); c.add(butaoNorte,
		 * BorderLayout.NORTH); c.add(butaoSul, BorderLayout.SOUTH);
		 * c.add(butaoLeste, BorderLayout.EAST); c.add(butaoOeste,
		 * BorderLayout.WEST);
		 */

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JButton("Norte"), BorderLayout.NORTH);
		frame.add(new JButton("Centro"), BorderLayout.CENTER);
		frame.add(new JButton("Sul"), BorderLayout.SOUTH);
		frame.add(new JButton("Leste"), BorderLayout.EAST);
		frame.add(new JButton("Oeste"), BorderLayout.WEST);

		frame.setVisible(true);
	}
}