package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class LetterCombinations_LeetCode_Hot100_17_Test {

    private LetterCombinations_LeetCode_Hot100_17 letterCombinations;

    @Before
    public void before() {
        this.letterCombinations = new LetterCombinations_LeetCode_Hot100_17();
    }

    @Test
    public void letterCombinationsTest() {
        String digits = "23";
        List<String> actual = this.letterCombinations.letterCombinations(digits);
        int expected = 9;
        Assert.assertEquals(expected, actual.size());
    }

}
