package strategy;

public class Main {
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart(new PayPal());
		
		sc.checkout();
	}
}
