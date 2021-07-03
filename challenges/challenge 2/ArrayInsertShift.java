import java.util.*;

public class ArrayInsertShift {

    public static int[] addX(int n, int arr[], int x) {
        int i;
        double middle = Math.ceil(arr.length / 2);

        int newArr[] = new int[n + 1];
        // newArr[n] = x;
        for (i = 0; i < n + 1; i++) {
            //  newArr[n] = x;
            if (i < middle) {
                newArr[i] = arr[i];
            }
            if (i == middle) {
                newArr[i] = x;
            } else if (i > middle) {
                newArr[i] = arr[i - 1];
            }
            // newArr[i] = arr[i];
        }


        return newArr;
    }

    public static void main(String[] args) {
        int i;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = arr.length;
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        int x = 50;

        arr = addX(length, arr, x);

        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));

    }
}