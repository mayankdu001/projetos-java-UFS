/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;
//Jack jhonson
//Ben harper

/**
 *
 * @author Alan
 */
public class MetodosString {

    public static void main(String[] args) {
        String nome1 = "Alan";
        String nome2 = " Passos";
        int tamanho;
        String Texto = "senai";
        String Palavra = "senai";
        

        
        nome1 = nome1.toUpperCase();
        System.out.println(nome1);
        // transforma minusculo em maiusculo
        
        nome2 = nome2.toLowerCase();
        System.out.println(nome2);
        // transforma maiusculo em menusculo
        
        nome1 = nome1.concat(nome2);
        System.out.println(nome1);
        //concatena dois nomes
       
        nome2 = nome2.replace("s", "T");
        System.out.println(nome2);
        //troca um caracter por outro 
        
        tamanho = nome2.length();
        System.out.println(tamanho);
        // usar pra descobrir o tamanho da string
        
        
        if (Texto.equals(Palavra)){
               //metodo pra comparar
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        
    }
}
