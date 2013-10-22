/*
 * Universidade Federal de Sergipe 
 * Campus Dr.Alberto Carvalho
 * Curso de Sistemas De Informação
 * Matéria: Programação 2
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
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame{
JLabel clab1, clab2;
JButton but1, but2;
Container cent, su;
Container cpane1, cpane2, spane;
JTextField txtname, txtdic;
	public Cadastro(){
		super("Cadastro de Palavras:");
		
		Container all = getContentPane();
		//Centro
		cent = new JPanel();
		cpane1 = new JPanel();
		cpane2 = new JPanel();
		
		clab1 = new JLabel();
		clab1.setFont(new Font("Comic Sans MS", 1, 11));
	    clab1.setText("Insira a Palavra:");
	    txtname = new JTextField(10);
	    cpane1.add(clab1);
	    cpane1.add(txtname);
	    
	    clab2 = new JLabel();
	    clab2.setFont(new Font("Comic Sans MS", 1, 11));
	    clab2.setText("Insira a Dica:");
	    txtdic = new JTextField(10);
	    cpane2.add(clab2);
	    cpane2.add(txtdic);
	    
	    cent.add(cpane1);
	    cent.add(cpane2);
	    
	    //sul
	    su = new JPanel();
	    spane = new JPanel();
	    but1 = new JButton();
	    but2 = new JButton();
	    
	    but1.setIcon(new ImageIcon(getClass().getResource("fotos/save.jpg")));
	    but1.setText("Salvar");
	    but2.setIcon(new ImageIcon(getClass().getResource("fotos/cancel.jpg")));
	    but2.setText("Cancelar");
	    
	    spane.add(but1);
	    spane.add(but2);
	    su.add(spane);
	    
	//  all.add(BorderLayout.NORTH, norte);
	    all.add(BorderLayout.SOUTH, su);
		all.add(BorderLayout.CENTER, cent);
	//	all.add(BorderLayout.EAST, leste);
	//	all.add(BorderLayout.WEST, oeste);
		
		MouseAdapter mousebut = new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				if ((e.getSource() == but1)){
					try{
				BufferedWriter arquivo;
				String valores = txtname.getText() + "#" + txtdic.getText();
				// abre o arquivo de texto para acrescentar linhas
				arquivo = new BufferedWriter(new FileWriter("Palavras.txt", true));
				// escreve a linha de texto
				arquivo.write(valores);
				// insere uma quebra de linha
				arquivo.newLine();
				// força a gravação dos dados em disco
				arquivo.flush();
				arquivo.close();
		                txtname.setText("");
		                txtdic.setText("");
					}
					catch (IOException erro){
					// trata o erro
					}
				}else{
					dispose();
				}
			}
		};
		but1.addMouseListener(mousebut);
		but2.addMouseListener(mousebut);
		
		setResizable(false);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
		setSize(300, 150);
	}
	public static void main(String[] args) {
		new Cadastro();
	}
}