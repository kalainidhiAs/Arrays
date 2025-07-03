package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutation {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {

        List<List<Integer>> result = new ArrayList<>();
        int[] numsArray = new int[n];

        // Convert ArrayList<Integer> to int[]
        for (int i = 0; i < n; i++) {
            numsArray[i] = arr.get(i);
        }

        Arrays.sort(numsArray); // Sort the array to handle duplicate elements

        boolean[] used = new boolean[n];
        backtrack(numsArray, used, new ArrayList<>(), result);

        // Convert List<List<Integer>> to ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (List<Integer> list : result) {
            resultList.add(new ArrayList<>(list));
        }

        return resultList;
    }

    private static void backtrack(int[] nums, boolean[] used, List<Integer> currentPermutation,
            List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            System.out.println(currentPermutation.size());
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                // Skip duplicates or already used elements
                continue;
            }

            // System.out.print("hi");

            used[i] = true;
            currentPermutation.add(nums[i]);

            backtrack(nums, used, currentPermutation, result);

            used[i] = false;
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(1);
        arr.add(7);

        int n = arr.size();

        // Calling the uniquePerms method
        ArrayList<ArrayList<Integer>> result = uniquePerms(arr, n);

        // Printing the result
        for (ArrayList<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
