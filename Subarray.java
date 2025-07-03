package Array;

public class Subarray {
    static void printSubArray(int arr[], int start, int end) {
        if (end == arr.length) {
            return;
        } else if (start > end) {
            printSubArray(arr, 0, end + 1);
        } else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(arr[end] + "]");
            printSubArray(arr, start + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4 };
        printSubArray(arr, 0, 0);
    }
}
