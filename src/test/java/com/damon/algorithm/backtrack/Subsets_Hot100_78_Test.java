package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Subsets_Hot100_78_Test {


    private Subsets_Hot100_78 subsets_hot100_78;

    @Before
    public void before() {
        this.subsets_hot100_78 = new Subsets_Hot100_78();
    }

    @Test
    public void subsetsTest() {

        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans= this.subsets_hot100_78.subsets(nums);

        Assert.assertEquals(8, ans.size());
    }

}
