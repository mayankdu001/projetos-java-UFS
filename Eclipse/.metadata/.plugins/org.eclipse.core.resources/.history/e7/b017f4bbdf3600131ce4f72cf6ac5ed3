package projetoSimulador;

import java.util.ArrayList;

public class Executando {

    char[] palavraValida;
    ArrayList<String> passoApasso;// passo a passo e a leitura de todos os
    // estados.
    Simulador simula;

    public Executando(String palavra, Simulador sim) {
        palavra = palavra;
        palavraValida = palavra.toCharArray();
        passoApasso = new ArrayList<String>();
        simula = sim;

    }
    String EstadoAtual;
    Estado estado;
    char letraAtual;
    int cont = 0;

    public void executa() {
        EstadoAtual = simula.EstadoInicial;
        letraAtual = palavraValida[cont++];

        while (true) {

            if (simula.temEstado(EstadoAtual)) {

                if (!simula.retornaEstado(EstadoAtual).temFuncao(letraAtual)) {
                    passoApasso.add("Estado :" + EstadoAtual + " nao tem transicao para " + letraAtual);
                    return;
                }

                try {
                    String z = simula.retornaEstado(EstadoAtual).celulas[simula.retornaEstado(EstadoAtual).retornaLetra(letraAtual)].vlrEstado;
                    passoApasso.add("Estado : " + EstadoAtual + ", letra " + letraAtual + " Transicao ->> " + z);
                    estado = simula.retornaEstado(EstadoAtual);
                } catch (Exception e) {
                    if (simula.EstadoFinal.contains(EstadoAtual)) {

                        passoApasso.add("validou - nao existe transicao neste Estado : " + EstadoAtual + " - Aceito por parar no Estado Final ");

                    } else {
                        passoApasso.add("nao validou  - Nao Existe Transicao");
                    }
                    return;

                }
                if (estado.temFuncao(letraAtual)) {// nao e estado final, entao
                    // , tem q ter funcao ou
                    // esta errado
                    EstadoAtual = estado.celulas[estado.retornaLetra(letraAtual)].vlrEstado;


                } else {
                    passoApasso.add("no estado " + EstadoAtual
                            + " nao existe saida para esta Letra : "
                            + letraAtual);
                    return; // saiu pq nao tem funcao nesse estado
                }
                if (cont < palavraValida.length) {
                    letraAtual = palavraValida[cont++];
                } else {
                    if (simula.EstadoFinal.contains(EstadoAtual)) {
                        passoApasso.add("validou");
                    } else {
                        passoApasso.add("nao validou");
                    }

                    return;
                }

            } else {
                passoApasso.add("nao existe o estado : " + EstadoAtual);
                return;// saiu pq nao existe esse estado, errou.
            }

            if (simula.EstadoFinal.contains(EstadoAtual)
                    && (cont > palavraValida.length)) {

                passoApasso.add("Atingiu o Estado final : " + estado.nomeEstado
                        + ".");
                return;// se eu estiver no estado final, acaba...// saiu pq
                // e estado final
            }

        }

    }

    // verifica se a palavra digitada tem todas as letras validas
    public boolean verificaLetra(char c) {

        for (int i = 0; i < palavraValida.length; i++) {
            if (!simula.alfa.temLetra(palavraValida[i])) {
                return false;
            }
        }
        return true;

    }
}
