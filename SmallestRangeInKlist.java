package Array;

import java.util.*;

class Node {
    int data;
    int row;
    int col;

    public Node(int data, int i, int j) {
        this.data = data;
        this.row = i;
        this.col = j;
    }
}

public class SmallestRangeInKlist {
    static int[] findSmallestRange(int[][] KSortedArray, int n, int k) {
        // add your code here
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            Node temp = new Node(KSortedArray[i][0], i, 0);
            mini = Math.min(mini, temp.data);
            maxi = Math.max(maxi, temp.data);
            queue.add(temp);
        }

        int start = mini, end = maxi;
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.data + " " + temp.row + " " + temp.col);
            mini = temp.data;
            int row = temp.row;
            int col = temp.col;
            if (maxi - mini < end - start) {
                start = mini;
                end = maxi;
            }
            if (col + 1 < n) {
                Node next = new Node(KSortedArray[row][col + 1], row, col + 1);
                maxi = Math.max(maxi, KSortedArray[row][col + 1]);
                queue.add(next);
            } else {
                break;
            }
        }

        return new int[] { start, end };
    }

    public static void main(String[] args) {
        int N = 5; // length of the row
        int K = 3; // column
        int KSortedArray[][] = { { 1, 3, 5, 7, 9 },
                { 0, 2, 4, 6, 8 },
                { 2, 3, 5, 7, 11 } };
        System.out.println(Arrays.toString(findSmallestRange(KSortedArray, N, K)));

        N = 4;
        K = 3;
        int SortedArray[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        System.out.println(Arrays.toString(findSmallestRange(SortedArray, N, K)));
    }
}
