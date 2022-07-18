package com.bejanalexandru.tema1;

public class Main {
    public static void main(String[] args) throws NotEnoughMoneyException, InvalidNationalIdException {

        Account a1 = new Account();

        a1.deposit(100);
        a1.withdraw(50);
        a1.linkToNationalId(1);

        System.out.println(a1.toString());
    }
}
