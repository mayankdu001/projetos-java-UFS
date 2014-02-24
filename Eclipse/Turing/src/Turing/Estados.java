package Turing;

import java.util.LinkedList;

/* A classe transicao cria Objetos que possuem os atributos VALOR_LEITURA, VALOR_ESCRITA, DIRECAO E PROXESTADO.
 * Essa classe sera implementada como uma lista dentro dos nos ESTADOS implementados na classe abaixo
 * 
 * @param
 * 		valor_leitura = valor a ser lido na lista
 * 		valor_escrita = valor a ser escrito na lista em caso de leitura correta
 * 		direcao = D (direita) ou E (esquerda). Movimento de cabeca na lista
 * 		proxEstado = informa qual o proximo Estado.  
 */

class Trans {
	char valor_leitura, valor_escrita, direcao;
	int proxEstado;
	
	public Trans(char valor_leitura, char valor_escrita, char direcao, int proxEstado) {
		this.valor_escrita = valor_escrita;
		this.valor_leitura = valor_leitura;
		this.direcao = direcao;
		this.proxEstado = proxEstado;
	}
	public char getValorLeitura() {
		return valor_leitura;
	}
	public char getValorEscrita() {
		return valor_escrita;
	}

}


/*A classe Estados é responsavel pela criação dos estados em si. Ela ira possuir os atributos VALOR_ESTADO, 
 * TRANS e TIPO
 * 
 * @param
 * 		valor_estado = atributo simbolico que armazena o nome do estado (q0, q1, q2...qn)
 * 		trans = Lista de objetos da classe transicao. Representa as transicoes do estado
 * 		tipo = Informa se é um estado Inicial (recebe 0), normal/qualquer (recebe 1) ou final (recebe -1)
 */

public class Estados {
	 
	int valor_estado;
	LinkedList<Trans> trans;
	int tipo;  // Define o tipo do No. Inicial(0), normal(1) ou Final(-1)
	int cont ;
        
	public Estados(int valor_estado, int tipo) {
		this.valor_estado = valor_estado;
		trans = new LinkedList<Trans>();
		this.tipo = tipo;
                this.cont = 0;
	}
	
}
