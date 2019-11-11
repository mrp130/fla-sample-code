
public class Weapon {
	private int durability;
	
	public Weapon() {
		this.durability = 100;
	}
	
	public void attack() {
		this.durability -= 1;
	}
	
	@Override
	public String toString() {	
		return this.durability + "";
	}
}
