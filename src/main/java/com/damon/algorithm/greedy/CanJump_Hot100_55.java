package com.damon.algorithm.greedy;

public class CanJump_Hot100_55 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightMost = 0;
        for (int i = 0; i < n; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(i + nums[i], rightMost);
                if (rightMost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
