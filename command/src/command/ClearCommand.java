package command;

import main.Main;

public class ClearCommand extends EditCommand {

	@Override
	public void execute(Main m) {
		m.clearText();
	}

}
