package gui.demo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setSize(new Dimension(800, 800));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("CS151");
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("sjsu.png");
		this.setIconImage(image.getImage());
		
		this.getContentPane().setBackground(Color.BLUE);
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}