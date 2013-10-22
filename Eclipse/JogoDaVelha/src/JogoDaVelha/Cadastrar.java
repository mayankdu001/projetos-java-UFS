package JogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class Cadastrar extends JFrame {

	
	public Cadastrar(){
		
		Container c = getContentPane();
		Container c2 = getContentPane();
		c.add(new JLabel("Jogador 1"));
		c.add(new JTextField(10));
		
		//c.add(new JLabel("Jogador 2"));
		//c.add(new JTextField(10));
		
		c.setLayout(new GridLayout(6,3));
		c2.setLayout(new BorderLayout());
		c2.add( c, BorderLayout.WEST);
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new Cadastrar();
		
		

	}

}
