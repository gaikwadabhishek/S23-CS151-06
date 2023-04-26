package gui.demo.inclass.demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDemo extends JFrame implements ActionListener {

	JButton button;

	public JFrameDemo() {
		// super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);

		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.setText("HELLO");
		button.addActionListener(this);

		this.add(button);
	}

	public static void main(String[] args) {
		new JFrameDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			System.out.println("CS151");
		}

	}
}
