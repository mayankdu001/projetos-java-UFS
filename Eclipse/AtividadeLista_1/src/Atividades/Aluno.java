package Atividades;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class Aluno {

    public static void main(String[] args) {
        int matricula = 23;
        String aluno = "claudio alencar";
        float mediaFinal = (float) 7.5;
        char sexo = 'M';
        boolean alunoAprovado = true;
        System.out.println("Matricula: " + matricula);
        System.out.println("Aluno: " + aluno);
        System.out.println("Media Final" + mediaFinal);
        System.out.println("Sexo" + sexo);
        System.out.println("Aluno Aprovado" + alunoAprovado);
        JOptionPane.showMessageDialog(null, "bem vindo ao inferno");
                
    }
}
