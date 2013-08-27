package Aula_20_07_13;

import java.util.Scanner;

public class NewClass {

    public static void CadastrarCliente(String matrizCadastro[][],
            int vetorcodCliente[]) {

        Scanner entNumero = new Scanner(System.in);

        Scanner entInformacoes = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o Nome do " + (i + 1) + "o. cliente: ");
            matrizCadastro[i][0] = entInformacoes.nextLine();
            System.out.println("Informe o CPF do " + (i + 1) + "o. cliente: ");
            matrizCadastro[i][1] = entInformacoes.nextLine();
            System.out.println("Informe o Celular " + (i + 1) + "o. cliente: ");
            matrizCadastro[i][2] = entInformacoes.nextLine();
            System.out.println("Informe o Código do " + (i + 1) + "o. cliente");
            vetorcodCliente[i] = entNumero.nextInt();
        }

    }

    public static void imprimeCadastroCliente(String matrizCadastro[][],
            int vetorcodCliente[]) {

        for (int i = 0; i < 2; i++) {
            System.out.println("===================================");
            System.out.println("Nome: " + matrizCadastro[i][0]);
            System.out.println("CPF: " + matrizCadastro[i][1]);
            System.out.println("Celular: " + matrizCadastro[i][2]);
            System.out.println("Código do Cliente: " + vetorcodCliente[i]);
            System.out.println("===================================");
        }

    }

    public static void CadastrarCarro(String matrizCarro[][],
            int vetorCodCarro[], int vetorAnoCarro[]) {

        Scanner entNumero = new Scanner(System.in);

        Scanner entInformacoes = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Informe a Marca do  " + (i + 1) + "o. carro: ");
            matrizCarro[i][0] = entInformacoes.nextLine();
            System.out.println("Informe o Modelo do " + (i + 1) + "o. carro: ");
            matrizCarro[i][1] = entInformacoes.nextLine();
            System.out.println("Informe a Placa " + (i + 1) + "o. carro: ");
            matrizCarro[i][2] = entInformacoes.nextLine();
            System.out.println("Informe a Cor " + (i + 1) + "o. carro: ");
            matrizCarro[i][3] = entInformacoes.nextLine();
            System.out.println("Informe o Motor " + (i + 1) + "o. carro: ");
            matrizCarro[i][4] = entInformacoes.nextLine();
            System.out.println("Informe o Código do " + (i + 1) + "o. carro");
            vetorCodCarro[i] = entNumero.nextInt();
            System.out.println("Informe o Ano do " + (i + 1) + "o. carro");
            vetorAnoCarro[i] = entNumero.nextInt();

        }

    }

    public static void imprimeCadastrarCarro(String matrizCarro[][],
            int vetorCodCarro[], int vetorAnoCarro[]) {

        for (int i = 0; i < 2; i++) {
            System.out.println("===================================");
            System.out.println("Marca: " + matrizCarro[i][0]);
            System.out.println("Modelo: " + matrizCarro[i][1]);
            System.out.println("Placa: " + matrizCarro[i][2]);
            System.out.println("Cor: " + matrizCarro[i][3]);
            System.out.println("Motor: " + matrizCarro[i][4]);
            System.out.println("Código do Carro: " + vetorCodCarro[i]);
            System.out.println("Ano do Carro: " + vetorAnoCarro[i]);
            System.out.println("===================================");
        }
    }

    public static void caseTres(int TestCarro, int test, int codCliente[],
            int codCarro[], int codLocacao[], String dia, String mes,
            String ano, boolean statusLoc, String statusLocacao[], int opcaoMenu, int opcaoInterna) {


        Scanner entNumero = new Scanner(System.in);
        Scanner entOpcInterna = new Scanner(System.in);
        Scanner entInfo = new Scanner(System.in);
        int i = 0;
        boolean entraCliente;
        boolean entraCarro;

        do {
            entraCarro = false;
            entraCliente = false;
            System.out.println("Entre com o Código do Cliente: ");
            test = entNumero.nextInt();

            for (int j = 0; j < 2; j++) {

                if (test == codCliente[i]) {
                    entraCliente = true;
                }
            }


            if (entraCliente) {
                do {// esse do ai é pra o q vc me pediu pra quando só a do carro for errada 
                    System.out
                            .println("Entre com o Código do Carro: ");
                    TestCarro = entNumero.nextInt();

                    for (int j = 0; j < 2; j++) {
                        if (TestCarro == codCarro[j]) {
                            entraCarro = true;
                        }

                    }

                    if (entraCarro) {
                        System.out.println("Entre com código da Locação");
                        codLocacao[i] = entNumero.nextInt();


                        System.out.println("=====================");

                        System.out.println("Entre com o dia: ");
                        dia = entInfo.nextLine();

                        System.out.println("Entre com o mes: ");
                        mes = entInfo.nextLine();

                        System.out.println("Entre com o ano: ");
                        ano = entInfo.nextLine();
                        System.out.println("=====================");

                        statusLoc = true;



                        if (statusLoc) {

                            statusLocacao[i] = "Locado";
                        } else {

                            statusLocacao[i] = "Disponível";
                        }
                        i++;
                    } else {
                        System.out.println("Informação não cadastrada! Favor Repetir a operação! ");

                    }
                } while (entraCarro == false);// esse do ai é pra o q vc me pediu pra quando só a do carro for errada 
            } else {
                System.out.println("Informação não cadastrada! Favor Repetir a operação! ");
            }


            System.out.println("Deseja continuar cadastrando?");
            System.out.println("1 - Continuar Cadastrando");
            System.out.println("2 - Retorna ao Menu Principal");

            opcaoInterna = entOpcInterna.nextInt();



        } while (opcaoInterna != 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int TestCarro = 0;
        int test = 0;
        String cliente[][] = new String[2][3];

        int codCliente[] = new int[2];

        String carro[][] = new String[2][5];

        int anoCarro[] = new int[2];

        int codCarro[] = new int[2];

        Scanner entNumero = new Scanner(System.in);

        Scanner entInformacoes = new Scanner(System.in);

        Scanner entInfo = new Scanner(System.in);

        Scanner entOpcInterna = new Scanner(System.in);

        int codLocacao[] = new int[3];

        String dataSaida[] = new String[3];

        int opcaoInterna = 0;

        boolean statusLoc = false;

        String statusLocacao[] = new String[2];

        String dia = null, mes = null, ano = null;

        int codClienteTest[] = new int[3];

        int codCarroTest[] = new int[3];

        int opcaoMenu = 0;

        do {

            System.out.println("=========================================");
            System.out.println("======= Menu Locadora de Veiculos =======");
            System.out.println("=========================================");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Carro");
            System.out.println("3 - Abrir Locação");
            System.out.println("4 - Fechar Locação");
            System.out.println("5 - Imprimir Boleto");
            System.out.println("6 - Sair");
            System.out.println("=========================================");
            System.out.println("Escolha uma Opção");
            System.out.println("=========================================");

            opcaoMenu = entInformacoes.nextInt();

            switch (opcaoMenu) {

                case 1:
                    CadastrarCliente(carro, codCliente);
                    opcaoMenu = 0;
                    break;

                case 2:
                    CadastrarCarro(carro, codCarro, anoCarro);
                    opcaoMenu = 0;
                    break;

                case 3:
                    caseTres(TestCarro, test, codCliente, codCarro, codLocacao, dia, mes, ano, statusLoc, statusLocacao, opcaoMenu, opcaoInterna);
                    break;

                case 4:

                    break;

                case 5:
                    imprimeCadastroCliente(carro, codCliente);

                    imprimeCadastrarCarro(carro, codCarro, anoCarro);
                    break;

                case 6:
                    System.out.println("Progrma Finalizado");
                    break;

            }

        } while (opcaoMenu != 6);

    }
}
