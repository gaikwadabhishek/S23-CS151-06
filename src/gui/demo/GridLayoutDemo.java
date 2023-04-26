package gui.demo;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {

	GridLayoutDemo() {
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		this.add(btn8);
		this.add(btn9);

		// a 3 * 3 grid is created with the horizontal gap 20
		// and vertical gap 25
		this.setLayout(new GridLayout(5, 2, 20, 25));
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String argvs[]) {
		new GridLayoutDemo();
	}
}