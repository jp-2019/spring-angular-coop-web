import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,6};
            bubbleSort(arr);

        insertionSort(arr);

    }
        public static void bubbleSort(int [] a) {
        boolean sorted = false;
        int temp;
        while(!sorted){
            sorted = true;
            for(int i = 0; i<a.length - 1; i++) {
                if(a[i]>a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
            System.out.println("We are done");
        }

    public static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int current = a[1];
            int j = i - 1;
            while (j >= 0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
    }
}

