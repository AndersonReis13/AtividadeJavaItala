package entites;

public class Client {
	private String name;
	private String address;
	private Double cpf;
	private Double bag;
	
	private Card card;

	public Client(String name, String address, Double cpf, Double bag ,Card card ) {
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.bag = bag;
		this.card = card;
	
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

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Double getBag() {
		return bag;
	}

	public void removeBag(double amount) {
		bag = bag - amount;
	}



}
