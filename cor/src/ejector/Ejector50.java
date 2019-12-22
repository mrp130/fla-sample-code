package ejector;

public class Ejector50 extends Ejector {
	public Ejector50() {
		super(new NullEjector());
	}
	
	public Ejector50(Ejector e) {
		this.successor = e;
	}
	
	@Override
	public boolean isWithdrawable(int amount) {
		return this.isWithdrawableByDeducting(amount, 50);
	}
	
}
