package ejector;

public class NullEjector extends Ejector {
	public NullEjector() {
		
	}

	@Override
	public boolean isWithdrawable(int amount) {
		return false;
	}
	
}
