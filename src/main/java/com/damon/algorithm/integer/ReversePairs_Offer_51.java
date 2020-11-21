package com.damon.algorithm.integer;

import java.util.Arrays;

public class ReversePairs_Offer_51 {

    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 0) return 0;
        int[] copy = Arrays.copyOf(nums, len);
        return this.reversePairs(nums, 0, len - 1, copy);
    }

    private int reversePairs(int[] nums, int left, int right, int[] tmp) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2;
        int leftCount = this.reversePairs(nums, left, mid, tmp);
        int rightCount = this.reversePairs(nums, mid + 1, right, tmp);

        if (nums[mid] <= nums[mid + 1]) return leftCount + rightCount;
        int crossCount = this.mergeCount(nums, left, mid, right, tmp);
        return leftCount + rightCount + crossCount;
    }

    private int mergeCount(int[] nums, int left, int mid, int right, int[] tmp) {
        for (int i = left; i <= right; i++) {
            tmp[i] = nums[i];
        }

        int i = left, j = mid + 1, count = 0;
        for (int k = left; k <= right; k++) {
            if (i == mid + 1) {
                nums[k] = tmp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = tmp[i];
                i++;
            } else if (tmp[i] <= tmp[j]) {
                nums[k] = tmp[i];
                i++;
            } else {
                nums[k] = tmp[j];
                count += mid - i + 1;
                j++;
            }
        }
        return count;
    }

}
