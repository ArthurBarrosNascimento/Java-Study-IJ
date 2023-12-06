package entities_exercise;

public class IndividualEx3 extends TaxPayerEx3{
    private Double healthExpenditures;

    public IndividualEx3() {
        super();
    }

    public IndividualEx3(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (this.getAnualIncome() < 20000.0) {
            return this.getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return this.getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
