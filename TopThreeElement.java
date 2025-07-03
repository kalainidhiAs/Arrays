package Array;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopThreeElement {
    public static void topthree(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int i : map.keySet()) {
            queue.add(i);
        }
        System.out.println(queue);

        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3 };
        int n = arr.length;
        topthree(arr, n);
    }
}
