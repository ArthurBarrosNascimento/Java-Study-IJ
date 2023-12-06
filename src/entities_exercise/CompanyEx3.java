package entities_exercise;

public class CompanyEx3 extends TaxPayerEx3{
    private Integer numberOfEmployees;

    public CompanyEx3() {
        super();
    }

    public CompanyEx3(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10 ) {
            return this.getAnualIncome() * 0.14;
        } else {
            return this.getAnualIncome() * 0.16;
        }
    }
}
