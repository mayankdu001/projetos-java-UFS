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
public class ComporEmail {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String Nome;
        String SobreNome;
        String DataNascimento;
        String email1, email2, email3, emailAux;
        String complemento = "@brasil.com.br";

        System.out.println("informe o nome");
        Nome = ler.next();
        System.out.println("informe o sobrenome");
        SobreNome = ler.next();
        System.out.println("informe a ano de Nascimento");
        DataNascimento = ler.next();


        email1 = Nome.concat(SobreNome);
        //concatenei o nome com o sobre nome
        emailAux = email1;
        email1 = email1.concat(complemento);
        //concatenei o email1 com o complemento
        email1 = email1.toLowerCase();
        // transformei todos em minusculo
        email2 = SobreNome.concat(Nome);
        email2 = email2.concat(complemento);
        email2 = email2.toLowerCase();

        email3 = emailAux.concat(DataNascimento);
        email3 = email3.concat(complemento);
        email3 = email3.toLowerCase();

        System.out.println("email1: " + email1);
        System.out.println("Email2: " + email2);
        System.out.println("Email3: " + email3);


    }
}
