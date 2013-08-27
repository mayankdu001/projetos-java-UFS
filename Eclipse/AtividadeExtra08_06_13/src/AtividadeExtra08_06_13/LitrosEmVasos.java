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
public class LitrosEmVasos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int NumRecipientes;
        float volumeLiquido;
        double totalrestante;
        System.out.println("informe a quantidade de recipientes");
        NumRecipientes = ler.nextInt();
        System.out.println("informe a quandtidade de liquidos");
        volumeLiquido = ler.nextFloat();

        totalrestante = volumeLiquido - (NumRecipientes * 0.5);


        if (totalrestante > (NumRecipientes * 0.5)) {
            totalrestante = (NumRecipientes*0.5)-volumeLiquido;
            System.out.println("total de recipientes Restantes: " + totalrestante);
        } else if (totalrestante == (NumRecipientes * 0.5)) {
            System.out.println("Todos os recipientes usados sem haver sobras de liquidos");
        } else {

            System.out.println("todos os recipientes foram usados ");
            System.out.println("Liquidos Restantes: " + totalrestante);
        }


    }
}
