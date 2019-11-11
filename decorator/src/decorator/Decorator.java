package decorator;

public abstract class Decorator extends VisualComponent {
	protected VisualComponent wrapped;
	
	public Decorator(VisualComponent comp) {
		this.wrapped = comp;
	}
}
