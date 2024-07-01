package com.damon.algorithm.pointer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MoveZeroes_Hot100_283_Test {


    private MoveZeroes_Hot100_283 moveZeroes;

    private int[] testArray;

    @Before
    public void before() {
        this.moveZeroes = new MoveZeroes_Hot100_283();
        this.testArray = new int[]{0, 1, 0, 3, 12};
    }

    @Test
    public void groupAnagramsTest() {
        this.moveZeroes.moveZeroes(this.testArray);
        Assert.assertEquals(0, this.testArray[testArray.length - 1]);
    }
}
