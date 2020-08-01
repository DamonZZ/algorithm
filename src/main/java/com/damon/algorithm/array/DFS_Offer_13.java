package com.damon.algorithm.array;

public class DFS_Offer_13 {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfsCount(m, n, 0, 0, 0, 0, k, visited);
    }

    private int dfsCount(int m, int n, int i, int j, int si, int sj, int k, boolean[][] visited) {
        if (i >= m || j >= n || visited[i][j] || (this.getSum(i) + this.getSum(j)) > k) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfsCount(m, n, i + 1, j, this.getSum(i), this.getSum(j), k, visited) + dfsCount(m, n, i, j + 1, this.getSum(i), this.getSum(j), k, visited);
    }

    private int getSum(int a) {
        int sum = a % 10;
        int tmp = a / 10;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return sum;
    }

}
