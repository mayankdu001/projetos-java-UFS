package projetoSimulador;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alfabeto implements Serializable {

    int tamanho;

    char[] letras;

    public Alfabeto(String letras) {
      
   	
   	 this.letras = letras.toCharArray();
         this.letras = arrumar(this.letras); //esse metodo retira as letras repetidas
   	 tamanho = this.letras.length;
    }

    private char [] arrumar(char [] c){
        ArrayList<Character> ch = new ArrayList<Character>();

        for (int i = 0; i < c.length; i++) {
            if (!ch.contains(c[i]))
                ch.add(c[i]);

        }
        char [] ret = new char[ch.size()];
        for (int i = 0; i < ret.length; i++) {
           ret[i] = ch.get(i);

        }
        return ret;
    }

    public int retornaPosicao(char Letra) {

   	 for (int i = 0; i < letras.length; i++) {
   		 if (letras[i] == Letra) {
   			 return i;
   		 }
   	 }
   	 return 0;
    }

    public boolean temLetra(char letra){
   	 for (int i = 0; i < letras.length; i++) {
   		 if(letras[i] == letra) {
   			 return true;
   		 }
   	 }
   	 return false;
    }

}
