package composite;

import java.util.Vector;

public class Folder extends Element {
	private Vector<Element> elements;
	
	public void add(Element e) {
		elements.add(e);
	}
	
	@Override
	public void delete() {
		//...
		//...
		System.out.println("delete folder");
	}

}
