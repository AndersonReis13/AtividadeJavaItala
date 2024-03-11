package entites;

public class Card{
	private Integer cod;
	private Double limit;
	
	public Card(Integer cod, Double limit) {
		this.cod = cod;
		this.limit = limit;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Double getLimit() {
		return limit;
	}

	
	public void removeLimit(double amount) {
		limit = limit - amount;
	}
	
}
