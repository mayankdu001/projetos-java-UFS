package Turing;

import java.util.LinkedList;

/*Este metodo realiza a computacao da maquina de Turing.
 * @param
 * 		cabeca = cabeca da fita. Inicia em 0, incremenda ou decrementa no decorrer do processo
 * 		primEstado = estado inicial da programa
 * 		transCont = contador de transicoes. Utilizado para andar pelas transicoes dos estados
 * 		atualEst = atual estado sendo verificado
 * 		flagResult = tem FALSE como padrão e, caso mantido assim, representa a rejeicao da palavra. Se houver
 * 					a mudanca para TRUE significa que caiu na condicao de ACEITACAO
 * 		teste = auxiliar que recebe valor_leitura do estado. Apenas para abstrair
 */
public class Maquina {
	
	static int cabeca;
	static int primEstado;
	static int transCont = 0;
	static int atualEst;
	static boolean flagResul = false;
	static char teste;
	
	
	public static void MaquinaT(LinkedList<Estados> estados, fita fitaT) {
		
		cabeca = 0;
		
		/*While inicia no estado inicial e percorre seus estados um a um (até que um estado seja aceito). Se flagResult
		 * for TRUE, metodo caiu na condicao de estado final e while e encerrado
		 */
		try {
		while ((transCont < estados.get(atualEst).trans.size()) && flagResul == false) {
			
			//Traducao da linha a seguir: pega o valor_leitura da atual transicao do atual estado
			teste = estados.get(atualEst).trans.get(transCont).getValorLeitura();
			
			/*Compara o valor_leitura com o atual valor do char na fita nesta posicao da cabeca
			 * Caso seja igual, escreve o valor_escrita na fita na mesma posicao
			 */
			if ( Character.toString(teste).equals(Character.toString(fitaT.fita[cabeca]))) {
				System.out.println();
				fitaT.fita[cabeca] =estados.get(atualEst).trans.get(transCont).valor_escrita;
				fitaT.imprima();
				
				System.out.print("  ");
				for (int x = 0; x < cabeca; x++) {
					System.out.print("    ");
				}
				System.out.print("º");
				System.out.println();
				
				// Ja tendo aceitado a transicao, pega o valor de leitura e incrementa ou decrementa a cabeca
				if (estados.get(atualEst).trans.get(transCont).direcao == 'D') {
					cabeca++;
				}
				else if (estados.get(atualEst).trans.get(transCont).direcao == 'E') {
					cabeca--;
				}
				
				/* Como a transicao foi aceita e valor já foi gravado na fita, resta apenas pegarmos o valor
				 * do proximo estado, que sera jogado na variavel atualEst. Retornamos então para o While e refazemos
				 * todo o processo, agora para as transicoes do atualEst
				 */
				atualEst = estados.get(atualEst).trans.get(transCont).proxEstado;
				
				//Caso o atual estado seja o estado FINAL, imprime que a palavra foi aceita e atribui TRUE a flagResul
				//fazendo com que o While nao seja mais executado
				if (estados.get(atualEst).tipo == -1) {
					flagResul = true;
					System.out.println();
					System.out.println("Palavra Aceita");
				}
				//Antes de subirmos novamente para o While para varer novamente as transicoes do proximo estado
				//e necessario zerar transCont para varemos da primeira transicao
				transCont = 0;
			}
			//Caso a transicao nao tenha sido aceita, incrementamos transCont e retornarmos para o While onde avaliamos
			//os valores da nova transicao
			else {
				transCont++;
			}
		}
		} catch (Exception e) {
			System.out.println("Rejeita");
		}
		/*Se tivermos encerrado o While e em nenhum momento a variavel flagResul tenha sido modificada para TRUE, entao
		 * em nenhum momento chegamos ao estado final. Rejeitamos a palavra
		 */
		if (flagResul == false) {
			System.out.println();
			System.out.println("Palavra Rejeitada");
	}
	}
}
