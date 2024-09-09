package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Generate_Hot100_118_Test {

    private Generate_Hot100_118 generate_hot100_118 = new Generate_Hot100_118();

    @Test
    public void generateTest() {
        List<List<Integer>> ans = this.generate_hot100_118.generate(5);
        Assert.assertEquals(5, ans.size());
    }

}
