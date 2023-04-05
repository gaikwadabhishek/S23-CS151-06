package gui.demo;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo extends JFrame implements ActionListener {
	JButton button;

	public JButtonDemo() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(null);

		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.setText("FOO");
		button.addActionListener(this);
//		button.addActionListener(e -> System.out.println("BAR"));
		frame.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("BAR");
		}
	}

	public static void main(String[] args) {
		new JButtonDemo();
	}
}