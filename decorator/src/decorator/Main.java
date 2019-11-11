package decorator;

public class Main {
	public static void main(String[] args) {
		VisualComponent tv = new TextView();
		
		tv = new Border(tv);
		tv = new Scroll(tv);
		
		tv.draw();
	}
}
