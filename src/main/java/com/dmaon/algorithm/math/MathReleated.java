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
        return 0;
    }

}
