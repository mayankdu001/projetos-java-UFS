package Janela;

import javax.swing.JFrame;
import java.awt.Color;

public class DrownPainelTest {

	public static void main(String[] args) {
		
		DrowPanel painel = new DrowPanel();
		
		painel.setBackground(Color.CYAN);
		
		JFrame aplicacao = new JFrame("exemplo de desenho");
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(250,250);
		aplicacao.setVisible(true);
		

	}

}
