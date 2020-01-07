package com.company;

public class Main {

    public static void main(String[] args) {
	int array [] = {100, 20,80,65,32,40};
	int length = array.length;
	 for(int i = 0; i < length; i++) {
	     int min = i;
	     for(int i2 = i+1; i2<length; i2++){
	         if(array[i2] < array[min]){
	             min = i2;

	             int temp = array[min];

             }
         }
     }
}
