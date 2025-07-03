package Array;

/*
 * Given an array A of size N. The elements of the array consist of positive integers. 
 * You have to find the largest element with minimum frequency.
 */
import java.util.HashMap;

public class frequencyGame {
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        int freq = Integer.MAX_VALUE;
        for (int i : map.keySet()) {
            if (map.get(i) <= freq && i > max) {
                freq = map.get(i);
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, 50, 1, 50 };
        int n = arr.length;
        System.out.println(LargButMinFreq(arr, n));

    }
}
