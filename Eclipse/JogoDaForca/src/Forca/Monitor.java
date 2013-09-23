package Forca;

import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
  
public class Monitor extends JFrame  
{  
    private JTextField buffer;  
    private JButton[] consumers;  
    private JButton producer;  
      
    public Monitor()  
    {  
        super("Monitor");  
          
        //Inicia o Layout  
        setLayout( new FlowLayout() );  
          
        //cria o JTextField  
        buffer = new JTextField("10 10 10 10 10 10 10 10");  
        buffer.setColumns( 12 );  
        add(buffer);  
          
        //Cria os botoes  
        consumers = new JButton[5];  
          
        for( int i = 0; i < 5; i++)  
        {  
            consumers[i] = new JButton("Consumer" + i);  
            add(consumers[i]);  
            consumers[i].setSize( new Dimension( 40, 40 ) );  
        }  
          
        producer = new JButton("Producer");  
        producer.setSize( new Dimension( 40, 40 ) );  
        add( producer );  
          
        //Configura o frame  
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  
        setSize( 150, 250 );  
        setResizable( false );  
        setVisible( true );  
    }  
      
    public static void main( String[] args )  
    {  
        Monitor monitor = new Monitor();  
    }  
}  