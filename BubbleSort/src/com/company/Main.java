package com.company;

public class Main {

    public static void main(String[] args) {
    int[] intArray = {72,-1,45,-22,3,1,7,};
    for(int unsorted = intArray.length - 1; unsorted > 0; unsorted--) {
        for(int sorted = 0; sorted < unsorted; sorted++) {
            if(intArray[sorted] > intArray[sorted + 1]) {
                swap(intArray, sorted, sorted +1);

            }
        }
    }
    for(int i = 0; i < intArray.length; i++) {
        System.out.println(intArray[i]);
    }
    }

    public static void swap (int[] array, int i, int j) {
if(i == j){
    return;
}
int temp = array[i];
array[i] = array[j];
array[j] = temp;
    }
}
