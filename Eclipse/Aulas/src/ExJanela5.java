
/**
 * Write a description of class ExJanela5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;

public class ExJanela5{
  public static void main(String[] args) 
  {
    JFrame frame = new JFrame("Exemplo de aplicação swing");
    JPanel c = new JPanel();
    frame.getContentPane().add(c);
    frame.setSize(300,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new JButton("Norte"),BorderLayout.NORTH);
    frame.add(new JButton("Centro"),BorderLayout.CENTER);
    frame.add(new JButton("Sul"),BorderLayout.SOUTH);
    frame.add(new JButton("Leste"),BorderLayout.EAST);
    frame.add(new JButton("Oeste"),BorderLayout.WEST);
    frame.setVisible(true);
  }
}
