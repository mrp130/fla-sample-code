package observer;

public class JobSeeker implements Observer {
	private String name;
	
	public JobSeeker(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Object message) {
		System.out.println(name + " mau kerja jadi: " + message);
	}

}
