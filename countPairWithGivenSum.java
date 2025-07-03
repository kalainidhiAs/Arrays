package Array;

import java.util.HashMap;

public class countPairWithGivenSum {
    public static int counPairs(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int rem = k - arr[i];

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.println(map.entrySet());
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 1 };
        int k = 6;
        int n = arr.length;
        System.out.println(counPairs(arr, n, k));
    }
}
