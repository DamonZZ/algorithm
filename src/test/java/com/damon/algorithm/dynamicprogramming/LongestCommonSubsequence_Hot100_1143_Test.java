package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubsequence_Hot100_1143_Test {

    private LongestCommonSubsequence_Hot100_1143 longestCommonSubsequence_hot100_1143 = new LongestCommonSubsequence_Hot100_1143();

    @Test
    public void longestCommonSubsequenceTest() {
        int ans = this.longestCommonSubsequence_hot100_1143.longestCommonSubsequence("abcde","ace");
        Assert.assertEquals(3, ans);
    }
}
