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
public class Funcionario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int matricula;
        String nome;
        double salario;
        boolean sindicalizacao;
        
        System.out.println("informe a matricula");
        matricula = ler.nextInt();
        System.out.println("informe o nome do funcionario");
        nome = ler.next();
        System.out.println("Informe o salario ");
        salario = ler.nextDouble();
        System.out.println("informe se é sindicalizado ");
        sindicalizacao = ler.nextBoolean();
        
        
        
        System.out.println("matricula: "+ matricula);
        System.out.println("nome: "+nome);
        System.out.println("Salario: "+ salario);
        System.out.println("sindicalizado: "+ sindicalizacao);
        
        



    }
}
