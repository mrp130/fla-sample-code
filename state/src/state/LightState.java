package state;

public abstract class LightState {
	public abstract LightState handle(LightState previous);
}
