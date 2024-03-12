package entites;

import entities.enums.ProductEnums;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    private ProductEnums productType;

    private List<Product> ListProduct = new ArrayList<>();
    public Product(String name, Double price, Integer quantity, ProductEnums productType) {
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

    public void registerProduct(Product product) {
        ListProduct.add(product);
    }
}
