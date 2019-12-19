package state;

public class Light {
	private LightState state;
	private LightState prevState;
	
	public Light() {
		state = new Red();
	}
	
	public void switchLight() {
		if(state.getClass() != Yellow.class) {
			prevState = state;
		}
		
		state = state.handle(prevState);
	}
	
	@Override
	public String toString() {
		return "lampu ini sedang: " + state;
	}
}
