package Aula_20_07_13;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner impNumero = new Scanner(System.in);
        Scanner impNome = new Scanner(System.in);

        String nome[] = new String[4];
        double salario[] = new double[4];
        double aumento[] = new double[4];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("informe o nome: ");
            nome[i] = impNome.nextLine();
            System.out.println("informe o salario");
            salario[i] = impNumero.nextDouble();
        }
        for (int i = 0; i < aumento.length; i++) {
            aumento[i] = salario[i] * 0.1;

        }

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Aumento: " + aumento[i]);

        }
    }
}
