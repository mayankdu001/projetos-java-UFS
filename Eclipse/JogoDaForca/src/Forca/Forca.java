package Forca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Forca extends JFrame{
	
	JPanel geral[] = new JPanel[10];
	
	JButton adicionar;
	JButton sair;
	JTextField campoLetras;
	JTextField campoPalavras;
	JLabel letra;
	JLabel palavras;
	
	
	public 	Forca(){
	
		
		adicionar = new JButton("adicionar");
		sair = new JButton("Sair");

		campoLetras = new JTextField(2);
		campoPalavras = new JTextField(10);
		letra = new JLabel("    Letra:      ");
		palavras = new JLabel("Palavra: ");
		for (int i = 0; i < 10; i++) {
			geral[i] = new JPanel();
			
		}
		
		
		
		//geral[1].setLayout(new GridBagLayout());
		add(geral[1]);
	    geral[1].setLayout(new GridLayout(6,0,20,2));
		geral[4].setLayout(new GridLayout(3,2,50,50));
		
		//geral[1].add(geral[6]);
		geral[1].add(geral[7]);
		geral[1].add(geral[8]);
		geral[1].add(geral[2]);
		
		geral[1].add(geral[0]);
		geral[1].add(geral[3]);
		geral[2].add(letra);
		geral[2].add(campoLetras);
		geral[2].add(new JLabel("                              "));
		geral[0].add(palavras);
		geral[0].add(campoPalavras);
		geral[3].add(adicionar);
		
		geral[3].add(sair);
		
//		geral[0].setBackground(Color.gray);
	//	geral[1].setBackground(Color.white);
	//	geral[2].setBackground(Color.blue);
	//	geral[3].setBackground(Color.pink);
	//	geral[4].setBackground(Color.green);
	//	geral[5].setBackground(Color.yellow);
	//	geral[6].setBackground(Color.LIGHT_GRAY);
	//	geral[7].setBackground(Color.black);
	//	geral[8].setBackground(Color.cyan);
		
		add(geral[1], BorderLayout.CENTER);
		//add(geral[4], BorderLayout.CENTER);
		//add(geral[9], BorderLayout.SOUTH);
		//boolean test = false;




		MouseAdapter mouseAdicionar = new MouseAdapter() {
			
			public void mousePressed (MouseEvent e){
				
				if(e.getSource() == adicionar){
				
					Forcaa jogo = new Forcaa();
					
					jogo.pack();
				
					jogo.setVisible(true);
					jogo.setSize(300,300);
					jogo.setLocationRelativeTo(null);
					jogo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
								
				}
				
				if(e.getSource() == sair){
				
					Forcaa jogo = new Forcaa();
					
					jogo.setVisible(true);
				
				}
				
				
			}
			
			
		};
		
	adicionar.addMouseListener(mouseAdicionar);	
	sair.addMouseListener(mouseAdicionar);
		
	
	setSize(300, 300);
	setVisible(true);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		new Forca();
		
		

	}

}
