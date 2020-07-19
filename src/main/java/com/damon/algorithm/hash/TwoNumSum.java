package com.damon.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Illegal input nums");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
