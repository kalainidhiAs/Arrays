package Array;

import java.util.HashMap;

public class ContiguousBinaryArray {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 0, 1, 1, 0, 1 };
        int n = arr.length;
        int zeros = 0, ones = 0, maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else {
                ones++;
            }

            int diff = zeros - ones;

            if (map.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - map.get(diff));
            } else {
                map.put(diff, i);
            }
        }

        System.out.println(maxLen);
    }
}
