//ALGORITHM QuickSort(arr, left, right)
//        if left < right
//// Partition the array by setting the position of the pivot value
//        DEFINE position <-- Partition(arr, left, right)
//        // Sort the left
//        QuickSort(arr, left, position - 1)
//        // Sort the right
//        QuickSort(arr, position + 1, right)
//
//        ALGORITHM Partition(arr, left, right)
//        // set a pivot value as a point of reference
//        DEFINE pivot <-- arr[right]
//        // create a variable to track the largest index of numbers lower than the defined pivot
//        DEFINE low <-- left - 1
//        for i <- left to right do
//        if arr[i] <= pivot
//        low++
//        Swap(arr, i, low)
//
//        // place the value of the pivot location in the middle.
//        // all numbers smaller than the pivot are on the left, larger on the right.
//        Swap(arr, right, low + 1)
//        // return the pivot index point
//        return low + 1
//
//        ALGORITHM Swap(arr, i, low)
//        DEFINE temp;
//        temp <-- arr[i]
//        arr[i] <-- arr[low]
//        arr[low] <-- temp

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("ok");

        int[] arr = {8, 4, 23, 42, 16, 15, 1, -1};
        quickSort(arr,0,7);
        int[] ReverseSorted = {20, 18, 12, 8, 5, -2};
        quickSort(ReverseSorted,0,5);
        int[] FewUniques = {5, 12, 7, 5, 5, 7};
        quickSort(FewUniques,0,5);
        int[] NearlySorted = {2, 3, 5, 7, 13, 11};
        quickSort(NearlySorted,0,5);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Left "+left + " Right "+right);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);

        return low + 1;
    }

    public static void swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
