package com.damon.algorithm.greedy;

public class Jump_Hot100_45 {

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosistion = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosistion = Math.max(i + nums[i], maxPosistion);
            if (i == end) {
                end = maxPosistion;
                steps++;
            }
        }
        return steps;
    }
}
