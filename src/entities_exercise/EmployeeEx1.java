package entities_exercise;

public class EmployeeEx1 {
    protected String name;

    protected Integer hours;

    protected Double valuePerHour;

    public EmployeeEx1() {
    };

    public EmployeeEx1(String name, Integer value, Double valuePerHour) {
        this.name = name;
        this.hours = value;
        this.valuePerHour = valuePerHour;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return this.hours * this.valuePerHour;
    }
}
