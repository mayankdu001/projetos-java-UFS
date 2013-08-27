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
public class DestaqueTexto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String PrimeiraPalavra;
        String SegundaPalavra;
        String TerceiraPalavra;


        System.out.println("Informe a primeira palavra");
        PrimeiraPalavra = ler.nextLine();
        System.out.println("informe a segunda palavra");
        SegundaPalavra = ler.nextLine();
        System.out.println("Informe a terceira palavra");
        TerceiraPalavra = ler.nextLine();

        int tamanho1 = PrimeiraPalavra.length();
        int tamanho2 = SegundaPalavra.length();
        int tamanho3 = TerceiraPalavra.length();

        if (tamanho1 > tamanho2 && tamanho1 > tamanho3) {
            PrimeiraPalavra = PrimeiraPalavra.toUpperCase();

            System.out.println(PrimeiraPalavra);
            System.out.println(SegundaPalavra);
            System.out.println(TerceiraPalavra);

        } else if ( tamanho2 > tamanho1 && tamanho2 > tamanho3 ) {
            SegundaPalavra = SegundaPalavra.toUpperCase();
            
            System.out.println(TerceiraPalavra);
            System.out.println(PrimeiraPalavra);
            System.out.println(SegundaPalavra);

        } else {
            TerceiraPalavra = TerceiraPalavra.toUpperCase();

            System.out.println(SegundaPalavra);
            System.out.println(PrimeiraPalavra);
            System.out.println(TerceiraPalavra);
        }




    }
}
