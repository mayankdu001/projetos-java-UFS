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
public class ComporData {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String dia;
        String mes;
        String ano;
        String data;
        
        System.out.println("informe o dia DD: ");
        dia = ler.next();
        System.out.println("informe o mes MM: ");
        mes = ler.next();
        System.out.println("Informe o ano AAAA: ");
        ano = ler.next();
        
        
        
        data = dia.concat("/");
        data = data.concat(mes);
        data = data.concat("/");
        data = data.concat(ano);
  
      
        System.out.println(data);



    }
}
