package challenge4/main.java/App.java;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] any2 = {{0, 1, 5}, {-4, 7, 2}, {-3, 12, 11}};
        int[][] any = {{1, 6, 3}, {3, 8, 7}, {1, 20, 10}};
        int n = 14;
        int x = 14;
        System.out.println(recurseFib(n));
        System.out.println(iterateFib(x));
        System.out.println(Arrays.toString(arraySum(any2)));
    }

    public static int[] arraySum(int[][] arr) {
        int[] sumArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumArray[i] += arr[i][j];
            }
        }
        return sumArray;
    }

    static int recurseFib(int n) {
        if (n <= 1)
            return n;
        return recurseFib(n - 1) + recurseFib(n - 2);
    }

    static int iterateFib(int n) {
        int f[] = new int[n + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
