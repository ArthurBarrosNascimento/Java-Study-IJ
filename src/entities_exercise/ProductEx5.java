package entities_exercise;

public class ProductEx5 {
    private String productName;
    private Double productPrice;
    private Integer productQuantity;

    public ProductEx5(String name, Double price, Integer quantity) {
        this.productName = name;
        this.productPrice = price;
        this.productQuantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public double total() {
        return productPrice * productQuantity;
    }
}
