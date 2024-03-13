package Services;

import entites.Client;
import exceptions.ExceptionsTratament;

public class MethodPaymentCard implements PaymentMethod {

	@Override
	public void processPayment(Account account, double amount)
		double tax = amount + (amount * 0.05); // tax value of 5%
		if(tax >  ) {
			throw new ExceptionsTratament("Value invalid, limit smaller than the proposed value");
		}
			double returnValue = client.getCard().getLimit() - tax;

	}

}	
