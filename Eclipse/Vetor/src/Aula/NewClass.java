package Aula;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner impNumero = new Scanner(System.in);
        int[] vetor = new int[4];
        int testNumero;

        //   System.out.println("TAMANHO: "+ vetor.length);{saber o tamanho do vetor }

        int contvet = 0;


        while (contvet != vetor.length) {
            System.out.println("informe o numero");
            testNumero = impNumero.nextInt();

            if (testNumero % 2 == 0) {

                vetor[contvet] = testNumero;
                contvet++;
            }

        }

        for (int i = 0; i < contvet; i++) {
            System.out.println(vetor[i]);

        }

    }
}
