package com.company;

public class StrategyDemo {
    public static void main(String[] args) {
        Context c = new Context(new OperationAdd());
        System.out.println(c.executeStrategy(5,4));

        Context c1 =new Context(new Subtraction());
        System.out.println(c1.executeStrategy(5,4));
    }
}
