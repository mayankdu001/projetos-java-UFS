/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_If;
import java.util.Scanner;
/**
 *
 * @author Alan
 */
public class ExemploIfElseIf {

    public static void main (String[] args) {
        
        String vendedor;
        double  totalVendas;
        double valorComissao;
        
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("informe o nome do vendedor");
        vendedor = ler.nextLine();
        System.out.println("informe o valor total da venda");
        totalVendas = ler.nextDouble();
        
        if (totalVendas <= 500){
            valorComissao = 0.1* totalVendas;
            
        }else if (totalVendas <=1000){
            valorComissao = 0.2 * totalVendas;
            
        }else{
            
            valorComissao = 0.3 * totalVendas;
        }
                
        System.out.println("valor da comissão: "+ valorComissao);
    }
}
