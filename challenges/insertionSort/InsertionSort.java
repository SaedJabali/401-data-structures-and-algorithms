//InsertionSort(int[] arr)
//
//        FOR i = 1 to arr.length
//
//        int j <-- i - 1
//        int temp <-- arr[i]
//
//        WHILE j >= 0 AND temp < arr[j]
//        arr[j + 1] <-- arr[j]
//        j <-- j - 1
//
//        arr[j + 1] <-- temp

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("ok");

        int[] arr = {8, 4, 23, 42, 16, 15, 1, -1};
        insertSort(arr);
        int[] ReverseSorted = {20, 18, 12, 8, 5, -2};
        insertSort(ReverseSorted);
        int[] FewUniques = {5, 12, 7, 5, 5, 7};
        insertSort(FewUniques);
        int[] NearlySorted = {2, 3, 5, 7, 13, 11};
        insertSort(NearlySorted);
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}