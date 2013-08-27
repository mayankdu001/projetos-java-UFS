package Aula_20_07_13;

import java.util.Scanner;

public class Revisao3 {

    public static void main(String[] args) {
        Scanner impNumero = new Scanner(System.in);
        int numero[] = new int[5];
        for (int i = 0; i < numero.length - 1; i++) {
            System.out.println("informe o numero");
            numero[i] = impNumero.nextInt();
            numero[numero.length - 1] += numero[i];
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero: " + numero[i]);
        }

    }
}
