package Excecoes;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Excecoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			
			System.out.println("informe o ano");
			int ano = ler.nextInt();
		
		} 
		
		catch (InputMismatchException e) {

			System.out.println("erro");
		}
	

		System.out.println("continuacao");
		
		

	}

}
