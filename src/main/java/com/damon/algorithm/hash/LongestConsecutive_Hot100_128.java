package com.damon.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive_Hot100_128 {

    public int longestConsecutive(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();
        for (int num : nums) {
            nums_set.add(num);
        }

        int longestConsecutive = 0;

        for (int num : nums) {
            if (!nums_set.contains(num - 1)) {
                int currentNum = num;
                int currentConsecutive = 1;
                while (nums_set.contains(currentNum + 1)) {
                    currentConsecutive++;
                    currentNum++;
                }

                longestConsecutive = Math.max(currentConsecutive,longestConsecutive);
            }
        }

        return longestConsecutive;
    }

}
