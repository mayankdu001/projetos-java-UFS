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
public class MediaTurma {

    public static void main(String[] args) {
        Scanner lerAluno = new Scanner(System.in);
        Scanner lerMedia = new Scanner(System.in);
        Scanner lerMatrcula = new Scanner(System.in);


        int Matricula, cont = 0;
        String Nome;
        double Media;
        double SomaMedia = 0;

        System.out.println("informe a matricula do aluno");
        Matricula = lerMatrcula.nextInt();

        while (Matricula != 0) {

            cont++;

            System.out.println("informe o nome do aluno");
            Nome = lerAluno.nextLine();

            System.out.println("informe a Media do aluno");
            Media = lerMedia.nextDouble();

            SomaMedia += Media;

            System.out.println("informe a matricula do aluno");
            Matricula = lerMatrcula.nextInt();
            


        }

        System.out.println("Media Geral: " + SomaMedia / cont);


    }
}
