package entites;

import java.util.Random;

public class BankAccount{
	private Integer codAgency;
	private Double balance;
	private Double withdrawn;

	private Card card;

	public BankAccount(Integer codAgency, Double balance, Card card) {
		this.codAgency = codAgency;
		this.balance = balance;
		this.card = card;
	}

	public Integer getCodAgency() {
		return codAgency;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawn() {
		return withdrawn;
	}

	
	public Card getCard() {
		return card;
	}

	public void generateCodAgency(){
		Random randomNumberAgency = new Random();
	}
	
	public void updateBalance(double returnValue) {
		balance = balance - returnValue;
	}

	public void withdrawnAccount(double withdrawn){
		balance = balance - withdrawn;
	}

}
