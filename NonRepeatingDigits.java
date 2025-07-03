package Array;

import java.util.*;

public class NonRepeatingDigits {
    public static void print(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 4, 5, 4, 6, 7, 5, 8, 6, 9 };
        print(arr);
    }
}
