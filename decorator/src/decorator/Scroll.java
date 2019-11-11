package decorator;

public class Scroll extends Decorator {
	public Scroll(VisualComponent comp) {
		super(comp);
	}

	@Override
	public void draw() {
		System.out.println("scroll digambar");
		this.wrapped.draw();
	}
	
	

}
