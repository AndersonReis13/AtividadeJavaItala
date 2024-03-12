package entites;

public class Account {
	private String name;
	private String address;
	private Double cpf;

	public Account(String name, String address, Double cpf) {
		this.name = name;
		this.address = address;
		this.cpf = cpf;
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

}
