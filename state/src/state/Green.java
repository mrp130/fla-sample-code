package state;

public class Green extends LightState {

	@Override
	public LightState handle(LightState previous) {
		return new Yellow();
	}

}
