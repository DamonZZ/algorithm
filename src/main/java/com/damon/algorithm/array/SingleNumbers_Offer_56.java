package com.damon.algorithm.array;

public class SingleNumbers_Offer_56 {

    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }

        int div = 1;
        while ((div & res) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((div & num) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

    public int singleNumbers2(int[] nums) {
        int res = 0, m = 3;
        int[] counts = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < counts.length; j++) {
                counts[j] += nums[i] & 1;
                nums[i] >>>= 1;
            }
        }
        for (int i = 0; i < counts.length; i++) {
            res <<= 1;
            res |= counts[31 - i] % m;
        }
        return res;
    }

}
