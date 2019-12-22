package invoker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import command.EditCommand;
import main.Main;

public abstract class EditMenuItem extends JMenuItem implements ActionListener {
	protected EditCommand c;
	protected Main client;
	
	public EditMenuItem(String name, Main m) {
		super(name);
		client = m;
		
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		c.execute(client);
	}
}
