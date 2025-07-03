package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class frequencyElement {
    public static List<Integer> findElements(int arr[], int k) {
        int x = arr.length / k;

        // store element count.
        HashMap<Integer, Integer> elementCount = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int i : elementCount.keySet()) {
            if (elementCount.get(i) > x) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3 };

        List<Integer> pass = findElements(arr, 3);
        System.out.println(pass);
    }
}
