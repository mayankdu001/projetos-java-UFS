package projetoSimulador;

import java.io.Serializable;
import java.util.ArrayList;

public class Simulador implements Serializable {

    ArrayList<String> trans;
    Alfabeto alfa;
    ArrayList<Estado> conjEstado;
    String EstadoInicial;
    ArrayList<String> EstadoFinal;

    public Simulador(Alfabeto al) {
   	 conjEstado = new ArrayList<Estado>();
         EstadoFinal = new ArrayList<String>();
   	 alfa = al;
   	 criarEstado("q0");// essa linha cria o estado inicial..
   	 EstadoInicial = "q0";
    }

    public String[] retornaNomeDosEstados() {
   	 String[] nomes = new String[conjEstado.size()];

   	 for (int i = 0; i < nomes.length; i++) {
   		 nomes[i] = conjEstado.get(i).nomeEstado;
   	 }
   	 return nomes;
    }

    // metodo para preencher estado inteiro
    public boolean criarEstado(String nomeEstado) {

   	 if (!conjEstado.contains(retornaEstado(nomeEstado))) {
   		 conjEstado.add(new Estado(alfa, nomeEstado));

   	 } else {
   		 return false;
   	 }
   	 return true;
    }

    public void EscolherEstadoFinal(String EstadoFinal) {
        if(!this.EstadoFinal.contains(EstadoFinal))
   	 this.EstadoFinal.add(EstadoFinal);
    }

    // para alterar
    public boolean alterarEstado(String nomeEstadoAntigo, String NomeNovo) {

   	 if (conjEstado.contains(retornaEstado(nomeEstadoAntigo))) {
   		 retornaEstado(nomeEstadoAntigo).nomeEstado = NomeNovo;
   		 if (nomeEstadoAntigo.equalsIgnoreCase(EstadoInicial)) {
   			 EstadoInicial = NomeNovo;
   		 } else if (EstadoFinal.contains(nomeEstadoAntigo)) {
                //        // numero
   			 EstadoFinal.set(EstadoFinal.indexOf(nomeEstadoAntigo), NomeNovo);

   		 }

   	 } else {
   		 return false;
   	 }
   	 return true;

    }

    public boolean temEstado(String estado) {
   	 if (conjEstado.contains(retornaEstado(estado))) {
   		 return true;
   	 }
   	 return false;
    }


    public Estado retornaEstado(String NomeEstado){
   	 for (int i = 0; i < conjEstado.size(); i++) {
   		 if(conjEstado.get(i).nomeEstado.equalsIgnoreCase(NomeEstado)) {
   			 return conjEstado.get(i);
   		 }
   	 }
   	 return null;
    }

    public void deletarFuncaoNoEstado(String Estado, char letra){
        retornaEstado(Estado).deletarFuncao(letra);
    }
    public void criarFuncaoNoEstado(String EstadoAtual, char Letra, String NovoEstado) {
   	 retornaEstado(EstadoAtual).preencherCelula(Letra, NovoEstado);
    }
}
