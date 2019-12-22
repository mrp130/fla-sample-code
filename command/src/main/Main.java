package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import invoker.ClearMenuItem;
import invoker.EditMenuItem;

public class Main extends JFrame {
	JMenuBar bar = new JMenuBar();
	JMenu edit = new JMenu("Edit");
	EditMenuItem clear = new ClearMenuItem("Clear", this);
	
	JTextField tx = new JTextField();
	
	public void clearText() {
		tx.setText("");
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		
		this.add(tx);
		
		edit.add(clear);
		bar.add(edit);
		this.setJMenuBar(bar);
	}
}
