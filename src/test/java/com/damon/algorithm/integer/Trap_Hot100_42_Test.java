package com.damon.algorithm.integer;

import com.damon.algorithm.pointer.Trap_Hot100_42;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Trap_Hot100_42_Test {

    private Trap_Hot100_42 trap_hot100_42;

    @Before
    public void before() {
        this.trap_hot100_42 = new Trap_Hot100_42();
    }

    @Test
    public void translateNumTest() {
        int result = this.trap_hot100_42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        Assert.assertEquals(6, result);
    }


}
