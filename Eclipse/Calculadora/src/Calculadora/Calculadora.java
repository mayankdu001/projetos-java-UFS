package Calculadora;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora extends JFrame {

	JPanel painel1;
	JPanel painel2;
	JPanel painel3;
	JButton soma;
	JButton subtrair;
	JLabel numero1;
	JLabel numero2;
	JLabel resultado;
	JTextField campo1;

	JTextField campo2;
	JTextField campo3;

	double valor1 = 0;
	double valor2 = 0;
	double result = 0;

	public Calculadora() {

		super("Calculadora");

		painel1 = new JPanel();
		soma = new JButton("soma");
		subtrair = new JButton("subtrair");
		numero1 = new JLabel("Primeiro numero");
		numero2 = new JLabel("segundo numero");
		resultado = new JLabel("Resultado");
		campo1 = new JTextField(4);
		campo2 = new JTextField(4);
		campo3 = new JTextField(4);
		painel2 = new JPanel();
		painel3 = new JPanel();

		add(painel1, BorderLayout.WEST);

		painel1.add(numero1);
		painel1.add(campo1);
		painel1.add(numero2);
		painel1.add(campo2);

		add(painel2, BorderLayout.SOUTH);
		painel2.add(resultado);
		painel2.add(campo3);
		painel2.add(soma);
		painel2.add(subtrair);

		MouseAdapter mouseGer = new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				valor1 = Double.parseDouble(campo1.getText());
				valor2 = Double.parseDouble(campo2.getText());

				if (e.getSource() == soma) {

					result = (valor1 + valor2);

					campo3.setText(String.valueOf(result));
					campo3.setEnabled(false);
				} else {

					result = (valor1 - valor2);

					campo3.setText(String.valueOf(result));
					campo3.setEnabled(false);

				}
			}

		};

		soma.addMouseListener(mouseGer);
		subtrair.addMouseListener(mouseGer);
		
		
		
		
		getContentPane().add(painel1);

	}
	
	
	

	public static void main(String[] args) {
		Calculadora aplicacao = new Calculadora();

		aplicacao.setSize(340, 200);
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.setVisible(true);

	}

}
