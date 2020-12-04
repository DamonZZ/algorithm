package com.damon.algorithm.integer;

import java.util.ArrayList;
import java.util.List;

public class TwoSum_Offer_57 {

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int s = nums[i] + nums[j];
            if (s < target) i++;
            else if (s > target) j--;
            else return new int[]{nums[i], nums[j]};
        }
        return new int[]{0};
    }

    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

}
