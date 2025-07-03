package Array;

public class jumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxReach < i) {
                return false; // Cannot reach current index
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; // Can reach the last index
            }
        }

        // boolean jump = false;
        // int x = nums.length - 2;
        // int i = 1;
        // while (x >= 0) {
        // if (nums[x] >= i) {
        // jump = true;
        // i = 1;
        // } else {
        // i++;
        // jump = false;
        // }
        // x--;
        // }

        return false; // Cannot reach the last index
    }

    public static void main(String[] args) {
        jumpGame o = new jumpGame();

        // Test case 1
        int[] nums1 = { 3, 2, 1, 0, 4 };
        System.out.println("Test case 1: " + o.canJump(nums1)); // Expected: false

        // Test case 2
        int[] nums2 = { 2, 3, 1, 1, 4 };
        System.out.println("Test case 2: " + o.canJump(nums2)); // Expected: true

        // Test case 3
        int[] nums3 = { 0 };
        System.out.println("Test case 3: " + o.canJump(nums3)); // Expected: true
    }
}
