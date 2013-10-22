package projetoSimulador;

import java.io.Serializable;

public class Estado implements Serializable {

    Funcao celulas[];
    Alfabeto alfa;
    String nomeEstado;
    boolean cheio = false;

    // esse construtor criara estados
    public Estado(Alfabeto alfa, String nomeEstado) {
   	 celulas = new Funcao[alfa.tamanho];
   	 this.alfa = alfa;
   	 this.nomeEstado = nomeEstado;
    }

    public int retornaLetra(char letra){
   	 return alfa.retornaPosicao(letra);
    }

    // esse metodo serve para criar e reescrever as celulas
    public void preencherCelula(char letra, String NovoEstado) {

   	 celulas[retornaLetra(letra)] = new Funcao();
   	 celulas[retornaLetra(letra)].setFuncao(NovoEstado, letra);
    }

    // esse metodo diz se existe ou nao essa celula
    public boolean temFuncao(char letra) {
   	 try{
             if(!alfa.temLetra(letra))
                 return false;
             if(celulas[retornaLetra(letra)] != null)
   		 return true;
             return false;
   	 } catch (Exception e) {
   		 return false;
   	 }
    }
    public void deletarFuncao(char letra){
        celulas[retornaLetra(letra)] = new Funcao();
    }

}