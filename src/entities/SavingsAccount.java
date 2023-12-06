package entities;

public class SavingsAccount extends Account{
    private Double interestRate;
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String name, Double balance, Double interestRate) {
        super(number, name, balance);
        this.interestRate = interestRate;
    }
    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance() {
        balance += balance * this.interestRate;
    }
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
