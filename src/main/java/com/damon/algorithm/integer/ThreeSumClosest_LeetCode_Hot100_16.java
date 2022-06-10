package com.damon.algorithm.integer;

import java.util.Arrays;

public class ThreeSumClosest_LeetCode_Hot100_16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        int closest = 10000000;
        for (int i = 0; i < length; i++) {
            int j = i + 1;
            int k = length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;

                if (sum > target) {
                    int k0 = k - 1;
                    while (j < k0 && nums[k] == nums[k0]) k0--;
                    k = k0;
                } else {
                    int j0 = j + 1;
                    while (j0 < k && nums[j] == nums[j0]) j0++;
                    j = j0;
                }
            }
        }
        return closest;
    }
}
