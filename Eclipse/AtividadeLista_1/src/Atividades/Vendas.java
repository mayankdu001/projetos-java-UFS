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
public class Vendas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        double valorCompra;
        double valorEntrada;
        int numeroParcelas;
        double valorFinal;
        double valorParcelado;
        double acrecimo;
        double valorParcela;

        System.out.println("informe o valor total da compra");
        valorCompra = ler.nextDouble();
        System.out.println("informe Valor da entrada");
        valorEntrada = ler.nextDouble();
        System.out.println("Informe total de parcelas");
        numeroParcelas = ler.nextInt();

        valorParcelado = (valorCompra - valorEntrada);

        acrecimo = (valorParcelado * (0.1));

        valorFinal = (valorParcelado + acrecimo);

        valorParcela = (valorFinal / numeroParcelas);

        System.out.println("Valor parcelado: " + valorParcelado);
        System.out.println("Acrecimo: " + acrecimo);
        System.out.println("valor final a parcelar: " + valorFinal);
        System.out.println("valor das parcelas: " + valorParcela);


    }
}
