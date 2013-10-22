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

public class Sobre extends JFrame{
	JPanel spanel[];//oeste
	JLabel txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, campoimgS; // oeste
	ImageIcon imgS; //ICONES PARA OS BOT�ES
	
	public Sobre() {
		
		super("Sobre:");
		
		// CRIA��O DO CONTAINER PRINCIPAL
		Container cp = getContentPane(); 
		
		// CONTAINER PRINCIPAL ADICIONANDO AO BorderLayout COM ESPA�AMENTO DE 10PX POR 10PX
		cp.setLayout(new BorderLayout(10, 10)); 
		
		spanel = new JPanel[7];
		//INICIALIZANDO O ARRAY sul
		for (int i=0; i<spanel.length; i++){
			spanel[i] = new JPanel();
		}
		//INICIALIZANDO O CONTAINER NORTE E SUL
		Container norte = new JPanel();

		txt7 = new JLabel("Regras:");
		norte.add(txt7);
		
		Container sul = new JPanel();
		sul.add(spanel[0].add(txt1 = new JLabel("O jogo � simples. Consiste em adivinhar qual a palavra que est� escondida.")));
		sul.add(spanel[1].add(txt2 = new JLabel("Seu corpo vai entrando na forca aos poucos, a cada letra que erra.")));
		sul.add(spanel[2].add(txt3 = new JLabel("Mas cuidado: voc� s� pode errar seis vezes, pois o s�timo erro custar� sua vida.")));
		sul.add(spanel[3].add(txt4 = new JLabel("1) Leia primeiro a dica para ter uma pista de qual palavra voc� deve descobrir.")));
		sul.add(spanel[4].add(txt5 = new JLabel("2) Clique nas letras que voc� acha que v�o formar a palavra. Se na palavra contiver a letra que voc� escolher,")));
		sul.add(spanel[5].add(txt6 = new JLabel("ela automaticamente aparecer� no lugar correspondente. Caso contr�rio, voc� poder� ser enforcado.")));
		sul.add(spanel[6].add(txt8 = new JLabel("3) Voc� ganha o jogo quando completar a palavra antes de ser enforcado.")));
		sul.setLayout(new BoxLayout(sul, BoxLayout.Y_AXIS));
		
		Container centro = new JPanel();
		imgS = new ImageIcon(getClass().getResource("fotos/sobre.jpg"));
		campoimgS = new JLabel(imgS);
		centro.add(campoimgS);
		
		Style();
		
		cp.add(BorderLayout.NORTH, norte);
		cp.add(BorderLayout.SOUTH, sul);
		cp.add(BorderLayout.CENTER, centro);
		

		setResizable(false);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setVisible(true);
		setSize(1150,600);
	}
	public void Style(){
		txt1.setFont(new Font("Arial", Font.BOLD, 20));
		txt2.setFont(new Font("Arial", Font.BOLD, 20));
		txt3.setFont(new Font("Arial", Font.BOLD, 20));
		txt4.setFont(new Font("Arial", Font.BOLD, 20));
		txt5.setFont(new Font("Arial", Font.BOLD, 20));
		txt6.setFont(new Font("Arial", Font.BOLD, 20));
		txt8.setFont(new Font("Arial", Font.BOLD, 20));
		txt7.setForeground(Color.BLUE);
		txt7.setFont(new Font("Arial", Font.BOLD, 30));
	}
	/*
	public static void main(String[] args) {
		new Sobre();
	}
	 */
}