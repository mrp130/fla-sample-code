package ejector;

public class Ejector20 extends Ejector {
	public Ejector20() {
		super(new NullEjector());
	}
	
	public Ejector20(Ejector e) {
		this.successor = e;
	}
	
	@Override
	public boolean isWithdrawable(int amount) {
		return this.isWithdrawableByDeducting(amount, 20);
	}
	
}
