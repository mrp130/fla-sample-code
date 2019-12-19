package main;

import memento.Caretaker;
import memento.Originator;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Originator or = new Originator();
		Caretaker care = new Caretaker();
		
		or.addText("halo");
		System.out.println(or);
		care.addMemento(or.capture());
		
		
		or.addText(" dunia");
		System.out.println(or);
		care.addMemento(or.capture());

		or.addText(" maya");
		System.out.println(or);
		care.addMemento(or.capture());
		
		or.restore(care.undo());
		System.out.println(or);

		or.restore(care.undo());
		System.out.println(or);

		or.restore(care.undo());
		System.out.println(or);

		or.restore(care.redo());
		System.out.println(or);
		
		or.addText(" abc");
		System.out.println(or);
		care.addMemento(or.capture());
		
		or.restore(care.redo());
		System.out.println(or);
	}
}
