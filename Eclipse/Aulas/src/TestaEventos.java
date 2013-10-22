
/**
 * Write a description of class TestaEventos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestaEventos extends JFrame implements ActionListener
{
    JButton but;    
    JLabel label;
    JPanel painel;
    int cont;
    
    public TestaEventos(){
        super("Aplicação funcionando");
        cont = 0;
        painel = new JPanel();
        but = new JButton("Ok"); //Instanciando o botão
        label = new JLabel("Quantidade de cliques: ");  //Instanciando o label
//        painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
        painel.add(but); //Adicionando botão ao panel
        painel.add(label); //Adicionando label ao panel
        
        but.addActionListener(this); //Associando o listener ao botão
        getContentPane().add(painel); //Adicionando o panel à janela da aplicação
    }
    
    //Este método será automaticamente disparado pelo sistema quando o evento clicar
    // no botão ocorrer
    public void actionPerformed(ActionEvent e){
         cont++;  //Incrementa contador
         label.setText("Quantidade de cliques: "+cont); //Exibe valor atual do contador no label
    }    
    
    
    public static void main(String args[]){
        TestaEventos aplica = new TestaEventos();
        aplica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplica.setSize(400,300); //Ou você determina o tamanho inicial da janela com setSize
        //aplica.pack();         //ou chama pack() para ele calcular o tamanho mínimo necessário para exibir os componentes que estão nela
        aplica.setVisible(true);
        }

}