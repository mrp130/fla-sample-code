
public class Main {
	public static void main(String[] args) {
		Monster m = new Monster(100, 10);
		
		try {
			Monster m2 = (Monster) m.clone();
			
			m.attack(m2);
			
			System.out.println(m);
			System.out.println(m2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
