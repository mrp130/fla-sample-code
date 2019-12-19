package memento;

public class Originator {
	private String text;
	
	public Originator() {
		text = "";
	}
	
	public void addText(String text) {
		this.text += text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	public void restore(Memento m) {
		text = m.getState();
	}
	
	public Memento capture() {
		return new Memento(text);
	}
}
