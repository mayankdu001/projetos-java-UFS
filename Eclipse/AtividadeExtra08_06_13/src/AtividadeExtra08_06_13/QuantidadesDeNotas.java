/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeExtra08_06_13;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class QuantidadesDeNotas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        int recebe2;
        int recebe;


        System.out.println("informe o numero");
        valor = ler.nextInt();


        recebe = valor / 50;
        recebe2 = valor % 50;
        System.out.println("notas de de 50: " + recebe);
        
        recebe = recebe2 / 10;
        recebe2 = valor % 10;
        System.out.println("notas de 10 : " + recebe);
        
        recebe = recebe2 / 5;
        recebe2 = recebe2 % 5;
        System.out.println("notas de 5: " + recebe);

        System.out.println("notas de 1: " + recebe2);







    }
}
