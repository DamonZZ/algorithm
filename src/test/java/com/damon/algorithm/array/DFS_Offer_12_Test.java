package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFS_Offer_12_Test {

    private DFS_Offer_12 dfs_offer_12 = new DFS_Offer_12();

    private String testWords = "";

    private char[][] testChar = new char[3][4];

    @Before
    public void before() {
        this.dfs_offer_12 = new DFS_Offer_12();
        char[] chars1 = new char[]{'A', 'B', 'C', 'E'};
        char[] chars2 = new char[]{'S', 'F', 'C', 'S'};
        char[] chars3 = new char[]{'A', 'D', 'E', 'E'};
        this.testChar[0] = chars1;
        this.testChar[1] = chars2;
        this.testChar[2] = chars3;
    }

    @Test
    public void existTest() {
        this.testWords = "ABCCED";
        boolean result = this.dfs_offer_12.exist(this.testChar, this.testWords);
        Assert.assertTrue(result);

        this.testWords = "ABCCEA";
        result = this.dfs_offer_12.exist(this.testChar, this.testWords);
        Assert.assertFalse(result);
    }

}
