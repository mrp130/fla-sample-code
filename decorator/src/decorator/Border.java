package decorator;

public class Border extends Decorator {
	public Border(VisualComponent comp) {
		super(comp);
	}

	@Override
	public void draw() {
		System.out.println("border digambar");
		this.wrapped.draw();
	}
	
	

}
