package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        int mergeIntervals[][] = new int[intervals.length + 1][];
        mergeIntervals[0] = newInterval;

        for (int i = 1; i < intervals.length + 1; i++) {
            mergeIntervals[i] = intervals[i - 1];
        }

        // System.out.println(Arrays.deepToString(mergeIntervals));

        Arrays.sort(mergeIntervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        int cur[] = intervals[0];
        list.add(cur);

        for (int interval[] : mergeIntervals) {
            if (interval[0] <= cur[1]) {
                cur[1] = Math.max(cur[1], interval[1]);
            } else {
                cur = interval;
                list.add(interval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 6, 9 } };
        int newInterval[] = { 2, 5 };
        int res[][] = insert(intervals, newInterval);
        System.out.println(Arrays.deepToString(res));
    }
}
