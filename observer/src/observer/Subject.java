package observer;

public interface Subject {
	public void attach(Observer obs);
	public void detach(Observer obs);
	public void notifyAllObservers(Object message);
}
