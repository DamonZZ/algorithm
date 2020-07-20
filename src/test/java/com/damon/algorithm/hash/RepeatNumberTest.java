package com.damon.algorithm.hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RepeatNumberTest {

    private RepeatNumber repeatNumber;

    private int[] testArray;

    @Before
    public void before() {
        this.repeatNumber = new RepeatNumber();
        this.testArray = new int[]{2, 3, 3, 4, 5};
    }

    @Test
    public void findRepeatNumberTest() {
        int result = this.repeatNumber.findRepeatNumber(this.testArray);
        Assert.assertEquals(3, result);
    }
}
