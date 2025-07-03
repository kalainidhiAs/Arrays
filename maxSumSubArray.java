package Array;

import java.util.ArrayList;
import java.util.List;

public class maxSumSubArray {
    public int maxSubArray(ArrayList<Integer> arr, int k, int n) {

        if (k > n) {
            return -1;
        }

        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            maxsum += arr.get(i);
        }

        int currentsum = maxsum;
        for (int i = k; i < n; i++) {
            currentsum = currentsum - arr.get(i - k) + arr.get(i);
            maxsum = Math.max(currentsum, maxsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        maxSumSubArray newarr1 = new maxSumSubArray();
        int N1 = 4;
        int K1 = 2;
        ArrayList<Integer> Arr1 = new ArrayList<>(List.of(100, 200, 300, 400));
        int output1 = newarr1.maxSubArray(Arr1, K1, N1);
        System.out.println(output1);

        int N2 = 4;
        int K2 = 4;
        ArrayList<Integer> Arr2 = new ArrayList<>(List.of(100, 200, 300, 400));
        int output2 = newarr1.maxSubArray(Arr2, K2, N2);
        System.out.println(output2);
    }
}
