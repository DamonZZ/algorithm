package com.damon.algorithm.integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_LeetCode_Hot100_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> sums = new ArrayList<>();
        if (nums == null || nums.length < 4) return sums;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if ((long) nums[i] + nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1] < target)
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if ((long) nums[i] + nums[j] + nums[nums.length - 2] + nums[nums.length - 1] < target)
                    continue;

                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        sums.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return sums;
    }

}
