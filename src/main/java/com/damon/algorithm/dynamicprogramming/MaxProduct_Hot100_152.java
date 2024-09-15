package com.damon.algorithm.dynamicprogramming;

public class MaxProduct_Hot100_152 {

    public int maxProduct(int[] nums) {
        long maxF = nums[0], minF = nums[0];
        int ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            long mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            if (minF < (Integer.MIN_VALUE)) {
                minF = nums[i];
            }
            ans = Math.max((int) maxF, ans);
        }
        return ans;
    }

}
