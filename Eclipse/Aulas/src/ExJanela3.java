
/**
 * Write a description of class ExJanela3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;

public class ExJanela3 {
  public static void main(String[] args) 
     {
    JFrame frame = new JFrame("Exemplo de aplicação swing");
    JPanel c = new JPanel();
    c.add(new JButton("1"));
    c.add(new JTextField(20));
    c.add(new JButton("dois"));
    c.add(new JButton("três"));

    frame.getContentPane().add(c);
    frame.setSize(150,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
