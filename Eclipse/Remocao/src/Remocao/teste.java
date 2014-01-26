package Remocao;

import javax.swing.JOptionPane;
/**
 * Write a description of class teste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teste
{
    public static void main(String args[])
    {
     Lista numeros = new Lista(10);
     for (int cont = 0; cont < 6; cont++)
        numeros.insereNOrd((cont+1)*2); 
        
     numeros.exibe();    
     numeros.insereOrdNovo(3);
     numeros.exibe();
     numeros.insereOrdNovo(1);
     numeros.exibe();
     numeros.insereOrdNovo(20);
     numeros.exibe();
    }
}
