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
public class MediaFinal {

    public static void main(String[] args) {

        Scanner lerNome = new Scanner(System.in);
        Scanner lerNotas = new Scanner(System.in);

        String Nome;
        float notas;
        float somaNotas = 0;

        System.out.println("informe o nome do aluno");
        Nome = lerNome.nextLine();
        for (int i = 1; i <= 4; i++) {
            System.out.println("informe a " + i + "º nota: ");
            notas = lerNotas.nextFloat();
            somaNotas += notas;
        }

        System.out.println("Nome: " + Nome);
        System.out.println("Media final = " + somaNotas / 4);

    }
}
