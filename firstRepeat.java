package Array;

import java.util.HashSet;

public class firstRepeat {

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 2, 1, 4 };
        int n = arr.length;
        System.out.println(firstRepeated(arr, n));
    }
}
