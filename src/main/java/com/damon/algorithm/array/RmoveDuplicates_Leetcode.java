package com.damon.algorithm.array;

public class RmoveDuplicates_Leetcode {


    public static void main(String[] args) {

        int[] test1 = new int[]{1, 1, 2};
        int[] test2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("result = " + removeDuplicates(test1) + "");
        System.out.println("result = " + removeDuplicates(test2) + "");
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
