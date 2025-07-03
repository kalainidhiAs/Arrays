package Array;

import java.util.HashMap;

public class Hashmap {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        HashMap<String, Integer> mapping = new HashMap<>();

        // Populate the HashMap
        for (int i = 0; i < n; i++) {
            mapping.put(keys[i], arr[i]);
        }

        // Find the value associated with the given string
        for (String key : mapping.keySet()) {
            if (key.equals(s)) {
                return mapping.get(key);
            }
        }

        return -1; // Return -1 if the string is not found in the mapping
    }

    public static void main(String[] args) {
        int n = 3;
        String keys[] = { "sak", "varun", "vijay" };
        int arr[] = { 5, 7, 3 };
        String s = "sak";

        int result = map(n, keys, arr, s);

        System.out.println("Output: " + result);
    }
}
