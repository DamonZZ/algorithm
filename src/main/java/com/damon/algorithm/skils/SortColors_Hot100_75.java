package com.damon.algorithm.skils;

public class SortColors_Hot100_75 {

    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        for (int i = 0; i <= p2; i++) {
            while (i <= p2 && nums[i] == 2) {
                if (nums[p2] != 2) {
                    int temp = nums[i];
                    nums[i] = nums[p2];
                    nums[p2] = temp;
                }
                p2--;
            }

            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                p0++;
            }
        }
    }

}
