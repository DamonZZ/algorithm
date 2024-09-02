package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DailyTemperatures_Hot100_739_Test {

    private DailyTemperatures_Hot100_739 dailyTemperatures_hot100_739;

    @Before
    public void before() {
        this.dailyTemperatures_hot100_739 = new DailyTemperatures_Hot100_739();
    }


    @Test
    public void dailyTemperaturesTest() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = this.dailyTemperatures_hot100_739.dailyTemperatures(temperatures);
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], ans[i]);
        }
    }


}
