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
public class AreaDeTriangulos {

    public static void main(String[] args) {

        float base;
        float altura;
        float baseMenor;
        int opcao;

        Scanner ler = new Scanner(System.in);

        do {



            System.out.println("CALCULADOR DE AREA");
            System.out.println("1 - Ã�rea do RetÃ¢ngulo");
            System.out.println("2 - Ã�rea do Triangulo");
            System.out.println("3 - Ã�rea do TrapÃ©zio ");
            System.out.println("0-sair");
            System.out.println("Escolha uma opÃ§Ã£o");
            opcao = ler.nextInt();

            if (opcao == 0) {
                System.out.println("Programa Finalizado");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite a base");
                    base = ler.nextInt();
                    System.out.println("Digite a altura");
                    altura = ler.nextInt();

                    System.out.println("Area do retÃ¢ngulo " + base * altura);
                    break;

                case 2:
                    System.out.println("Digite a base");
                    base = ler.nextInt();
                    System.out.println("Digite a altura");
                    altura = ler.nextInt();

                    System.out.println("Area do Triangulo " + (base * altura) / 2);
                    break;

                case 3:
                    System.out.println("Digite a base maior");
                    base = ler.nextInt();
                    System.out.println("Digite a base menor");
                    baseMenor = ler.nextInt();
                    System.out.println("Digite a altura");
                    altura = ler.nextInt();
                    System.out.println("Area do TrapÃ©zio " + ((base * baseMenor) * altura) / 2);
                    break;

                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida");
                    break;

            }
        } while (opcao != 0);

    }