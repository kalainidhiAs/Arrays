package Array;

import java.util.*;

public class SeggeregateSort {
    public static void sort(int arr[]) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for (int i : arr) {
            if (i < 0) {
                neg.add(i);
            } else {
                pos.add(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (pos.size() != 0) {
                arr[i] = pos.poll();
            } else if (neg.size() != 0) {
                arr[i] = neg.poll();
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };// 1 3 2 11 6 -1 -7 - 5
        sort(arr);
    }
}
