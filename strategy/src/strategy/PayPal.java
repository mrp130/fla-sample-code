package strategy;

public class PayPal implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("bayar pakai paypal");
	}

}
