package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_Hot100_139_Test {

    private WordBreak_Hot100_139 wordBreak_hot100_139 = new WordBreak_Hot100_139();

    @Test
    public void wordBreakTest() {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        boolean ans = this.wordBreak_hot100_139.wordBreak("leetcode", list);
        Assert.assertEquals(true, ans);
    }

}
