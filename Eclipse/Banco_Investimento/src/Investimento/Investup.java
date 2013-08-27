package Investimento;

import java.util.Scanner;

public class Investup {

    public static void main(String[] args) {
        Scanner imputDados = new Scanner(System.in);
        Scanner imputNumero = new Scanner(System.in);

        Investimento myInvet1 = new Investimento();
        // classe    //objeto       // metodo

        Investimento myInvet2 = new Investimento(20, 30);
        // classe     // objeto      // metodo 2 com parametros 

        System.out.println("informe o nome da aplicacao");
        myInvet1.setNome(imputDados.next());// seto o nome q o usuario digitar para o set do investimento

        System.out.println("informe o Valor do investimento");
        myInvet1.setInvestimento(imputNumero.nextDouble());

        System.out.println("informe a taxa da aplicacao");
        myInvet1.setTaxa(imputNumero.nextDouble());

        System.out.println("informe o tempo de aplicacao");
        myInvet1.setTmpAplicacao(imputNumero.nextInt());

        System.out.println("informe o tempo obrigatorio");
        myInvet1.setTmpPadrao(imputNumero.nextInt());

        // estou passando os atributos do meu objeto myInvest por parametro 
        // para o metodo de calculo de rendimento e salvando na variavel rendimento
        myInvet1.calcularRenimento(myInvet1.getInvestimento(), myInvet1.getTmpAplicacao(), myInvet1.getTaxa());
        // calculando o rendimento 
        // estou chamando o metodo calcularRendimento
        myInvet1.calculoResgate(myInvet1.getInvestimento(), myInvet1.getRendimento());

        System.out.println("Nome da aplicacao: " + myInvet1.getNome());
        System.out.println("Investimento: " + myInvet1.getInvestimento());
        System.out.println("Taxa: " + myInvet1.getTaxa());
        System.out.println("Tempo de aplicacao Real: " + myInvet1.getTmpAplicacao());
        System.out.println("Tempo de aplicacao Estimado: " + myInvet1.getTmpPadrao());
        System.out.println("Rendimento: " + myInvet1.getRendimento());
        System.out.println("Resgate: " + myInvet1.getResgate());

        System.out.println("#############################################");

        System.out.println("Nome da aplicacao: " + myInvet2.getNome());
        System.out.println("Investimento: " + myInvet2.getInvestimento());
        System.out.println("Taxa: " + myInvet2.getTaxa());
        System.out.println("Tempo de aplicacao Real: " + myInvet2.getTmpAplicacao());
        System.out.println("Tempo de aplicacao Estimado: " + myInvet2.getTmpPadrao());
        System.out.println("Rendimento: " + myInvet2.getRendimento());
        System.out.println("Resgate: " + myInvet2.getResgate());

    }
}
