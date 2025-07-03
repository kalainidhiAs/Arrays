package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSwapToSort {

    static int minSwaps(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOfRange(nums, 0, n);
        Arrays.sort(temp); // Sort the array to get the correct order

        // Create a mapping of element to its index in the sorted array
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(temp[i], i);
        }
        // System.out.println(indexMap);

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            // If the element is already visited or already in the correct position
            if (visited[i] || indexMap.get(nums[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = indexMap.get(nums[j]);
                cycleSize++;
            }

            if (cycleSize > 0) {
                // Swaps needed in a cycle = cycleSize - 1
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 8, 5, 4 };
        int result1 = minSwaps(nums1);
        System.out.println("Minimum swaps required for nums1: " + result1);

        int[] nums2 = { 10, 19, 6, 3, 5 };
        int result2 = minSwaps(nums2);
        System.out.println("Minimum swaps required for nums2: " + result2);
    }
}
