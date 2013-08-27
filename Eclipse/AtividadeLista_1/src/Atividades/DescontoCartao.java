/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class DescontoCartao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorCompra;
        boolean pgcartao;
        double valorFinal;
        System.out.println("informe o valor da compra");
        valorCompra = ler.nextDouble();
        System.out.println("pagamento no cartão?");
        pgcartao = ler.nextBoolean();

        if (pgcartao == true) {
            valorFinal = valorCompra - (valorCompra * (0.1));
            System.out.println("valor a ser pago: " + valorFinal);
            
        }else{
        valorFinal = valorCompra - (valorCompra * (0.05));
        System.out.println("valor final: " + valorFinal);
         }

    }
}
