package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CombinationSum_Hot100_39_Test {


    private CombinationSum_Hot100_39 combinationSum_hot100_39;

    @Before
    public void before() {
        this.combinationSum_hot100_39 = new CombinationSum_Hot100_39();
    }

    @Test
    public void subsetsTest() {

        int[] nums = new int[]{2,3,6,7};
        List<List<Integer>> ans= this.combinationSum_hot100_39.combinationSum(nums,7);

        Assert.assertEquals(2, ans.size());
    }


}
