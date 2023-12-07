package entities_exercise;

import model.excepetions.DomainExcepetion;

public class AccountEx4 {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public AccountEx4() {
    }

    public AccountEx4(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdrawa(Double amount) throws DomainExcepetion{
        if (amount > this.withdrawalLimit) {
            throw new DomainExcepetion("The amount exceeds withdraw limit");
        }
        if (amount > this.balance) {
            throw new DomainExcepetion("Not enough balance");
        }

        this.balance -= amount;
    }
}
