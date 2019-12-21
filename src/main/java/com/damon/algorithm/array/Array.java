package com.damon.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public int[] reOrder(int[] array) {

        if (array == null || array.length < 1) {
            return array;
        }

        int[] result = Arrays.copyOf(array, array.length);

        for (int i = 0; i < result.length; i++) {
            if (this.isEven(result[i])) {
                for (int j = i + 1; j < result.length; j++) {
                    if (!this.isEven(result[j])) {
                        int odd = result[j];
                        for (int k = j; k > i; k--) {
                            result[k] = result[k - 1];
                        }
                        result[i] = odd;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private boolean isEven(int input) {
        return (input & 1) == 0 ? true : false;
    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length <= 0) {
            return result;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        int start = 0;

        while ((rows > start * 2) && (columns > start * 2)) {
            int iStart = start;
            int iEnd = rows - start - 1;
            int jStart = start;
            int jEnd = columns - start - 1;
            this.printMatrixClockwise(matrix, iStart, iEnd, jStart, jEnd, result);
            start++;
        }

        return result;
    }

    private void printMatrixClockwise(int[][] matrix, int iStart, int iEnd, int jStart, int jEnd, ArrayList<Integer> arrayList) {

        //top
        for (int j = jStart; j <= jEnd; j++) {
            arrayList.add(matrix[iStart][j]);
        }

        //right
        if (iStart < iEnd) {
            for (int i = iStart + 1; i <= iEnd; i++) {
                arrayList.add(matrix[i][jEnd]);
            }
        }


        //bottom
        if (jStart < jEnd && iStart < iEnd) {
            for (int j = jEnd - 1; j >= jStart; j--) {
                arrayList.add(matrix[iEnd][j]);
            }
        }


        //left
        if (jStart < jEnd && iStart < iEnd) {
            for (int i = iEnd - 1; i > iStart; i--) {
                arrayList.add(matrix[i][iStart]);
            }
        }

    }

    public int moreThanHalfNumber(int[] array) {

        if (array == null || array.length < 1) {
            return 0;
        }

        Arrays.sort(array);
        int count = 0;
        int length = array.length;
        int middle = array.length / 2;
        int num = array[middle];
        for (int i = 0; i < length; i++) {
            if (array[i] == num) {
                count++;
            }
        }

        if (count <= middle) {
            num = 0;
        }

        return num;
    }
}
