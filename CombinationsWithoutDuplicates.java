package Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationsWithoutDuplicates {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int combinationSize = 3;

        List<List<Integer>> combinations = generateCombinations(arr, combinationSize);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
        System.out.println(combinations.size());
    }

    public static List<List<Integer>> generateCombinations(int arr[], int combinationSize) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationHelper(arr, combinationSize, 0, new ArrayList<>(), result);
        return result;
    }

    public static void generateCombinationHelper(int arr[], int combinationSize, int start, List<Integer> current,
            List<List<Integer>> result) {

        if (current.size() == combinationSize) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            // System.out.println(current);
            generateCombinationHelper(arr, combinationSize, i + 1, current, result); // Allow the same element // start
                                                                                     // = i;
            current.remove(current.size() - 1);
            // System.out.println(current);
        }
    }
}
