package com.damon.algorithm.graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrangesRotting_Hot100_994 {

    public int orangesRotting(int[][] grid) {
        int freshNum = 0;
        Deque<int[]> queue = new ArrayDeque();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    freshNum++;
                if (grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
            }
        }

        int minutes = 0;
        while (!queue.isEmpty()) {
            if (freshNum == 0)
                return minutes;
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rot = queue.pop();
                int row = rot[0];
                int column = rot[1];
                freshNum -= roting(grid, row - 1, column, queue);
                freshNum -= roting(grid, row + 1, column, queue);
                freshNum -= roting(grid, row, column - 1, queue);
                freshNum -= roting(grid, row, column + 1, queue);
            }
        }
        return freshNum > 0 ? -1 : minutes;
    }

    private int roting(int[][] grid, int row, int column, Deque<int[]> queue) {
        if (row < 0 || column < 0 || row > grid.length - 1 || column > grid[0].length - 1 || grid[row][column] != 1)
            return 0;
        grid[row][column] = 2;
        queue.offer(new int[]{row, column});
        return 1;
    }

}
