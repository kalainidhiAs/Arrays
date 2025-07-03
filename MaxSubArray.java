package Array;

import java.util.*;;

public class MaxSubArray {
    static ArrayList<Integer> findSubarray(int n, int a[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0, max = -1, sum = 0, maxLen = 0, start = -1, end = -1;
        for (i = 0; i < n; i++) {
            if (a[i] >= 0) {
                sum += a[i];
                if (sum > max) {
                    max = sum;
                    maxLen = i - j + 1;
                    start = j;
                    end = i;
                } else if (sum == max) {
                    if (i - j + 1 > maxLen) {
                        start = j;
                        end = i;
                    }
                }
            } else {
                j = i;
                j++;
                sum = 0;
            }
        }

        for (int k = start; k <= end; k++) {
            list.add(a[k]);
        }
        return list;
    }

    public static void main(String[] args) {
        int a[] = { 2, -1, 1, 1 };
        int n = a.length;
        System.out.println(findSubarray(n, a));
    }
}
