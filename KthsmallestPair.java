package Array;

import java.util.*;

public class KthsmallestPair {
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        for (int i = 0; i < nums1.length && i < k; i++) {
            heap.add(new int[] { nums1[i], nums2[0], 0 });
        }

        while (k-- > 0 && !heap.isEmpty()) {
            int cur[] = heap.poll();
            List<Integer> pair = new ArrayList<>();
            pair.add(cur[0]);
            pair.add(cur[1]);
            list.add(pair);

            int nums2Index = cur[2];
            if (nums2Index + 1 < nums2.length) {
                heap.add(new int[] { cur[0], nums2[nums2Index + 1], nums2Index + 1 });
            }

        }

        return list;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 7, 11 };
        int[] nums2 = { 2, 4, 6 };
        int k = 3;
        List<List<Integer>> list = kSmallestPairs(nums1, nums2, k);
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }
}
