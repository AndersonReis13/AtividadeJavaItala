package Services;

import entites.Account;
import exceptions.ExceptionsTratament;

public class MethodPaymentBankAccount implements PaymentMethod {

	@Override
	public void processPayment(Account account, double amount) {
		double tax = amount + (amount * 0.05); // tax value of 5%
		if(tax > account.getBankAccount().getBalance()) {
			throw new ExceptionsTratament("Value invalid, balance smaller than the proposed value");
		}
			double returnValue = account.getBankAccount().getBalance() - tax;
			
			account.getBankAccount().updateBalance(returnValue);;
	}

}	
