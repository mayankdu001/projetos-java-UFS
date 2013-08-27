/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula15_06_13;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class DoWhile {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        int op;
        do {            
            System.out.println("1-cadastro");
            System.out.println("2-conultas");
            System.out.println("3-relatorios");
            System.out.println("4-sair");
            System.out.println("informe a opcao");
            op = ler.nextInt();
        } while (op!=4);
        
        
    }
    
}
