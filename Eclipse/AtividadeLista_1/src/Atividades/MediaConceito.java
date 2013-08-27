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
public class MediaConceito {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        float media;
        String nome;

        System.out.println("informe o nome");
        nome = ler.nextLine();
        System.out.println("Informe a Média");
        media = ler.nextFloat();

        if (media < 4) {
            System.out.println("Aluno: " + nome);
            System.out.println("Conceito: D");
        } else if (media >= 4 && media < 6) {
            System.out.println("Aluno: " + nome);
            System.out.println("Conceito: C");
        }else if (media >=6 && media <8.5){
            System.out.println("Aluno: "+nome);
            System.out.println("Conceito: B");
        }else {
            System.out.println("Aluno: "+nome);
            System.out.println("Conceito A");
        }


     }
}