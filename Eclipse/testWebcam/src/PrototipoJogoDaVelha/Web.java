package PrototipoJogoDaVelha;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.github.sarxos.webcam.Webcam;

public class Web {
	String nome1;
	String nome2;
	private int i = 1;

	/**
	 * @param args
	 * @throws IOException
	 */

	public Web() throws IOException {
		Webcam webcam = Webcam.getDefault();

		if (webcam != null) {

			Dimension d = new Dimension(320, 240);

			webcam.setViewSize(d);
			webcam.open();
			System.out.println("foi " + i++);
			// BufferedImage bf = webcam.getImage();

			ImageIO.write(webcam.getImage(), "PNG", new File("foto" + i++
					+ ".png"));

			webcam.close();

			// BufferedImage bf1 = webcam.getImage();

		} else
			System.out.println("não foi");

		// JOptionPane.showMessageDialog(null, new ImageIcon(
		// "E:/Projetos_Eclipse/trunk/Eclipse/testWebcam/foto0.png"));

		// JOptionPane.showMessageDialog(null, new ImageIcon(
		// "E:/Projetos_Eclipse/trunk/Eclipse/testWebcam/foto1.png"));

	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

}