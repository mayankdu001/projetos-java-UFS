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
public class MediaJO {

    public static void main(String[] args) {

        String aluno = JOptionPane.showInputDialog("informe o nome do aluno");
        float media = Float.parseFloat(JOptionPane.showInputDialog("informe a media do aluno"));
        float frequencia = Float.parseFloat(JOptionPane.showInputDialog("informe a frequencia"));


        if (media >= 6 & frequencia >= 75) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno Reprovado");
        }

    }
}
