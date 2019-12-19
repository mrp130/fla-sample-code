package memento;

public class Memento {
	private String state;
	
	public Memento(String text) {
		state = text;
	}
	
	public String getState() {
		return state;
	}
}



