package Array;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int res[] = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[] { nums[i], i });

            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            if (i >= k - 1) {
                res[i - k + 1] = maxHeap.peek()[0];
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        // System.out.println(System.nanoTime());
        maxSlidingWindow(arr, k);
    }
}
