package gui.demo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameDemo {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(new Dimension(800, 800)); // sets height and width of the window
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets what operation is performed once we close the
																// window
		jFrame.setResizable(false); // can we resize the window
		jFrame.setTitle("CS151"); // sets or changes the title
		jFrame.setVisible(true); // to show the JFrame
		jFrame.getContentPane().setBackground(Color.BLUE); // to change the bg color
		ImageIcon image = new ImageIcon("spartan-logo.png"); // sets jframe's icon
		jFrame.setIconImage(image.getImage());
	}

}