
/**
 * Write a description of class ExJanela4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;

public class ExJanela4 {
public static void main(String[] args) 
    {
    JFrame frame = new JFrame("Exemplo de aplicação swing");
    JPanel c = new JPanel();
    c.setLayout(new GridLayout(2,3)); 
    c.add(new JButton("1"));
    c.add(new JTextField(9));
    c.add(new JButton("dois"));
    c.add(new JButton("três"));
    c.add(new JButton("outro"));
    c.setBackground(Color.RED);


    frame.getContentPane().add(c);
    frame.setSize(200,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   }
}
