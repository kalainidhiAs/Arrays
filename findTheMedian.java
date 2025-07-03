package Array;

import java.util.Arrays;

public class findTheMedian {
    public int find_median(int[] v) {
        int i, j, mid;
        for (i = 0; i < v.length - 1; i++) {
            for (j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(v));

        if (v.length % 2 != 0) {
            return v[v.length / 2];
        } else {
            int mid1 = (v.length / 2) - 1;
            int mid2 = (v.length / 2);

            mid = (v[mid1] + v[mid2]) / 2;

            return mid;
        }

    }

    public static void main(String[] args) {
        int v[] = { 17, 3, 19, 3, 8, 17, 1, 12, 19, 8 };
        findTheMedian median = new findTheMedian();
        int result = median.find_median(v);
        System.out.println(result);
    }
}
