package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class UniquePaths_Hot100_62_Test {

    private UniquePaths_Hot100_62 uniquePaths_hot100_62 = new UniquePaths_Hot100_62();

    @Test
    public void uniquePathsTest() {
        int ans = this.uniquePaths_hot100_62.uniquePaths(3, 7);
        Assert.assertEquals(28, ans);
    }

}
