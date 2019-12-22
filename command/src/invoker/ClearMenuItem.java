package invoker;

import command.ClearCommand;
import main.Main;

public class ClearMenuItem extends EditMenuItem {
	public ClearMenuItem(String name, Main m) {
		super(name, m);
		this.c = new ClearCommand();
	}
}
