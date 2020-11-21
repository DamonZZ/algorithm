package com.damon.algorithm.array;

public class Integer_Search_Offer_53 {

    public int search(int[] nums, int target) {
        return this.searchDichotomy(nums, target) - this.searchDichotomy(nums, target - 1);
    }

    private int searchDichotomy(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= target) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }

}
