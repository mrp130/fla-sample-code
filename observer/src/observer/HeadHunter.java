package observer;

import java.util.Vector;

public class HeadHunter implements Subject {
	private Vector<Observer> observers = new Vector<Observer>();
	
	@Override
	public void attach(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void detach(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyAllObservers(Object message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
	
	public void PostNewJob(String jobName) {
		this.notifyAllObservers(jobName);
	}

}
