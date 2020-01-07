package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arr = {9,1,6,8,-4,5};


        for (int unsorted = 1; unsorted < arr.length; unsorted++) {
            int newElement = arr[unsorted];
             int i;

            for (i = unsorted; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++)

        System.out.println(arr[i]);

    }
}
