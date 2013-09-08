package Janela;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrowPanel extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		int width = getWidth(); // larguta total
		int height = getHeight(); // altura total
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0, height, width, 0);
	}

}
