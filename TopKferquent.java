package Array;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKferquent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int i : map.keySet()) {
            queue.add(i);
        }

        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(new TopKferquent().topKFrequent(arr, k));
    }
}
