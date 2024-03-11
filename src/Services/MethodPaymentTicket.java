package Services;

import entites.Client;
import exceptions.ExceptionsTratament;

public class MethodPaymentTicket implements PaymentMethod {

	@Override
	public void processPayment(Client client, double amount) {
		if(amount > client.getBag() ) {
			throw new ExceptionsTratament("Valor invalido, boleto maior que o valor inserido");
		}
			double returnValue = client.getBag() - amount;
			
			client.removeBag(returnValue);
	}
}
