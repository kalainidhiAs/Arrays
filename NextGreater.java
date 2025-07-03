package Array;

import java.util.*;

public class NextGreater {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); // Initialize with -1, indicating no greater element found

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                // System.out.println(nums[stack.peek()]);
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
            System.out.println(stack);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 4 };
        int[] nextGreater = nextGreaterElement(nums);

        System.out.println("Element\tNext Greater Element");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "\t\t" + (nextGreater[i] == -1 ? "-1" : nextGreater[i]));
        }
    }
}
