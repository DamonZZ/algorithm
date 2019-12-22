package com.damon.algorithm.array;

import java.util.*;

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

    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length < 1 || k < 1 || k > input.length) {
            return result;
        }

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (maxQueue.size() != k) {
                maxQueue.offer(input[i]);
            } else {
                int maxTemp = maxQueue.peek();
                if (input[i] < maxTemp) {
                    maxQueue.poll();
                    maxQueue.offer(input[i]);
                }
            }
        }
        Iterator<Integer> iterator = maxQueue.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }

        return result;
    }

    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(array[i], max + array[i]);
            res = Math.max(max, res);
        }
        return res;
    }

    public int numberOf1Between1AndN(int n) {
        if (n < 0) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            result = result + (a + 8) / 10 * i + (a % 10 == 1 ? 1 : 0) * (b + 1);
        }
        return result;
    }
}
