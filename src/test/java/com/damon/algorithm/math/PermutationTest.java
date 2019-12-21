package com.damon.algorithm.math;

import com.dmaon.algorithm.math.Permutation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PermutationTest {

    private Permutation permutation;

    @Before
    public void before() {
        this.permutation = new Permutation();
    }

    @After
    public void after() {
        this.permutation = null;
    }

    @Test
    public void stringPermutationTest() {
        String test = "abcd";
        int expected = 24;
        ArrayList<String> result = this.permutation.stringPermutation(test);

        Assert.assertEquals(expected, result.size());
    }

}
