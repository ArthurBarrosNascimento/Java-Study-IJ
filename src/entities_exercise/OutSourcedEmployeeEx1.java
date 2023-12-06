package entities_exercise;

public final class OutSourcedEmployeeEx1 extends EmployeeEx1{
    private Double addtionalCharge;

    public OutSourcedEmployeeEx1() {
        super();
    }

    public OutSourcedEmployeeEx1(String name, Integer value, Double valuePerHour, Double addtionalCharge) {
        super(name, value, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public final Double payment() {
        return ((this.hours * this.valuePerHour) + ((this.addtionalCharge * 110.0) / 100));
    }
}
