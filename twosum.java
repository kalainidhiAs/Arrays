package Array;

import java.util.Arrays;

public class twosum {
    public int[] sum(int nums[], int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 7, 9 };
        int target = 16;
        twosum newsum = new twosum();
        int arr[] = newsum.sum(nums, target);
        System.out.println(Arrays.toString(arr));
    }
}
