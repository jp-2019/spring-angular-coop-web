public static void Quicksort (int[] Arr, int left, int right) {
        if (left >= right) return;                           // if left is the same as or more than right we are done or the method was called wrong
        int pivotIndex = partition(Arr, left, right);        //finds the index of the initial value swapped
        Quicksort(Arr, left, pivotIndex);                    //recursively enters method with a smaller array based on values lower than pivot
        Quicksort(Arr, pivotIndex + 1, right);               //performs same on right
        }

public static int partition(int[] Arr, int left, int right) {
        int pivot = Arr[left];                               //sets the pivot to the value stored in the left most element of the array
        while (left < right) {                               // iterates through the array from both sides
        while (Arr[left] < pivot) left++;                    //moves in from left if the value stored is less than the pivot
        while (Arr[right] > pivot) right--;                  //moves in from right if the value stored is higher than the pivot
        Quickswap(Arr, left, right);                         //swap the values found
        System.out.println(Arrays.toString(Arr));
        }
        System.out.println("returns: " + Arrays.toString(Arr) + " " + left);
        return left;                                         //return the location of swapped values
        }

public static void Quickswap(int[]Arr, int x, int y) {
        int temp = Arr[x];
        Arr[x] = Arr[y];
        Arr[y] = temp;
        }