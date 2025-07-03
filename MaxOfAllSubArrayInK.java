package Array;

import java.util.ArrayList;

public class MaxOfAllSubArrayInK {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();

        int l = 0;

        for (int i = 0; i < n - k + 1; i++) {
            int count = 0;
            int max = Integer.MIN_VALUE;
            while (count < k && i + count < n) {

                max = Math.max(max, arr[i + count]);
                count++;
            }
            l++;
            result.add(max);

            System.out.println(l + " " + max);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = arr.length;
        int k = 3;
        // System.out.println(System.nanoTime());
        System.out.println(max_of_subarrays(arr, n, k));
    }
}
