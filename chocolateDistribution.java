package Array;

import java.util.ArrayList;
import java.util.Collections;

public class chocolateDistribution {
    public static int findMinDiff(ArrayList<Integer> a, int n, int m) {

        if (m > n) {
            return -1;
        }

        Collections.sort(a);
        System.out.println(a);

        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int currentDifference = a.get(i + m - 1) - a.get(i);
            System.out.println(a.get(i + m - 1));
            minDifference = Math.min(currentDifference, minDifference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        ArrayList<Integer> chocolatePackets = new ArrayList<>();
        chocolatePackets.add(7);
        chocolatePackets.add(3);
        chocolatePackets.add(2);
        chocolatePackets.add(4);
        chocolatePackets.add(9);
        chocolatePackets.add(12);
        chocolatePackets.add(56);

        int n = chocolatePackets.size();
        int m = 3; // Number of students

        int minDifference = findMinDiff(chocolatePackets, n, m);

        System.out.println("Minimum difference: " + minDifference);
    }
}
