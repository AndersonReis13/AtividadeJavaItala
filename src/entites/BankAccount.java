package entites;

public class BankAccount extends Account{
	
	

	private Integer codAgency;
	private Double saldo;
	private Double saque;
	
	public BankAccount(String name, String address, Double cpf, Integer codAgency, Double saldo, Double saque) {
		super(name, address, cpf);
		this.codAgency = codAgency;
		this.saldo = saldo;
		this.saque = saque;
	}

	public Integer getCodAgency() {
		return codAgency;
	}

	public void setCodAgency(Integer codAgency) {
		this.codAgency = codAgency;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getSaque() {
		return saque;
	}

	public void setSaque(Double saque) {
		this.saque = saque;
	}
	
}
