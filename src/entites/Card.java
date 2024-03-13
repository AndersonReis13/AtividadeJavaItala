package entites;

import java.time.LocalDateTime;

public class Card {
    private Integer cod;
    private Double limit;
    private Integer password;

    private Invoice invoice;

    public Card(Integer cod, Double limit, Integer password) {
        this.cod = cod;
        this.limit = limit;
        this.password = password;
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

    public Invoice getInvoice(){
        return invoice;
    }

    public Integer getPassword() {
        return password;
    }


    public void setLimit(Double valuetotal) {
        limit = limit - valuetotal;
    }
}
