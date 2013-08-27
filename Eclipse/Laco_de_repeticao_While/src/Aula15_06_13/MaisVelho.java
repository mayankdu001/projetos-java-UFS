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
public class MaisVelho {

    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerIdade = new Scanner(System.in);
        String Nome;
        int Idade;
        int maior = 0;
        String aux = null;

        System.out.println("informe o nome");
        Nome = lerNome.nextLine();


        while (!(Nome.equals("fim"))) {

            System.out.println("informe a idade");
            Idade = lerIdade.nextInt();

            if (Idade >= maior) {
                maior = Idade;
                aux = Nome;


            }
            System.out.println("informe o nome");
            Nome = lerNome.nextLine();


        }

        System.out.println("nome: " + aux);
        System.out.println("Idade: " + maior);




    }
}
