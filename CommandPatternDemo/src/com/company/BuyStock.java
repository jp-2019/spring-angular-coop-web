package com.company;

public class BuyStock implements Order{
    private Stock saddleStock;

    public BuyStock(Stock saddleStock){
        this.saddleStock = saddleStock;
    }

    public void execute(){

        saddleStock.buy();
    }
}
