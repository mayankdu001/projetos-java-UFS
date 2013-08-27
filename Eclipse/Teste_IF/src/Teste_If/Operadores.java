/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_If;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class Operadores {
public static void main (String [] orgs){
    float a = 25;
    float b = 10;
    float resultadoReal;
    
    
    resultadoReal = a + b;
    System.out.println("Soma: "+ resultadoReal);
    resultadoReal = a - b;
    System.out.println("Subtração"+ resultadoReal);
    resultadoReal = a * b;
    System.out.println("Multiplicação"+ resultadoReal);
    resultadoReal = a / b;
    System.out.println("Divisão: "+ resultadoReal);
    resultadoReal = a % b;
    System.out.println("Resto: "+ resultadoReal);
    
    
    JOptionPane.showMessageDialog(null, "soma : "+(a +b)+
                                        "\n subtração; "+(a-b)+
                                        "\n Multiplicação: "+(a*b)+
                                        "\n Divisão: "+ (a/b)+
                                        "\n Resto: " + (a%b));
        
   
}    
}
