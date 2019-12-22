package ejector;

public class Ejector100 extends Ejector {
	public Ejector100() {
		super(new NullEjector());
	}
	
	public Ejector100(Ejector e) {
		this.successor = e;
	}
	
	@Override
	public boolean isWithdrawable(int amount) {
		return this.isWithdrawableByDeducting(amount, 100);
	}
	
}
