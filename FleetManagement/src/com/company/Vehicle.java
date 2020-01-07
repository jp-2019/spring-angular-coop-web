package com.company;

public class Vehicle {
    String type;
    String color;
    int capacity;
   int  doors;
   int tires;
   String seats;


   public void Health(){
       System.out.println(type);
       System.out.println(color);
       System.out.println(capacity + " seating capacity");
       System.out.println(doors + " doors");
       System.out.println(tires + " tires");
       System.out.println(seats + " seat interior");

   }
}
