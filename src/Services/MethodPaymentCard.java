package Services;


import entites.Account;
import exceptions.ExceptionsTratament;

public class MethodPaymentCard implements PaymentMethod {

	@Override
	public void processPayment(Account account, double amount) {
		if(amount > account.getBankAccount().getCard().getLimit()) {
			throw new ExceptionsTratament("value invalid, limit unvailable");
		}

		double tax = amount * 0.03;

		double valueTotal = amount + tax;

		account.getBankAccount().getCard().setLimit(valueTotal);
	}
}
