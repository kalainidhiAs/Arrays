package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static HashSet<Integer> unique(int arr[]) {
        ArrayList<Integer> dupdicate = new ArrayList<>();

        HashSet<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if (seen.contains(i)) {
                dupdicate.add(i);
            } else {
                seen.add(i);
            }
        }
        return seen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 4 };
        System.out.println(unique(arr));
    }
}
