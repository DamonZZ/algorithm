package com.damon.algorithm.array;

public class MinSubArray_LeetCode_209 {

    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0 || s <= 0) return 0;
        int start = 0, end = 0, sum = 0, result = Integer.MAX_VALUE;
        int n = nums.length;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
