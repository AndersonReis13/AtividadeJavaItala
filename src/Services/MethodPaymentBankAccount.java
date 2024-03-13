package Services;

import entites.Account;
import exceptions.ExceptionsTratament;

public class MethodPaymentBankAccount implements PaymentMethod {

	@Override
	public void processPayment(Account account, double amount) {

		if(amount > account.getBankAccount().getBalance()) {
			throw new ExceptionsTratament("Value invalid, balance smaller than the proposed value");
		}
			double returnValue = account.getBankAccount().getBalance();
			
			account.getBankAccount().updateBalance(returnValue);
	}

}	
