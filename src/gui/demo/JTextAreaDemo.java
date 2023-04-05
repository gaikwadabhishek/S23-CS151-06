package gui.demo;

import javax.swing.*;
import java.awt.event.*;

public class JTextAreaDemo extends JFrame implements ActionListener {
	JLabel l1, l2;
	JTextArea area;
	JButton b;

	JTextAreaDemo() {
		// super();
//		new JFrame();
		l1 = new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2 = new JLabel();
		l2.setBounds(160, 25, 100, 30);
		area = new JTextArea();
		area.setBounds(20, 75, 250, 200);
		b = new JButton("Count Words");
		b.setBounds(100, 300, 120, 30);
		b.addActionListener(this);
		this.add(l1);
		this.add(l2);
		this.add(area);
		this.add(b);
		this.setSize(450, 450);
		this.setLayout(null);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new JTextAreaDemo();
	}

	public void actionPerformed(ActionEvent e) {
		String text = area.getText();
		String words[] = text.split("\\s");
		l1.setText("Words: " + words.length);
		l2.setText("Characters: " + text.length());
	}
}