package Services;

import entites.Account;

public interface PaymentMethod {
	
	 void processPayment(Account account, double amount);
	
	// double refoundMake(double amount);
	
}
