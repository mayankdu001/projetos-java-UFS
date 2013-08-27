package Aula_20_07_13;

import java.util.Scanner;

public class TypeVetor {

    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        int tamanho;
        int A[] = new int[10];
        int B[] = new int[10];

        System.out.println("informe a quantidade do vetor que quer ocupar de 0 a 10");
        tamanho = lerNumero.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.println("informe os valores do vetor A");
            A[i] = lerNumero.nextInt();
        }

        for (int i = tamanho; i < A.length; i++) {
            A[i] = 0;
        }

        int j = 0;
        //           6              9
        for (int i = tamanho; i < A.length; i++) {
            B[j] = A[i];
            j++;

        }


        j = 0;
        for (int i = A.length - tamanho; i < A.length; i++) {
            B[i] = A[j];
            j++;
        }


        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

    }
}
