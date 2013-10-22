
/**
 * Write a description of class ExJanela6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;

public class ExJanela6{
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame("Exemplo de aplicação swing");
    JPanel c = new JPanel();
    frame.getContentPane().add(c);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
    c.add(new JButton("um"));
    c.add(new JButton("dois"));
    c.add(new JButton("tres"));
    c.add(new JButton("quatro"));
    frame.setVisible(true);
  }
}
