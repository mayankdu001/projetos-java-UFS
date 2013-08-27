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
public class SwitchCase {

    public static void main(String[] args) {
  int cont = 0;
  int op;      
  do {
      
  op = Integer.parseInt(JOptionPane.showInputDialog(null, "1- cadastrar cliente"
                + "\n 2 - cadastrar produto"
                + "\n 3 - consultar pedido"
                + "\n 4 - imprimir boleto", "informe a opção"));
  cont++;   
  if (cont > 5) {
      JOptionPane.showMessageDialog(null, "ta errado viado c é burro é q num ta vendo ??");
      break;
  }
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "aqui vc cadastra cliente");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "aqui vc cadastra produto");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "aqui vc consulta pedido");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "imprimir boleto");
                break;
            default:
                
                JOptionPane.showMessageDialog(null, "opcao invalida");
                break;
         }
        } while (op<1 | op >4);

    }
}
