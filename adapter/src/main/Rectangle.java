package main;

public class Rectangle extends Shape {

	@Override
	public void display(int x1, int y1, int x2, int y2) {
		legacy.Rectangle legacyRect;
		
		legacyRect = new legacy.Rectangle();
		
		legacyRect.display(x1, y1, 
				Math.abs(x2-x1), Math.abs(y2-y1));
	}
	
}
