package Array;

import java.util.Arrays;

public class MinimizeTheHeight {
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;

            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            result = Math.min(result, maxH - minH);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 10 };
        int k = 2;
        int n = arr.length;
        System.out.println("Minimum height difference: " + getMinDiff(arr, n, k));
    }
}

/*
 * Given an array arr[] denoting heights of N towers and a positive integer K.
 * 
 * For each tower, you must perform exactly one of the following operations
 * exactly once.
 * 
 * Increase the height of the tower by K
 * Decrease the height of the tower by K
 * Find out the minimum possible difference between the height of the shortest
 * and tallest towers after you have modified each tower.
 * 
 * You can find a slight modification of the problem here.
 * Note: It is compulsory to increase or decrease the height by K for each
 * tower. After the operation, the resultant array should not contain any
 * negative integers.
 * 
 * Example 1:
 * 
 * Input:
 * K = 2, N = 4
 * Arr[] = {1, 5, 8, 10}
 * Output:
 * 5
 * Explanation:
 * The array can be modified as
 * {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
 * The difference between
 * the largest and the smallest is 8-3 = 5.
 */