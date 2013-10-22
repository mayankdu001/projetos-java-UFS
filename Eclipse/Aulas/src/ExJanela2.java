
/**
 * Write a description of class Janela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
    
public class ExJanela2 extends JFrame
{
    JButton but1, but2; //Criou dois botões
    JLabel texto;       //Criou um label 
    JPanel painel;      //Criou um panel = container para outros componentes
    JLabel jLabel1 = new JLabel("Exemplo de campo");
    
    public ExJanela2()
    {
        super("Aplicação Swing"); //Chamou construtor da super classe
        //Instanciando componentes
        but1 = new JButton("Sou um botão");
        but2 = new JButton("Sou outro botão");
        texto = new JLabel("Quantidade de clicks: 0");
        painel = new JPanel();
        
        //Adicionando os componentes criados e instanciados ao panel
        painel.add(but1);
        painel.add(but2);
        painel.add(texto);    
        
        //Para mostrar aos alunos o que ocorria criei 5 botões e os adicionei ao panel
        for(int cont = 0; cont < 5; cont++){
            painel.add(new JButton("Botão "+cont));
        }
        
        getContentPane().add(painel);
    }
    
    
        
    public static void main(String args[])
    {   
        ExJanela2 janela = new ExJanela2();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); 
        janela.setLayout(flow);
        janela.pack();
        janela.setVisible(true);
    }
}