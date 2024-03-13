package entites;


import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    private String productType;

    private Double total;

    public Product(String name, Double price, Integer quantity, String productType) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double calc(){
        return quantity * price;
    }
}
