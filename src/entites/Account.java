package entites;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String name;
	private String address;
	private Double cpf;

	private BankAccount bankAccount;

	public Account(String name, String address, Double cpf, BankAccount bankAccount) {
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getCpf() {
		return cpf;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}


	@Override
	public String toString(){
		return "nome: " + name
			  + " Endereco: " + address
			  + " cpf:" + cpf
			  + " Codigo da agencia:" + bankAccount.getCodAgency()
			  +	" Cash do banco:" + bankAccount.getBalance();

	}

}
