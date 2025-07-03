package Array;

import java.util.*;

public class LRU {
    public static void pageFault(int capacity, int arr[]) {
        Queue<Integer> queue = new LinkedList<>();

        int page_fault_count = 0;
        for (int i : arr) {
            if (!queue.contains(i) && queue.size() < capacity) {
                queue.add(i);
                page_fault_count++;
            } else if (!queue.contains(i) && queue.size() == capacity) {
                queue.remove();
                queue.add(i);
                page_fault_count++;
            } else if (queue.contains(i)) {
                queue.remove(i);
                queue.add(i);
            }
        }

        System.out.println(page_fault_count);
    }

    public static void main(String[] args) {
        int capacity = 4;
        int arr[] = { 5, 0, 1, 3, 2, 4, 1, 0, 5 };
        pageFault(capacity, arr);
    }
}
