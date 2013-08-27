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
public class ForToDo {

    public static void main(String[] args) {
        Scanner lerNome = new Scanner(System.in);
        Scanner lerSalario = new Scanner(System.in);

        String NomeFuncionario;
        double Salario;
        double SomaSalario = 0;


        for (int i = 1; i <= 4; i++) {
            
            System.out.println("informe o nome do funcionario");
            NomeFuncionario = lerNome.nextLine();
            System.out.println("informe o salario do funcionario");
            Salario = lerSalario.nextDouble();

            SomaSalario += Salario;
        }


        System.out.println("media do salario: " + SomaSalario / 4);
    }
}
