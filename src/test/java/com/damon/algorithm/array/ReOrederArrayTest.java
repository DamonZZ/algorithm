package com.damon.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ReOrederArrayTest {

    private ReOrederArray reOrederArray;

    @Before
    public void before() {
        this.reOrederArray = new ReOrederArray();
    }

    @After
    public void after() {
        this.reOrederArray = null;
    }

    @Test
    public void reOrderTest() {
        int[] testArray = null;
        int[] expected = null;
        int[] result = this.reOrederArray.reOrder(testArray);

        Assert.assertEquals(expected, result);

        testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        expected = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        result = this.reOrederArray.reOrder(testArray);

        Assert.assertTrue(Arrays.equals(result, expected));

    }

}
