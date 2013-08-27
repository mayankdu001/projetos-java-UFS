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
public class TestWhile {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codigo;
        float preco;
        float total = 0;


        System.out.println("informe o codigo");
        codigo = ler.nextInt();


        while (codigo != 0) {

            System.out.println("informe o preco");
            preco = ler.nextFloat();

            total += preco;

            System.out.println("informe o codigo");
            codigo = ler.nextInt();
        }

        System.out.println("total vendidos: " + total);

        System.out.println("Programa finalizado");


    }
}
