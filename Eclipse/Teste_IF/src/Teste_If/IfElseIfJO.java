/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste_If;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class IfElseIfJO {
    public static void main (String [] args){
        double valorcomissao;
        String vendedor = JOptionPane.showInputDialog("informe o vendedor");
        double totalVendas = Double.parseDouble(JOptionPane.showInputDialog("inforem o total de vendas"));
        
        if (totalVendas <=500) {
            valorcomissao = 0.1 * totalVendas;
            
        }else if (totalVendas <=100) {
            valorcomissao = 0.2 * totalVendas;
        }else{
            valorcomissao = 0.3 * totalVendas;
        }
            JOptionPane.showMessageDialog(null,"valor da comissão R$ "+valorcomissao);
        
    }
    
    
}
