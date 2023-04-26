package gui.demo;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(null);

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);

		ImageIcon image = new ImageIcon("sjsu1.jpeg");
		JLabel label = new JLabel("SJSU");
		label.setIcon(image);
		greenPanel.add(label);

		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}
