package entites;

import java.time.LocalDateTime;

public class Card {
    private Integer cod;
    private LocalDateTime limitDate;
    private Double limit;

    public Card(Integer cod, LocalDateTime limitDate, Double limit) {
        this.cod = cod;
        this.limitDate = limitDate;
        this.limit = limit;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public LocalDateTime getLimitDate() {
        return limitDate;
    }

    public Double getLimit() {
        return limit;
    }


}
