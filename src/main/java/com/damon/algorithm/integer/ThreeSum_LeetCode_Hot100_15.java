package com.damon.algorithm.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_LeetCode_Hot100_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) return result;
        int length = nums.length;
        Arrays.sort(nums);
        for (int first = 0; first < length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) continue;
            int target = -nums[first];
            int third = length - 1;
            for (int second = first + 1; second < length; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) continue;
                while (second < third && nums[second] + nums[third] > target) third--;
                if (second == third) break;
                if (nums[second] + nums[third] == target)
                    result.add(Arrays.asList(nums[first], nums[second], nums[third]));
            }
        }
        return result;
    }

}
