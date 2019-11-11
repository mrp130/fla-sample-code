package strategy;

public class Visa implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("bayar pakai visa");
	}

}
