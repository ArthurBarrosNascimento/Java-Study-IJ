package entities_exercise;

public class ProductEx2 {
    protected String name;
    protected Double price;

    public ProductEx2() {
    }

    public ProductEx2(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return "Product: "
                + this.name
                + ", Price: $"
                + this.price;
    }
}
