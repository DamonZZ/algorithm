package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Exist_Hot100_79_Test {

    private Exist_Hot100_79 exist_Hot100_79;

    @Before
    public void before() {
        this.exist_Hot100_79 = new Exist_Hot100_79();
    }

    @Test
    public void existTest() {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

        boolean ans = this.exist_Hot100_79.exist(board, "ABCCED");

        Assert.assertEquals(true, ans);
    }

}
