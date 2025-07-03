package Array;

import java.util.HashMap;

public class countElementMoreThanNbyK {
    public static int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        int times = n / k;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > times) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 4, 4 };
        int n = arr.length;
        int k = 3;
        System.out.println("Count of elements appearing more than n/k times: " + countOccurence(arr, n, k));
    }
}
