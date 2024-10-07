package com.damon.algorithm.skils;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber_Hot100_136_Test {

    private SingleNumber_Hot100_136 singleNumber_hot100_136 = new SingleNumber_Hot100_136();


    @Test
    public void singleNumberTest() {
        int[] nums = new int[]{2, 2, 1};
        int ans = this.singleNumber_hot100_136.singleNumber(nums);
        Assert.assertEquals(1, ans);
    }


}
