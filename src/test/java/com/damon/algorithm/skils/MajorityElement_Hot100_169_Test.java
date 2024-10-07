package com.damon.algorithm.skils;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement_Hot100_169_Test {


    private MajorityElement_Hot100_169 majorityElement_hot100_169 = new MajorityElement_Hot100_169();


    @Test
    public void majorityElementTest() {
        int[] nums = new int[]{3, 2, 3};
        int ans = this.majorityElement_hot100_169.majorityElement(nums);
        Assert.assertEquals(3, ans);
    }


}
