package Array;

import java.util.*;

public class NextGreaterEvenNumber {
    public static long getNextEven(String x) {
        // Your code goes here
        while (true) {

            int idx = -1;

            for (int i = 1; i < x.length(); i++) {
                if (x.charAt(i) > x.charAt(i - 1)) {// 34722641
                    idx = i;
                }
            }

            // System.out.println(idx);

            if (idx == -1) {
                return (long) -1;
            }

            int index = idx;

            for (int i = idx; i < x.length(); i++) {// 34722641
                System.out.println(i + " " + idx);
                if (x.charAt(i) > x.charAt(idx - 1) && x.charAt(i) < x.charAt(idx)) {
                    index = i;
                }
            }

            System.out.println(index);

            char[] arr = x.toCharArray();

            char temp = arr[idx - 1];
            arr[idx - 1] = arr[index];
            arr[index] = temp;

            Arrays.sort(arr, idx, x.length());

            x = String.valueOf(arr);

            if ((x.charAt(x.length() - 1) - '0') % 2 == 0) {
                return Long.valueOf(x);
            }
        }
    }

    public static void main(String[] args) {
        String X = "34722641";
        System.out.println(getNextEven(X));
    }
}
