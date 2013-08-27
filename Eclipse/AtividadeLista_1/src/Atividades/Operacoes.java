/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

/**
 *
 * @author Alan
 */
public class Operacoes {
    public static void main (String [] args){
        
        int numero = 20;
        double trintaCentenas;
        double subDezdezenas;
        double MultDezDuzias;
        double DividirDuasUnidade;
        double somarDuasDuzias;
        double SubUmaUnidade;
        
        
        trintaCentenas = (30*100)+ numero;
        subDezdezenas =  trintaCentenas-(10*10);
        MultDezDuzias = (10*12) * subDezdezenas;
        DividirDuasUnidade = MultDezDuzias /2;
        somarDuasDuzias = DividirDuasUnidade+2;
        SubUmaUnidade = somarDuasDuzias -1;
        
        System.out.println("resultado = "+ SubUmaUnidade);
        
        
        System.out.println("");
        
        
    }
    
}
