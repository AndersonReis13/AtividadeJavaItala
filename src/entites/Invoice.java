package entites;

public class Invoice {

    private Integer quantity;
    private Double totalValue;

    private Card card;

    public Invoice(Integer quantity, Double totalValue) {
        this.quantity = quantity;
        this.totalValue = totalValue;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
