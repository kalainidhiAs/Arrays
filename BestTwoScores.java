package Array;

import java.util.Arrays;

public class BestTwoScores {
    public static int[] findTopTwoScores(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int len = array.length;

        int newarr[] = new int[2];
        newarr[0] = array[len - 1];
        newarr[1] = array[len - 2];

        return newarr;
    }

    public static void main(String[] args) {
        int array[] = { 4, 7, 5, 2, 1 };
        int arr[] = BestTwoScores.findTopTwoScores(array);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * import java.util.Arrays;
 * import java.util.Collections;
 * public class Exercise {
 * public static int[] findTopTwoScores(int[] array) {
 * int firstHighest = Integer.MIN_VALUE;
 * int secondHighest = Integer.MIN_VALUE;
 * 
 * for (int score : array) {
 * if (score > firstHighest) {
 * secondHighest = firstHighest;
 * firstHighest = score;
 * } else if (score > secondHighest && score < firstHighest) {
 * secondHighest = score;
 * }
 * }
 * 
 * return new int[]{firstHighest, secondHighest};
 * }
 * }
 */