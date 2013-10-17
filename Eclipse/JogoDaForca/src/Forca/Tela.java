package Forca;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
public class Tela extends JFrame {

	public Tela() {
super("taz mania");
		Container c = getContentPane();
		Container c2 = getContentPane();
		JLabel test = new JLabel("taz");

add(test);
	
setSize(300,300);
setVisible(true);
	
	}

	public static void main(String[] args) {
new Tela();


	}

}
