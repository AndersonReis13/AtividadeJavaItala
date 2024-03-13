package Services;


import entites.Account;
import exceptions.ExceptionsTratament;

public class MethodPaymentCard implements PaymentMethod {

	@Override
	public void processPayment(Account account, double amount) {
		if(amount > account.getBankAccount().getCard().getLimit()) {
			throw new ExceptionsTratament("Valor invalido, boleto maior que o valor inserido");
		}
		
	}
}
