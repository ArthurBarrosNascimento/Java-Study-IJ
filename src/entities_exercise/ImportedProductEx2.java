package entities_exercise;

public class ImportedProductEx2 extends ProductEx2{
    protected Double curstomsFree;

    public ImportedProductEx2() {
        super();
    }

    public ImportedProductEx2(String name, Double price, Double curstomsFree) {
        super(name, price);
        this.curstomsFree = curstomsFree;
    }

    public Double getCurstomsFree() {
        return curstomsFree;
    }

    public void setCurstomsFree(Double curstomsFree) {
        this.curstomsFree = curstomsFree;
    }

    private Double totalPrice() {
        return this.price + curstomsFree;
    }

    @Override
    public String priceTag() {
        return "Product: "
                + this.name
                + ", Price: $"
                + totalPrice()
                + " (Customs fee: $ "
                + this.curstomsFree
                + ")";
    }
}
