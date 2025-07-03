package Array;

import java.util.*;

public class SubArrayWIthAtleastK {
    static int subarrayCount(int arr[], int N, int k) {
        // code here
        // int i = count(arr, k);
        // int j = count(arr, k - 1);
        // System.out.println(i + " " + j);
        return count(arr, k) - count(arr, k - 1);
    }

    public static int count(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, c = 0;
        while (j < arr.length) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while (map.size() > k) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            c += j - i + 1;
            j++;
        }

        return c;
    }

    public static void main(String[] args) {
        int N = 5, k = 2, arr[] = { 1, 2, 1, 2, 3 };
        System.out.println(subarrayCount(arr, N, k));
    }
}
