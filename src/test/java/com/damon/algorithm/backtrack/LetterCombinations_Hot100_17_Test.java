package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class LetterCombinations_Hot100_17_Test {

    private LetterCombinations_Hot100_17 letterCombinations_hot100_17;

    @Before
    public void before() {
        this.letterCombinations_hot100_17 = new LetterCombinations_Hot100_17();
    }

    @Test
    public void letterCombinationsTest() {

        List<String> ans= this.letterCombinations_hot100_17.letterCombinations("23");

        Assert.assertEquals(9, ans.size());
    }

}
