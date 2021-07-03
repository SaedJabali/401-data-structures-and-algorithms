import java.util.Arrays;

public class ArrayRevers {
    public static void main(String[] args) {

        int[] originalArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArr = new int[originalArr.length];
        int length = originalArr.length;
        System.out.println("The input Array " + Arrays.toString(originalArr));
        System.out.println("The reversed Array");
        for (int j : originalArr) {
            reversedArr[length - 1] = j;
            length = length - 1;
        }

        for (int i = 0; i < originalArr.length; i++) {
            System.out.println(reversedArr[i]);
        }

    }
}