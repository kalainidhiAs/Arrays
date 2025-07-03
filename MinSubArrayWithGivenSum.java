package Array;

public class MinSubArrayWithGivenSum {
    public static int minlenSubArray(int arr[], int n, int k) {
        int left = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= k) {
                minlength = Math.min(minlength, right - left + 1);
                sum -= arr[left];
                left++;
            }

        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 3 };
        int n = arr.length;
        int k = 7;
        System.out.println(minlenSubArray(arr, n, k));
    }
}

/*
 * class Solution {
 * public int minSubArrayLen(int target, int[] nums) {
 * int left = 0;
 * int right = 0;
 * int sum = 0;
 * int minlength = Integer.MAX_VALUE;
 * 
 * while(right < nums.length){
 * sum += nums[right];
 * 
 * while(sum >= target){
 * minlength = Math.min(minlength, right-left+1);
 * sum -= nums[left];
 * left++;
 * }
 * right++;
 * }
 * return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
 * }
 * }
 */