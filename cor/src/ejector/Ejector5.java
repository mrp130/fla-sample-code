package ejector;

public class Ejector5 extends Ejector {
	public Ejector5() {
		super(new NullEjector());
	}
	
	
	public Ejector5(Ejector e) {
		this.successor = e;
	}
	
	@Override
	public boolean isWithdrawable(int amount) {
		return this.isWithdrawableByDeducting(amount, 5);
	}
	
}