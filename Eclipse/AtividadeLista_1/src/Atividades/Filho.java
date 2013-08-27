/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class Filho {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        short filho1;
        int filho2;
        String nome1;
        String nome2;
        System.out.println("informe o nome do primeiro filho");
        nome1 = ler.nextLine();
        System.out.println("informe a idade do primeiro filho");
        filho1=ler.nextShort();
        System.out.println("informe o nome do segundo filho");
        nome2 = ler.next();
        System.out.println("informe a idade do segundo filho");
        filho2 = ler.nextInt();
        if (filho1 > filho2) {
            System.out.println("o filho mais velho  ");
            System.out.println("Nome: "+nome1);
            System.out.println("Idade: "+ filho1);
            
        }else if (filho1<filho2){
            System.out.println("o filho mais velho  ");
            System.out.println("Nome: "+nome2);
            System.out.println("Idade: "+ filho2);
            
            
        }else{
            System.out.println("os dois filhos são gemeos  ");
            
        }
        
    }
    
}
