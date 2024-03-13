package Services;

import entites.Client;

public interface PaymentMethod {
	
	 void processPayment(Account account, double amount);
	
	// double refoundMake(double amount);
	
}
