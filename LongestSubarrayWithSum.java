package Array;

import java.util.HashMap;

public class LongestSubarrayWithSum {
    public static int lenOfLongSubarr(int A[], int N, int k) {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(map);
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, 9 }, k = 15;
        System.out.println(lenOfLongSubarr(arr, arr.length, k));
    }
}
