package entities_exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductEx2 extends ProductEx2{
    protected Date manufactureDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public UsedProductEx2() {
        super();
    }

    public UsedProductEx2(String name, Double price, Date date) {
        super(name, price);
        this.manufactureDate = date;
    }
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return "Product: "
                + this.name
                + " (used)"
                + ", Price: $"
                + this.price
                + " (Manufacture date: "
                + sdf.format(this.manufactureDate)
                + ")";
    }
}
