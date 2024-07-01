package com.damon.algorithm.hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GroupAnagrams_Hot100_49_Test {


    private GroupAnagrams_Hot100_49 groupAnagrams;

    private String[] testArray;

    @Before
    public void before() {
        this.groupAnagrams = new GroupAnagrams_Hot100_49();
        this.testArray = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
    }

    @Test
    public void groupAnagramsTest() {
        List<List<String>> result = this.groupAnagrams.groupAnagrams(this.testArray);
        Assert.assertEquals(3, result.size());
    }
}
