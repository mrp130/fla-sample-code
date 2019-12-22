package ejector;

public abstract class Ejector {
	protected Ejector successor;
	
	public Ejector() {
	}
	
	public Ejector(Ejector suc) {
		this.successor = suc;
	}
	
	public abstract boolean isWithdrawable(int amount);
	
	protected final boolean isWithdrawableByDeducting(int amount, int eject) {
		while(amount > 0) {
			if(amount < 100) {
				return successor.isWithdrawable(amount);
			}
			amount -= eject;
		}
		return true;
	}
}
