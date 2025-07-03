package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Merge_intervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparing(i -> i[0]));

        ArrayList<int[]> result = new ArrayList<>();
        int[] newIntervel = intervals[0];
        result.add(newIntervel);

        for (int[] interval : intervals) {
            if (interval[0] <= newIntervel[1]) {
                newIntervel[1] = Math.max(newIntervel[1], interval[1]);
            } else {
                newIntervel = interval;
                result.add(newIntervel);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int intervels[][] = { { 1, 3 }, { 8, 10 }, { 15, 18 }, { 2, 6 } };
        System.out.println(Arrays.deepToString(merge(intervels)));
    }
}
