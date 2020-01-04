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

    public String printMinNumber(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return "";
        }
        String[] stringArray = new String[numbers.length];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            stringArray[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 + o2;
                String c2 = o2 + o1;
                return c1.compareTo(c2);
            }
        });
        for (int i = 0; i < stringArray.length; i++) {
            builder.append(stringArray[i]);
        }
        return builder.toString();
    }

    public int getNumberOfK(int[] array, int k) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int firtstIndex = this.getFirstK(array, k, 0, array.length - 1);
        int lastIndex = this.getLastK(array, k, 0, array.length - 1);
        if (firtstIndex != -1 && lastIndex != -1) {
            return lastIndex - firtstIndex + 1;
        }
        return 0;
    }

    private int getFirstK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) >> 1;
        int midddledata = array[middle];
        if (k == midddledata) {
            if ((middle > 0 && array[middle - 1] != k) || middle == 0) {
                return middle;
            } else {
                end = middle - 1;
            }
        } else if (midddledata > k) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return this.getFirstK(array, k, start, end);
    }

    private int getLastK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) >> 1;
        int midddledata = array[middle];
        if (k == midddledata) {
            if ((middle < end && array[middle + 1] != k) || middle == end) {
                return middle;
            } else {
                start = middle + 1;
            }
        } else if (midddledata > k) {
            end = middle - 1;
        } else {
            start = middle + 1;
        }
        return this.getLastK(array, k, start, end);
    }

    // #56
    public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 1 || num1 == null || num2 == null) {
            return;
        }

        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }

        int bitResult = 0;
        for (int i = 0; i < length; i++) {
            bitResult ^= array[i];
        }

        int index = this.findFirst1(bitResult);
        for (int i = 0; i < length; i++) {
            if (this.isBit1(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }

    private int findFirst1(int bit) {
        int index = 0;
        while ((bit & 1) == 0 && index < 32) {
            bit = bit >> 1;
            index++;
        }
        return index;
    }

    private boolean isBit1(int target, int index) {
        return ((target >> index) & 1) == 1;
    }

    // #57 - 2
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int pLow = 1;
        int pHigh = 2;
        while (pHigh > pLow) {
            int tempSum = (pLow + pHigh) * (pHigh - pLow + 1) / 2;
            if (tempSum == sum) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = pLow; i <= pHigh; i++) {
                    arrayList.add(i);
                }
                result.add(arrayList);
                pLow++;
            } else if (tempSum > sum) {
                pLow++;
            } else {
                pHigh++;
            }
        }
        return result;
    }

    // #57 - 1
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array == null || array.length < 1) {
            return result;
        }
        int pLow = 0;
        int pHigh = array.length - 1;
        while (pLow < pHigh) {
            int tempSum = array[pLow] + array[pHigh];
            if (tempSum == sum) {
                result.add(array[pLow]);
                result.add(array[pHigh]);
                return result;
            } else if (tempSum > sum) {
                pHigh--;
            } else {
                pLow++;
            }
        }
        return result;
    }

    // #61
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length < 5) {
            return false;
        }
        int[] numberCount = new int[14];
        int max = -1;
        int min = 14;
        for (int i = 0; i < numbers.length; i++) {
            numberCount[numbers[i]]++;
            if (numbers[i] <= 0) {
                continue;
            }
            if (numberCount[numbers[i]] > 1) {
                return false;
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        if (max - min < 5) {
            return true;
        }
        return false;
    }

    // #3
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }

    //
    public int[] multiply(int[] A) {
        if (A == null || A.length < 1) {
            return null;
        }
        int length = A.length;
        int[] b = new int[length];
        b[0] = 1;
        for (int i = 1; i < length; i++) {
            b[i] = b[i - 1] * A[i - 1];
        }

        int temp = 1;
        for (int j = length - 2; j >= 0; j--) {
            temp *= A[j + 1];
            b[j] *= temp;
        }
        return b;
    }
}
