
public class Monster implements Cloneable {
	private int hp;
	private int damage;
	private Weapon weapon;
	
	public Monster(int hp, int damage) {
		super();
		this.hp = hp;
		this.damage = damage;
		this.weapon = new Weapon();
	}
	
	public void attack(Monster m) {
		m.attacked(this.damage);
		this.weapon.attack();
	}
	
	public void attacked(int damage) {
		this.hp -= damage;
	}
	
	@Override
	public String toString() {
		return "hp: " + this.hp + " weapon: " + weapon;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Monster o = new Monster(this.hp, this.damage);
		o.weapon = new Weapon();
		return o;
	}
}
