package com.damon.algorithm.slidingwindow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FindAnagrams_Hot100_438_Test {

    private FindAnagrams_Hot100_438 findAnagrams;

    @Before
    public void before() {
        this.findAnagrams = new FindAnagrams_Hot100_438();
    }

    @Test
    public void findAnagramsTest() {
        List<Integer> ans = this.findAnagrams.findAnagrams("cbaebabacd", "abc");
        Assert.assertEquals(2, ans.size());
    }

}
