package Services;

import entites.Client;
import exceptions.ExceptionsTratament;

public class MethodPaymentCard implements PaymentMethod {

	@Override
	public void processPayment(Client client, double amount) {
		
		double tax = amount + (amount * 0.05); // tax value of 5%
		
		if(tax > client.getCard().getLimit() ) {
			throw new ExceptionsTratament("Valor invalido, limit menor que o valor inserido");
		} 
			

			double returnValue = client.getCard().getLimit() - tax;
			
			client.getCard().removeLimit(returnValue);	
	}

}	
