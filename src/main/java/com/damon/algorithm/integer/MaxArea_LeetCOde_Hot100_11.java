package com.damon.algorithm.integer;

public class MaxArea_LeetCOde_Hot100_11 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;

        while (i < j) {
            int tmpHeight = height[i] <= height[j] ? height[i] : height[j];
            if (tmpHeight * (j - i) > area) area = tmpHeight * (j - i);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }

}
