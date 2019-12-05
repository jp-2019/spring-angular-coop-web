package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 87, 57, -7, 370, 110, 90, 610, 02, 710, -1, 140, 203, 150 };
         for(int i = 0; i < intArray.length; i ++) {

             mergeSort(intArray, 0, intArray.length);
             System.out.println(intArray[i]);
         }

    }
    public static void  mergeSort(int[] input, int start, int end) {
        if(end - start < 2) {
            return;
        }

        // Note end array length is start index which is 0, end index last index + 1
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid -1] <= input[mid] ) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        //create a temporary array
        int [] temp = new int[end - start];
        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j]? input[i++]: input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp,0, input, start, tempIndex);
    }
}
