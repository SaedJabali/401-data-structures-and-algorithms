class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        System.out.println("The number chosen is at index "+binarySearch(arr, 16));
    }
    public static int binarySearch(int[] list, int target) {
        int left = 0;
        int right = list.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target < list[middle]) {
                right = middle - 1;
            } else if (target > list[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}