package Array;

import java.util.Arrays;

class Solution {
    public static int findKthLargest(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        return nums[nums.length - k];

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int result = findKthLargest(nums, 2);
        System.out.println(result);
    }
}
