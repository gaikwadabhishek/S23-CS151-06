package gui.demo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabelDemo {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(400, 400);

		JLabel label = new JLabel();
		label.setText("This week we are learning GUI"); // set text of label
		ImageIcon icon = new ImageIcon("sjsu1.jpeg");
		label.setIcon(icon); // add icon to label
		label.setVerticalTextPosition(JLabel.TOP); // set text to TOP, BOTTOM, CENTER of image
		label.setHorizontalTextPosition(JLabel.CENTER); // set text to LEFT, RIGHT, CENTER of image
		label.setForeground(Color.BLUE); // font color
		label.setFont(new Font("Roboto", Font.BOLD, 20)); // set font of text
		label.setIconTextGap(10); // set gap between image and text (can be -ve)
//		label.setBackground(Color.black); // background color of label
		label.setOpaque(true); // to display background of label
		label.setBorder(BorderFactory.createLineBorder(Color.gray, 15)); // creates border for label
		label.setHorizontalAlignment(JLabel.CENTER); // horizontal position to text+image in label
		label.setVerticalAlignment(JLabel.CENTER); // vertical position of text+image in label
		frame.setLayout(null); // need a layout manager to adjust sizes
		label.setBounds(0, 0, 500, 500); // sets x,y position of label w/ dimensions

		frame.add(label);
		// or frame.pack(); // fits true to size, use after frame.add(label) not before

	}
}