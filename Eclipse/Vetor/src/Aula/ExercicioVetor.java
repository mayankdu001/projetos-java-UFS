package Aula;

import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args) {
        Scanner impNumero = new Scanner(System.in);
        int numero[] = new int[5];
        int aux;


        for (int i = 0; i < 5; i++) {
            System.out.println("informe o" + i + "º numero");
            numero[i] = impNumero.nextInt();


        }

        int maior = numero[0];
        for (int i = 0; i < 5; i++) {

            if (numero[i] > maior) {
                maior = numero[i];
            }

        }


        int menor = numero[0];
        for (int i = 0; i < 5; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        System.out.println("#### NUMEROS MAIORES OU MENORES ###");
        System.out.println("meior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("####################################");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numero[i]);
        }

    }
}
