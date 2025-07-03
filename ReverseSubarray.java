package Array;

import java.util.ArrayList;

public class ReverseSubarray {
    public static void reverseSubarrays(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            reverse(arr, left, right);
        }
    }

    public static void reverse(ArrayList<Integer> arr, int left, int right) {
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        int n = arr.size();
        int k = 3;

        reverseSubarrays(arr, n, k);

        // Print the modified array
        System.out.print("Output for Example 1: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
// input 1 2 3 4 5
// Output for Example 1: 3 2 1 5 4