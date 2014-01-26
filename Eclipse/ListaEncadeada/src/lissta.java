


/**
 * Classes para implementa��o de uma lista encadeada
 * A classe ListNode implementa um n� de uma lista gen�rica, que pode guardar qualquer tipo de objeto
 * A classe List implementa as opera��es de uma lista simplesmente encadeada que guarda as informa��es de cabe�a e cauda
 * 
 */

// Esta classe representa um n� em uma lista
class Node
{
    //membros de acesso do pacote
    Object data;
    lista nextNode;
      
    //construtor de dois argumentos - referencia o objeto e o pr�ximo n�
    Node(Object objeto, lista node)
    {
        data = objeto;
        nextNode = node;
    }
    //fim do construtor de dois argumento
    
    //construtor de um argumento que na verdade vai chamar o de dois
    Node(Object objeto)
    {
    this(objeto, null);            
    }
    //fim do construtor de um argumento
    
    //Retorna uma refer�ncia aos dados do n�
    Object getObject()
    {
        return data;    
    }
    
    //Retorna uma refer�ncia ao n� seguinte a este
    lista getNext()
    {
        return nextNode;    
    }
    
    
}//Fim da classe ListNode

//Inicio da defini��o da classe list
public class lista
{
    private lista firstNode;
    private lista lastNode;
    private String name;

    //construtor sem argumentos cria a lista com um nome gen�rico de lista, na verdade ele apenas chama o outro construtor
    //que a� sim realmente coloca null na cabe�a e cauda da lista
    public lista()
    {
        this("Lista");    
    }
    
    //construtor de um argumento, d� um nome a lista e coloca cabe�a e cauda em null
    public lista(String listName)
    {
        name = listName;
        firstNode = lastNode = null;
    }
    
    //determina se a lista est� vazia
    public boolean isEmpty()
    {
        if (firstNode == null) 
            return true;    
        else
            return false;       
    }
    
    //Insere n� na frente da lista. Caso a lista esteja vazia chama o construtor de ListNode de um argumento e 
    // cabe�a e cauda apontar�o para ele. Caso j� haja elementos chama o construtor de ListNode e constr�i um 
    // n� que aponta para firstNode e coloca ele na cabe�a da lista.
    public void insereNoFim(Object itemInserido)
    {
           if( isEmpty()){                             
            firstNode = lastNode = new lista(itemInserido);
           
           }
           else                
            lastNode.nextNode = new lista(itemInserido,firstNode);
            lastNode = lastNode.nextNode;
    }  
}