//ALGORITHM Mergesort(arr)
//        DECLARE n <-- arr.length
//
//        if n > 1
//        DECLARE mid <-- n/2
//        DECLARE left <-- arr[0...mid]
//        DECLARE right <-- arr[mid...n]
//        // sort the left side
//        Mergesort(left)
//        // sort the right side
//        Mergesort(right)
//        // merge the sorted left and right sides together
//        Merge(left, right, arr)
//
//        ALGORITHM Merge(left, right, arr)
//        DECLARE i <-- 0
//        DECLARE j <-- 0
//        DECLARE k <-- 0
//
//        while i < left.length && j < right.length
//        if left[i] <= right[j]
//        arr[k] <-- left[i]
//        i <-- i + 1
//        else
//        arr[k] <-- right[j]
//        j <-- j + 1
//
//        k <-- k + 1
//
//        if i = left.length
//        set remaining entries in arr to remaining values in right
//        else
//        set remaining entries in arr to remaining values in left

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println("ok");

        int[] arr = {8, 4, 23, 42, 16, 15, 1, -1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        int[] ReverseSorted = {20, 18, 12, 8, 5, -2};
        System.out.println(Arrays.toString(mergeSort(ReverseSorted)));
        int[] FewUniques = {5, 12, 7, 5, 5, 7};
        System.out.println(Arrays.toString(mergeSort(FewUniques)));
        int[] NearlySorted = {2, 3, 5, 7, 13, 11};
        System.out.println(Arrays.toString(mergeSort(NearlySorted)));
    }

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;

        if (n > 1) {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;

            if (i == left.length) {
                arr[k] = right[j];
                j++;
                k++;
            } else {
                arr[k] = left[i];
                i++;
                k++;

            }

        }
    }
}

