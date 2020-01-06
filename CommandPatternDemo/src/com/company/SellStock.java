package com.company;

public class SellStock implements Order{
        private Stock saddleStock;

        public SellStock(Stock saddleStock){
            this.saddleStock = saddleStock;
        }

        public void execute(){

            saddleStock.sell();
        }
    }


