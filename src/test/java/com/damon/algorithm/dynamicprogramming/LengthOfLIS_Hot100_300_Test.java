package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLIS_Hot100_300_Test {

    private LengthOfLIS_Hot100_300 lengthOfLIS_hot100_300 = new LengthOfLIS_Hot100_300();

    @Test
    public void lengthOfLISTest() {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int ans = this.lengthOfLIS_hot100_300.lengthOfLIS(nums);
        Assert.assertEquals(4, ans);
    }

}
