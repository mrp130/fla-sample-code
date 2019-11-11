package main;

public class Main {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		foo(s);
	}
	
	public static void foo(Shape s) {
		s.display(3, 3, 10, 10);
	}

}
