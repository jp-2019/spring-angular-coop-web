package com.company;

public class Subtraction implements Strategy {
    @Override
    public int doOperations(int num1, int num2) {
        return num1 - num2;
    }
}
