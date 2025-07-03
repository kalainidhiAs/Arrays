package Array;

import java.util.*;

public class NextGreaterTwo {
    public static int[] nextGreaterElement(int[] nums) {
        int arr[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            arr[i] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }

        return arr;

        // int arr[] = new int[nums2.length];
        // Arrays.fill(arr, -1);
        // // Arrays.sort(arr);

        // Stack<Integer> s = new Stack<>();
        // for (int i = 0; i < nums2.length; i++) {
        // while (!s.isEmpty() && nums2[i] > nums2[s.peek()]) {
        // arr[s.pop()] = nums2[i];
        // }
        // s.push(i);
        // }

        // System.out.println(Arrays.toString(arr));

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // map.put(nums2[i], arr[i]);
        // }

        // for (int i = 0; i < nums1.length; i++) {
        // if (map.containsKey(nums1[i])) {
        // nums1[i] = map.get(nums1[i]);
        // }
        // }

        // return nums1;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 1 };
        int[] result = nextGreaterElement(nums1);
        System.out.println(Arrays.toString(result));
    }
}
