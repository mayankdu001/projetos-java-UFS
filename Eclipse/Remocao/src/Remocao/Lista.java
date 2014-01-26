package Remocao;


/**
 * Classe que implementa um TAD para uma lista sequencial de inteiros
 * 
 * @author (Mai-Ly) 
 */
public class Lista
{
    private int vetor[];
    private int quant;

    /**
     * Construtor 
     */
    public Lista(int quantidade)
    {
         vetor = new int[quantidade];
         quant = 0;
    }
  
    //M�todo que insere de forma n�o ordenada
    public boolean insereNOrd(int elem)
    {
        if (quant < vetor.length)
        {
            vetor[quant] = elem;
            quant++;
            return true;
        }
        else
            return false;  
    }
    
    //M�todo para exibi��o da lista sequencial
    public void exibe()
    {
        System.out.println("");
        System.out.println("Exibi��o dos elementos da lista sequencial ");
        for (int x = 0; x < quant; x++)
            System.out.print(" "+vetor[x]);
        System.out.println();
    }            
    
    //M�todo que dada uma chave executa uma busca sequencial no conjunto
    public int buscaSeq(int chave)
    {
        for (int x = 0; x < quant; x++)        
            if (vetor[x] == chave) return x; //Na hora que encontra o la�o � interrompido pelo return
        return -1; //Retorna -1 caso n�o encontrou a chave procurada.
    }
    
   //M�todo que realiza uma busca bin�ria no conjunto e retorna o �ndice do elemento encontrado
    public int buscaBin(int chave)
    {
        int inicio, fim, meio;   
        inicio = 0;
        fim = quant-1;
        while (inicio <= fim)
        {
            meio = (inicio + fim)/2;
            if (vetor[meio] == chave) return meio;
            if (chave > vetor[meio]) 
                inicio = meio+1;
            else
                fim = meio - 1;                                    
        }
        return -1; //Retorna -1 caso o valor da chave n�o tenha sido encontrado no conjunto
    }
    
    
    //M�todo que vai ser chamado pela inser��o ordenada, � uma modifica��o 
    //do m�todo de busca bin�ria para retornar a posi��o imediatamente menor
    //ao elemento que se quer inserir.
    public int procuraPos(int chave)
    {
        int inicio, meio, fim;
        inicio = 0;
        fim = quant -1;
        while (inicio <= fim)
        {
            meio = (inicio + fim)/2;
            if (chave > vetor[meio]) 
                inicio = meio + 1;
            else 
                fim = meio - 1;
        }
        return inicio;
    }
    
   //Inser��o ordenada. Resposta que mostrei a voc�s usando
   //uma varia��o da busca bin�ria para encontrar o ponto de 
   //inser��o do novo valor.
    public boolean insereOrd(int chave)
    {
        if (quant < vetor.length)   
        {
            int posicao = procuraPos(chave);
            //Deslocando os n�s de uma posi��o para a direita
            for (int x = quant-1; x > posicao; x--)
                vetor[x] = vetor[x-1];
            //Insere o novo dado na posi��o correta
            vetor[posicao] = chave;
            quant++;
            return true;
        }
        else
            return false; //A lista est� cheia
    }

    //Inser��o ordenda: Resposta que eu pensei hoje na sala de aula
    public boolean insereOrdNovo(int chave)
    {
        if(quant < vetor.length) 
        {
            int x = quant-1; 
            while(x >=0 && chave < vetor[x])
              {   
              vetor[x+1] = vetor[x];
              x--;
            }
            vetor[x+1] = chave;       
            quant++;
            return true;
        }
        else
           return false;          
    }
    
    //Inser��o ordenada: Outra forma de se fazer
    public boolean insereOrd2(int chave)
    {
        if(quant < vetor.length) //Testa se a lista esta cheia
          {
        int novapos = quant;
        while(vetor[novapos-1]> chave && novapos > 1){
          vetor[novapos] = vetor[novapos-1];
          if(novapos != 1)
            novapos--;
          }
          if(novapos != 1) //Resolve o problema da inser��o na primeira e segunda posi��o
          vetor[novapos] = chave;
         else{
            if(vetor[1] > chave){
                vetor[2] = vetor[1];
                if(vetor[0] > chave) {
                    vetor[1] = vetor[0];
                    novapos--;
                    }
                vetor[novapos] = chave;
                }
            }
                      
        quant++;
        return true;
          }
          else
          return false;
     }
        
     //Inser��o ordenada: uma quarta forma de se fazer
    public boolean insereOrd3(int chave)
    {
        if(quant < vetor.length) //Testa se a lista esta cheia
          {
        int novapos = quant;
        while(vetor[novapos-1]> chave){
          vetor[novapos] = vetor[novapos-1];
          novapos--;
          if(novapos == 0)
            break;
          }
          vetor[novapos] = chave;                      
          quant++;
        return true;
          }
          else
          return false;
     }
    
}
