/*
 * Universidade Federal de Sergipe 
 * Campus Dr.Alberto Carvalho
 * Curso de Sistemas De Informa��o
 * Mat�ria: Programa��o 2
 * Prof:Mai-Ly Vanessa
 * 
 * Sistema Desenvolvido Por 
 * 
 * Edson Lima 
 * Anderson Andrade
 * Yuri
 * 
 */




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Regras extends JFrame{
	JPanel spane[];//oeste
	JLabel tx0, tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, campoi; // oeste
	ImageIcon im; //ICONES PARA OS BOT�ES
	
	public Regras() {
		
		super("Regras:");
		
		// CRIA��O DO CONTAINER PRINCIPAL
		Container cp = getContentPane(); 
		
		// CONTAINER PRINCIPAL ADICIONANDO AO BorderLayout COM ESPA�AMENTO DE 10PX POR 10PX
		cp.setLayout(new BorderLayout(10, 10)); 
		
		spane = new JPanel[8];
		//INICIALIZANDO O ARRAY sul
		for (int i=0; i<spane.length; i++){
			spane[i] = new JPanel();
		}
		//INICIALIZANDO O CONTAINER NORTE E SUL
		Container norte = new JPanel();

		tx7 = new JLabel("Regras:");
		norte.add(tx7);
		
		Container sul = new JPanel();
		sul.add(spane[0].add(tx1 = new JLabel("O jogo da forca � baseado em acertos e erros, sendo que voc� tem um n�mero m�nimo de erros")));
		sul.add(spane[1].add(tx2 = new JLabel("e ao ultrapassar voc� perde. O jogo � seguido de pontua��es:")));
		sul.add(spane[2].add(tx3 = new JLabel("1) Ao acertar uma letra da palavra sorteada, voc� ganhar� 50 pontos;")));
		sul.add(spane[3].add(tx4 = new JLabel("2) Ao errar uma letra, voc� perder� 30 pontos;")));
		sul.add(spane[4].add(tx5 = new JLabel("3) Ao repetir alguma letra, voc� ganhar� 10 pontos;")));
		sul.add(spane[5].add(tx6 = new JLabel("4) Ao tentar reiniciar o jogo em qualquer momento da partida voc� perder� 200 pontos;")));
		sul.add(spane[6].add(tx8 = new JLabel("5) Ao completar uma palavra voc� receber� mais 100 pontos;")));
		sul.add(spane[6].add(tx0 = new JLabel("6) O placar s� encerrar� quando voc� perder;")));
		sul.setLayout(new BoxLayout(sul, BoxLayout.Y_AXIS));
		
		Container centro = new JPanel();
		im = new ImageIcon(getClass().getResource("fotos/rules.png"));
		campoi = new JLabel(im);
		centro.add(campoi);
		
		Style();
		
		cp.add(BorderLayout.NORTH, norte);
		cp.add(BorderLayout.SOUTH, sul);
		cp.add(BorderLayout.CENTER, centro);
		

		setResizable(false);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setSize(950,600);
	}
	public void Style(){
		tx0.setFont(new Font("Arial", Font.BOLD, 20));
		tx1.setFont(new Font("Arial", Font.BOLD, 20));
		tx2.setFont(new Font("Arial", Font.BOLD, 20));
		tx3.setFont(new Font("Arial", Font.BOLD, 20));
		tx4.setFont(new Font("Arial", Font.BOLD, 20));
		tx5.setFont(new Font("Arial", Font.BOLD, 20));
		tx6.setFont(new Font("Arial", Font.BOLD, 20));
		tx8.setFont(new Font("Arial", Font.BOLD, 20));
		tx7.setForeground(Color.BLUE);
		tx7.setFont(new Font("Arial", Font.BOLD, 30));
	}
	/*
	public static void main(String[] args) {
		new Regras();
	}
	 */
}