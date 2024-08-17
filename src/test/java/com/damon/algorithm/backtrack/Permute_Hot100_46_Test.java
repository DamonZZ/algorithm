package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Permute_Hot100_46_Test {

    private Permute_Hot100_46 permute_hot100_46;

    @Before
    public void before() {
        this.permute_hot100_46 = new Permute_Hot100_46();
    }

    @Test
    public void insertSearchTest() {

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans= this.permute_hot100_46.permute(nums);

        Assert.assertEquals(6, ans.size());
    }
}
