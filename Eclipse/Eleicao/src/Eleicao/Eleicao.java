/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Eleicao;

import java.util.Scanner;
// importei o metodo Scanner

/**
 *
 * @author Alan
 */
public class Eleicao {

    public static void main(String[] args) {

        Scanner lerNome = new Scanner(System.in);
        // criei um scanner pra ler nome
        Scanner lerNumero = new Scanner(System.in);
        // criei scanner pra ler numero
        int opcao;
        //variavel opcao para ler a opcao q o usuario digitar 
        int contSindico1 = 0;
        //contador do candidato 1
        int contSindico2 = 0;
        //contador do candidato 2
        int contSindico3 = 0;
        //contador do candidato 3
        String PrimeiroCandidato;
        //variavel pra savar o nome do candidato 1
        String SegundoCandidato;
        //variavel pra savar o nome do candidato 2
        String TereiroCandidato;
        //variavel pra savar o nome do candidato 3

        System.out.println("informe o nome do priemiro candidato");
        //pedir pra o usuario indformar o primeiro candidato 1
        PrimeiroCandidato = lerNome.nextLine();
        //salvei o nome q o usuario digitou na variavel do candidato 1
        System.out.println("informe o nome do segundo candidato");
        //pedir pra o usuario indformar o primeiro candidato 2
        SegundoCandidato = lerNome.nextLine();
        //salvei o nome q o usuario digitou na variavel do candidato 2
        System.out.println("informe o nome do Terceiro candidato");
        //pedir pra o usuario indformar o primeiro candidato 3
        TereiroCandidato = lerNome.nextLine();
        //salvei o nome q o usuario digitou na variavel do candidato 3


        do {
            // inicio do laco
            System.out.println("1-" + PrimeiroCandidato
                    + "\n 2-" + SegundoCandidato
                    + "\n 3-" + TereiroCandidato
                    + "\n 0- encerrar votação");
            // menu de opcoes de todos os candidatos informados
            // cada item com a variavel onde estao salvos os nomes dos candidatos
            // e o 0(zero) para terminar a votação
            System.out.println("informe a opção de voto");
            //pedir pra o usuario indformar a opcao de votos
            opcao = lerNumero.nextInt();
            // salvei a opcao q o usuario informou 

            if (opcao == 0) {
                // condicao para saida s a opcao for == a 0(zero)
                // pois s for o primeiro item == a 0(zero)
                // entao ele ja sai do laço

                break;
                
            }
            switch (opcao) {
                // inicio do case
                case 1:
                    contSindico1++;
                    // contador do primeiro candidato 
                    // soma sempre +1 quando o susario informa a opcao 1
                    // ate o usuario digitar 0(zero)
                    break;
                case 2:
                    contSindico2++;
                    // contador do segundo candidato 
                    // soma sempre +1 quando o susario informa a opcao 2
                    // ate o usuario digitar 0(zero)
                    break;
                case 3:
                    contSindico3++;
                    // contador do terceiro candidato 
                    // soma sempre +1 quando o susario informa a opcao 3
                    // ate o usuario digitar 0(zero)
                    break;
                default:
                    System.out.println("candidato não cadastrado");
                    // caso o usuario informe outra opçao q não esteja no menu

            }

        } while (opcao != 0);
        // fim do laço pois em quanto o usuario não digita 0(zero) ele
        // continua rodando

        System.out.println(" Votacao Encerrada");
       // mostra a mensagem 
        // "votação encerrada"
       
        System.out.println(PrimeiroCandidato + contSindico1 + " votos"
                + "\n " + SegundoCandidato + contSindico2 + " votos"
                + "\n " + TereiroCandidato + contSindico3 + "votos");
        // informa quantos de votos cada candidato teve

        double resul = (contSindico1 + contSindico2 + contSindico3);
        // soma os votos de todos os candidatos 

        double percentual = (contSindico1 / resul);
        double percentual2 = (contSindico2 / resul);
        double percentual3 = (contSindico3 / resul);
        // divide os votos de cada candidato por o total de votos

        System.out.println("Percentual de votos");
        // informa o percentua de votos
        
        System.out.printf(PrimeiroCandidato +": "+ "%.1f", ((percentual) * 100));
        //comando "%.2f" pra formatar a variavel e mostrar apensa 2 casas decimais depois da virgula
        System.out.print("%");
        System.out.println("");
        // pra quebrar a linha 
        System.out.printf(SegundoCandidato + ": " + "%.1f", ((percentual2) * 100));
        System.out.print("%");
        System.out.println("");
        System.out.printf(TereiroCandidato + ": " + "%.1f", ((percentual3) * 100));
        System.out.print("%");
        System.out.println("");
        
        if (contSindico1 > contSindico2 && contSindico2 > contSindico3) {
            // condição pra mostrar o vencedor
            System.out.println("Candidato vendecor: " + PrimeiroCandidato);
        } else if (contSindico2 > contSindico1 && contSindico2 > contSindico3) {
            System.out.println("Candidato vencedor: " + SegundoCandidato);
        } else if (contSindico3 > contSindico1 && contSindico3 > contSindico2) {
            System.out.println("Candidato vencedor: " + TereiroCandidato);
        } else {
            System.out.println("Candidatos empatados");
            // caso seja empate mostra a mensagem de empatados
        }


    }
}
