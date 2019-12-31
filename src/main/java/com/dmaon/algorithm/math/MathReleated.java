package com.dmaon.algorithm.math;

import java.util.HashMap;
import java.util.Map;

public class MathReleated {

    public int getUglyNumber(int index) {
        if (index < 7) {
            return index;
        }

        int p2 = 0, p3 = 0, p5 = 0, newNum = 1;
        int[] res = new int[index];
        res[0] = newNum;

        for (int i = 1; i < index; i++) {
            newNum = Math.min(res[p2] * 2, Math.min(res[p3] * 3, res[p5] * 5));
            if (newNum == res[p2] * 2) p2++;
            if (newNum == res[p3] * 3) p3++;
            if (newNum == res[p5] * 5) p5++;
            res[i] = newNum;
        }
        return newNum;
    }

    public int firstNotRepeatingChar(String str) {
        if (str == null || str.length() < 1) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                int time = map.get(key);
                map.put(key, ++time);
            } else {
                map.put(key, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.get(key) == 1) {
                return i;
            }
        }
        return -1;
    }

    public int inversePairs(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = this.inverseParisInternal(array, copy, 0, array.length - 1) % 1000000007;
        return count;
    }

    private int inverseParisInternal(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            return 0;
        }

        int mid = (start + end) >> 1;
        int leftCount = this.inverseParisInternal(array, copy, start, mid);
        int rightCount = this.inverseParisInternal(array, copy, mid + 1, end);

//        System.out.println("Start=" + start + ", End=" + end + ", Mid=" + mid + ", LeftCount=" + leftCount + ", RightCount=" + rightCount);

        int i = mid;
        int j = end;
        int count = 0;
        int copyIndex = end;
        while (i >= start && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[copyIndex--] = array[i--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                copy[copyIndex--] = array[j--];
            }
        }
        for (; i >= start; i--) {
            copy[copyIndex--] = array[i];
        }
        for (; j > mid; j--) {
            copy[copyIndex--] = array[j];
        }
        for (int t = start; t <= end; t++) {
            array[t] = copy[t];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }

}
