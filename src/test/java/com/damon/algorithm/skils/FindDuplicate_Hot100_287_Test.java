package com.damon.algorithm.skils;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicate_Hot100_287_Test {

    private FindDuplicate_Hot100_287 findDuplicate_hot100_287 = new FindDuplicate_Hot100_287();


    @Test
    public void findDuplicateTest() {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int ans = this.findDuplicate_hot100_287.findDuplicate(nums);
        Assert.assertEquals(2, ans);
    }

}
