package state;

public class Red extends LightState {

	@Override
	public LightState handle(LightState previous) {
		return new Yellow();
	}

}
