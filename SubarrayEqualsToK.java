package Array;

import java.util.HashMap;

public class SubarrayEqualsToK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0, sum = 0;
        map.put(0, 1);// we are checking the number of sub arrays so we have to add this suppose
                      // preSum-k = 0 then we have to add 1 in count, we were not doing that in max
                      // subarray with sum k because there we just have to check the maximum ele not
                      // the counts.
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum - k;
            if (map.containsKey(rem)) {
                c += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(map);

        return c;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1 };
        int k = 2;
        System.out.println(new SubarrayEqualsToK().subarraySum(arr, k));
    }
}
