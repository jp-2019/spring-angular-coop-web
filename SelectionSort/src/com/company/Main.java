package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {96, 10, 63, 20, 25, 57, 1, 0, 49, 80, 7, 16, 5, 10, -22, 840, 01, -5, };


        for (int i = 0 ;i< array.length; i++){
            int min = i;

            for (int next = i+1; next < array.length; next++){
                if (array[next] < array[min]){
                    min = next; // minimum number in index should change position
                }
            }
            int temp = array[min]; // create a variable to hold the minimum
            array[min] = array[i]; // swap the minimum array with index
            array[i] = temp;  // assign array with the temporary variable
            System.out.print(" "+ array[i]);
        }


    }
}
