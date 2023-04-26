package gui.demo;

import javax.swing.*;
import java.awt.event.*;

// reffered from https://www.javatpoint.com/java-jmenuitem-and-jmenu
public class JMenuDemo implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help;
	JMenuItem cut, copy, paste, selectAll;
	JTextArea ta;

	JMenuDemo() {
		f = new JFrame();
		
		// menu items
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		// menu options
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);

		// menu bar
		mb = new JMenuBar();
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		ta = new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		
		f.add(mb);
		f.add(ta);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();
	}

	public static void main(String[] args) {
		new JMenuDemo();
	}
}
