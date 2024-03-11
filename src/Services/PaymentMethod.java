package Services;

import entites.Client;

public interface PaymentMethod {
	
	 void processPayment(Client client, double amount);
	
	// double refoundMake(double amount);
	
}
