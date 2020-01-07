package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {30, 10, 12, 61, 50, 81,};

        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
	public static void quickSort(int [] input, int start, int end) {
            if(end - start < 2) {
                return;
            }

            int pivotIndex = partition(input, start, end);
            quickSort(input, start, pivotIndex);
            quickSort(input, pivotIndex + 1, end);
        }

        public static int partition(int [] input, int start, int end ) {

        //Using the first element as the pivot
            int pivot = input [start];
            int i = start;
            int j = end;

            while(i < j) {

                //empty loop body
                while(i < j && input[--j] >= pivot);
                if(i < j) {
                    input[i] = input[j];
                }

                //empty loop body

                while (i < j && input[++i] <= pivot);
                if(i < j) {
                    input[j] = input[i];
                }

            }

            input[j] = pivot;
            return j;
        }
    }

