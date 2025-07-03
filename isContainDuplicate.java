package Array;

import java.util.Arrays;

public class isContainDuplicate {
    public static boolean condup(int nums[]) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 8, 6 };
        boolean num = condup(arr);
        System.out.println(num);
    }
}
