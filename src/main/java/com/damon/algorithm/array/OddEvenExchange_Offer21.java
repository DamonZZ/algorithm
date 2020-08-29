package com.damon.algorithm.array;

public class OddEvenExchange_Offer21 {


    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && (nums[left] & 1) != 0) {
                left++;
            }
            while (left < right && (nums[right] & 1) != 1) {
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

}
