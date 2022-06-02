package com.damon.algorithm.string;

import com.damon.algorithm.integer.MaxArea_LeetCOde_Hot100_11;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxArea_LeetCOde_Hot100_11_Test {

    private MaxArea_LeetCOde_Hot100_11 maxArea;

    @Before
    public void before() {
        this.maxArea = new MaxArea_LeetCOde_Hot100_11();
    }

    @Test
    public void maxAreaTest() {

        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int result = this.maxArea.maxArea(height);

        Assert.assertEquals(expected, result);
    }

}
