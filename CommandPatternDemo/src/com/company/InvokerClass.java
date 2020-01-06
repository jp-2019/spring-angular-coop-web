package com.company;

import java.util.ArrayList;
import java.util.List;

public class InvokerClass {

    private List<Order> orderList= new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for(Order order: orderList) {
            order.execute();
        }
        orderList.clear();     // This is a pre-existing method that clear your order.
    }
}
