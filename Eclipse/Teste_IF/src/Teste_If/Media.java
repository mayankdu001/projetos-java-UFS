/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_If;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class Media {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        String aluno;
        float media;
        float frequencia;




        System.out.println("Informe o nome do aluno");
        aluno = ler.nextLine();
        System.out.println("informe a media do aluno");
        media = ler.nextFloat();
        System.out.println("Informe a frequencia ");
        frequencia = ler.nextFloat();



        if (media >= 6 & frequencia >= 75) {

            System.out.println("Aluno Aprovado");
        } else {

            System.out.println("Aluno Reprovado");
        }


    }
}
