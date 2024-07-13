package com.damon.algorithm.matrix;

public class SpiralOrder_Offer_29_Hot100_54 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1;
        int top = 0, bottom = rows - 1;

        int[] result = new int[rows * columns];
        int index = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            for (int j = top + 1; j <= bottom; j++) {
                result[index++] = matrix[j][right];
            }

            if (left < right && top < bottom) {
                for (int k = right - 1; k > left; k--) {
                    result[index++] = matrix[bottom][k];
                }
                for (int v = bottom; v > top; v--) {
                    result[index++] = matrix[v][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return result;
    }

}
