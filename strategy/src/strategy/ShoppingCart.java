package strategy;

public class ShoppingCart {
	PaymentMethod paymentMethod;
	
	public ShoppingCart(PaymentMethod method) {
		this.paymentMethod = method;
	}
	
	public void checkout() {
		//...
		
		paymentMethod.pay();
		
		//...
	}
}
