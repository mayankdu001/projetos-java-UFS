package Turing;

import java.util.LinkedList;

public class Main {
	
	public static void main(String args[]) {
		LinkedList<Estados> estado = new LinkedList<Estados>(); //Cria lista de Estados
		
                
                
                
		//Maquina Aceita apenas pre-fixo aaa
		/*
		estado.add(new Estados(0, 0)); // Adiciona um estado q0, tipo inicial (0) a lista de estados
		estado.get(0).trans.add(new Trans('*', '*', 'D', 0)); // Adiciona uma transicao ao estado q0
		estado.get(0).trans.add(new Trans('a', 'A', 'D', 1)); // Adiciona uma transicao ao estado q0
		estado.add(new Estados(1, 1)); // Adiciona um estado q1, tipo Normal(1) a lista de estados
		estado.get(1).trans.add(new Trans('a', 'A', 'D', 2)); //Adiciona uma transicao ao estado q1
		estado.add(new Estados(2, 1)); // Adiciona um estado q2, tipo Normal(1) a lista de estados
		estado.get(2).trans.add(new Trans('a', 'A', 'D', 3)); //Adiciona uma transicao ao estado q2
		estado.add(new Estados(3, -1)); // Adiciona um estado q3, tipo Final(-1) a lista de estados
		
		fita fitaT = new fita("*aaabb#"); //Cria fita com entrada | * | a | a | a | b | b | # | ....
		Maquina.MaquinaT(estado, fitaT); //Executa os testes e modificacoes na fita, alem de retornar Aceita ou Rejeita
		*/
	
		
		//Maquina aceita apenas com sufixo aa
		/*
		estado.add(new Estados(0, 0));
		estado.get(0).trans.add(new Trans('*', '*', 'D', 0));
		estado.get(0).trans.add(new Trans('a', 'a', 'D', 0));
		estado.get(0).trans.add(new Trans('b', 'b', 'D', 0));
		estado.get(0).trans.add(new Trans('#', '#', 'E', 1));
		estado.add(new Estados(1, 1));
		estado.get(1).trans.add(new Trans('a', 'A', 'E', 2));
		estado.add(new Estados(2, 1));
		estado.get(2).trans.add(new Trans('a', 'A', 'E', 3));
		estado.add(new Estados(3, -1));
		
		fita FitaT = new fita("*abbaa#");
		Maquina.MaquinaT(estado, FitaT);
		*/
		
	
		
		//Gera Loop Infinito; Situação ainda não resolvida e que precisa ser implementada
		/*
		estado.add(new Estados(0, 0));
		estado.get(0).trans.add(new Trans('*', '*', 'D', 0));
		estado.get(0).trans.add(new Trans('a', 'a', 'D', 1));
		estado.add(new Estados(1, 1));
		estado.get(1).trans.add(new Trans('b', 'b', 'E', 0));
		fita FitaT = new fita("*ab#");
		Maquina.MaquinaT(estado, FitaT);
		*/
	}
}
