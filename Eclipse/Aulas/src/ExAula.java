
/**
 * Write a description of class ExAula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;

public class ExAula
{
    public static void main(String args[]){
        JFrame aplic = new JFrame("Aplicação swiing simples");
        JPanel area1 = new JPanel();
        area1.setSize(300,60);
        JLabel label1 = new JLabel("Nome: ");
        JTextField textNome = new JTextField(20);
        area1.add(label1);
        area1.add(textNome);
        JPanel area2 = new JPanel();
        JLabel label2 = new JLabel("Endereço: ");
        JTextField textoEnder = new JTextField(20);
        area2.setSize(300,60);
        area2.add(label2);
        area2.add(textoEnder);
        JPanel area3 = new JPanel();
        JLabel label3 = new JLabel("Resposta: ");
        JButton botao = new JButton("Ok");
        JButton cancela = new JButton("Cancela");
        JTextField textoResp = new JTextField(20);
        area3.setSize(300,60);
        area3.add(label3);
        area3.add(textoResp);
        //area3.add(botao);
        //area3.add(cancela);
        
        JPanel prov2 = new JPanel();
        prov2.add(botao);
        prov2.add(cancela);
        prov2.setLayout(new BoxLayout(prov2,BoxLayout.X_AXIS));

        JPanel prov = new JPanel();
        prov.add(area3);
        prov.setLayout(new BoxLayout(prov,BoxLayout.Y_AXIS));        
        prov.add(prov2);
        
        aplic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplic.add(area1,BorderLayout.NORTH);
        aplic.add(area2,BorderLayout.CENTER);
        aplic.add(prov,BorderLayout.SOUTH);
        aplic.pack();
        aplic.setVisible(true);
    }
}
