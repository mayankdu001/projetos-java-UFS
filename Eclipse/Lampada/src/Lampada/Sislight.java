package Lampada;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Sislight {

    public static void cadastrarLampada(Lampada newLamp[], int posicao) {
        Scanner imputNumero = new Scanner(System.in);
        newLamp[posicao] = new Lampada();
        newLamp[posicao].setcodigo(posicao + 1);
        System.out.println("informe a potencia");
        newLamp[posicao].setPotencia(imputNumero.nextInt());


    }

    public static void main(String[] args) {
        Scanner imputNumero = new Scanner(System.in);
        Lampada newLamp[] = new Lampada[5];
        int posicao = 0;
        int opcao;
        int op;
        int potenciaTotal = 0;
        int cod;
        int posicaoFor = 0;
        for (int i = 0; i < newLamp.length; i++) {
            newLamp[i] = new Lampada();
        }
        do {

            System.out.println("1-cadastrar lampada");
            System.out.println("2-ligar lampada");
            System.out.println("3-Desligar Lampada");
            System.out.println("4-Consultar potencia");
            System.out.println("5-sair");
            opcao = imputNumero.nextInt();

            switch (opcao) {
                case 1:
                    do {
                        cadastrarLampada(newLamp, posicao);
                        posicao++;

                        System.out.println("1-sim");
                        System.out.println("2-voltar ao menu anterior");
                        System.out.println("informe a opcao");
                        op = imputNumero.nextInt();

                    } while (op != 2);

                    break;
                case 2:
                    System.out.println("informe o codigo da lampada");
                    cod = imputNumero.nextInt();
                    for (int i = 0; i < posicao; i++) {
                        newLamp[i].ligarLampada(cod);
                        if (cod == newLamp[i].getCodigo()) {
                            posicaoFor = i;
                        }

                    }
                    newLamp[posicaoFor].imprimirDados();
                    break;
                case 3:
                    System.out.println("informe o codigo da lampada");
                    cod = imputNumero.nextInt();
                    for (int i = 0; i < posicao; i++) {
                        newLamp[i].desligarLampada(cod);
                        if (cod == newLamp[i].getCodigo()) {
                            posicaoFor = i;
                        }

                    }
                    newLamp[posicaoFor].imprimirDados();
                    break;
                case 4:

                    for (int i = 0; i < posicao; i++) {

                        potenciaTotal = newLamp[i].calcularPotencia(posicao, newLamp);


                    }
                    System.out.println("Potencia: " + potenciaTotal);
                    break;
                case 5:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("opcao invalida");
                    System.out.println("Favor digitar a opcao indicada no menu");
                    break;

            }

        } while (opcao != 5);

    }
}
