package memento;

import java.util.Vector;

public class Caretaker {
	private int index = 0;
	private Vector<Memento> mementos = new Vector<Memento>();
	
	/**
	 * add memento. remove undo-ed mementos if exist
	 * @param m Memento to add
	 */
	public void addMemento(Memento m) {
		this.removeMementoOnUpdate();
		mementos.add(m);
		index = mementos.size()-1;
	}
	
	/**
	 * remove memento from current index to the end of vector
	 */
	private void removeMementoOnUpdate() {
		int size = mementos.size();
		for(int i = index+1; i < size; i++) {
			mementos.remove(i);
		}
		mementos.trimToSize();
	}
	
	/**
	 * move mementos index backward
	 * 
	 * @return memento object on current index
	 */
	public Memento undo() {
		--index;
		if(index < 0) index = 0;
		return mementos.elementAt(index);
	}


	/**
	 * move mementos index forward
	 * 
	 * @return memento object on current index
	 */
	public Memento redo() {
		++index;
		if(index >= mementos.size()-1) index = mementos.size()-1;
		return mementos.elementAt(index);
	}
}
