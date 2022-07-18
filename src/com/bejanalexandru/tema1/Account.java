package com.bejanalexandru.tema1;

public class Account {
    private int accountNo;
    private float amount;
    private int nationalId;

    public Account() {
    }

    public void deposit(int amount) {
        this.amount+=amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if(this.amount >= amount) {
            this.amount-=amount;
        }
        else {
            throw new NotEnoughMoneyException();
        }
    }

    public void linkToNationalId(int nationalId) throws InvalidNationalIdException {
        if(nationalId > 0) {
            this.nationalId = nationalId;
        }
        else {
            throw new InvalidNationalIdException();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", nationalId=" + nationalId +
                '}';
    }
}
