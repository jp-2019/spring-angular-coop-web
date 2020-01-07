package com.company;

public class Main {

    public static void main(String[] args) {

      //Create user deposit
   Income userIncome = new Income();
    double userIncomeUpdated = userIncome.deposit(5000);

    // Create client deposit
        Income clientIncome = new Income();
        double clientUpdated =  clientIncome.deposit(20000);

        double totalIncome = clientUpdated + userIncomeUpdated;

        //Create expenditure

        Expenditure repairs = new Expenditure();
        Expenditure fueling = new Expenditure();
        Expenditure parts = new Expenditure();
        Expenditure salaries = new Expenditure();
        Expenditure administration = new Expenditure();
        Expenditure maintenance = new Expenditure();

        double totalExpenditure;
        totalExpenditure = repairs + fueling + parts + salaries + administration + maintenance;


        System.out.println(totalIncome);

    }
}
