package Calculadora;
import javax.swing.*;
public class CalCompleta extends JFrame{

	JButton um;
	JButton dois;
	JButton tres;
	JButton quatro;
	JButton cinco;
	JButton seis;
	JButton sete;
	JButton oito;
	JButton nove;
	JButton zero;
	JPanel painel1;
	
	
	public CalCompleta(){
		
		um = new JButton();
		dois = new JButton();
		tres = new JButton();
		quatro = new JButton();
		cinco = new JButton();
		seis = new JButton();
		sete = new JButton();
		oito = new JButton();
		nove = new JButton();
		zero = new JButton();
		painel1 = new JPanel();
		
		
		addContainerListener(painel1);
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {


	}

}