package entites;

import java.util.Random;

public class BankAccount{
	private Integer codAgency;
	private Double balance;
	private Double withdrawn;


	public BankAccount(String name, String address, Double cpf, Integer codAgency, Double balance, Double withdrawn) {
		this.codAgency = codAgency;
		this.balance = balance;
		this.withdrawn = withdrawn;
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

	public void setSaque(Double withdrawn) {
		this.withdrawn = withdrawn;
	}

	public void generateCodAgency(){
		Random randomNumberAgency = new Random();


	}
}
