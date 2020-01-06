package com.company;

public class CustomerOrder {
    public static void main(String[] args) {
        Stock saddle = new Stock();
        BuyStock buyStock = new BuyStock(saddle);
        SellStock sellStock = new SellStock(saddle);

        InvokerClass invoker = new InvokerClass();

        invoker.takeOrder(buyStock);
        invoker.takeOrder(sellStock);

        invoker.placeOrders();
    }
}
