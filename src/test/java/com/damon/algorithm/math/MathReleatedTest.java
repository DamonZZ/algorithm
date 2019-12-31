package com.damon.algorithm.math;

import com.dmaon.algorithm.math.MathReleated;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathReleatedTest {
    private MathReleated mathReleated;

    @Before
    public void before() {
        this.mathReleated = new MathReleated();
    }

    @After
    public void after() {
        this.mathReleated = null;
    }


    @Test
    public void getUglyNumberTest() {
        int indexTest = 100;
        int expected = 1536;
        int result = this.mathReleated.getUglyNumber(indexTest);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstNotRepeatingCharTest() {
        String strTest = "google";
        int expected = 4;
        int result = this.mathReleated.firstNotRepeatingChar(strTest);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void inversePairs() {
        int[] testArray = new int[]{7, 5, 6, 4};
        int expected = 5;
        int result = this.mathReleated.inversePairs(testArray);
        Assert.assertEquals(expected, result);
    }
}
