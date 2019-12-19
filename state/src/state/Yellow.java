package state;

public class Yellow extends LightState {

	@Override
	public LightState handle(LightState previous) {
		if(previous.getClass() == Red.class) {
			return new Green();
		}
		
		return new Red();
	}

}
