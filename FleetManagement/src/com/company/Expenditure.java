package com.company;

public class Expenditure {

    private double balance;
    //set deposit balance
    public Expenditure(){
        balance =  0.0;
    }

    //Deposit

    public double cost(double amount) {
        balance = balance + amount;
        return balance;
    }

    //Withdrawal
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    //get balance
    public double getBalance() {
        return balance;
    }
}
