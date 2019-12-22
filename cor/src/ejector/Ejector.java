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
		if (amount < 0) {
			return false;
		}

		int deducted = amount;
		while(deducted > 0) {
			if(deducted < eject) {
				return successor.isWithdrawable(n) || successor.isWithdrawable(amount);
			}
			deducted -= eject;
		}
		return true;
	}
}
