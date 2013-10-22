
/**
 * Write a description of class TestaEventos3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;



public class TestaEventos3 extends JFrame 
{
    JButton botao, botao2;
    JLabel texto;
    JPanel painel;
    int cont;
    
    public TestaEventos3()
    {
        super("Aplicacao de testar eventos");
        cont = 0;
        painel = new JPanel();
        botao = new JButton("Botao");
        botao2 = new JButton("Botao2");        
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(botao);
        painel.add(botao2);        
        MouseAdapter mouseGer =new MouseAdapter(){
                 public void mousePressed(MouseEvent e){
                   cont++;
                   if(e.getSource() == botao)
                       System.out.println("Pressionou b1. Cont = "+cont);            
                    else             
                       System.out.println("Pressionou b2. Cont = "+cont);
                    
                   }
                 public void mouseReleased(MouseEvent e)
                  {   cont++;
                      if(e.getSource() == botao) 
                      System.out.println("Soltou b1. Cont = "+cont);
                   else 
                      System.out.println("Soltou b2. Cont = "+cont);
                  }
             };   
        botao.addMouseListener(mouseGer);
        botao2.addMouseListener(mouseGer);               
        getContentPane().add(painel);                
    }

    public static void main(String args[])
    {
        TestaEventos3 aplicacao = new TestaEventos3();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.setSize(200,100);
        aplicacao.setVisible(true);
    }
}