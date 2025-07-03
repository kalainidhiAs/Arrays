package Array;

import java.util.*;

public class RottenOrrange {
    final static int DIR[][] = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0; // Count of fresh oranges
        Queue<int[]> queue = new LinkedList<>(); // Queue for BFS

        // Step 1: Initialize the queue with all rotten oranges and count fresh oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[] { i, j }); // Add rotten orange to the queue
                } else if (grid[i][j] == 1) {
                    fresh++; // Count fresh oranges
                }
            }
        }

        // If there are no fresh oranges, return 0 (all are already rotten)
        if (fresh == 0)
            return 0;

        int minutes = 0;

        // Step 2: Perform BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false; // Track if any orange rots during this minute

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for (int[] direction : DIR) {
                    int newX = x + direction[0];
                    int newY = y + direction[1];

                    // Check if the new cell is within bounds and contains a fresh orange
                    if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; // Rot the fresh orange
                        queue.add(new int[] { newX, newY }); // Add newly rotten orange to the queue
                        fresh--; // Decrease fresh orange count
                        rotted = true; // Mark that at least one orange rotted
                    }
                }
            }

            // Increment time only if any orange rotted in this minute
            if (rotted)
                minutes++;
        }

        // Step 3: Check if there are still fresh oranges left
        return fresh == 0 ? minutes : -1; // If no fresh oranges, return time; otherwise, return -1
    }

    public static void main(String[] args) {
        int gird[][] = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        System.out.println(new RottenOrrange().orangesRotting(gird));
    }
}
