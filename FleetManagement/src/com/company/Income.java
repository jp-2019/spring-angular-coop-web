package com.company;

public class Income {

    private double balance;
     //set deposit balance
    public Income(){
        balance =  0.0;
    }

    //Deposit

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    //Withdrawal
//    public void withdraw(double amount) {
//        balance = balance - amount;
//    }
//
//    //get balance
//    public double getBalance() {
//        return balance;
//    }
}
