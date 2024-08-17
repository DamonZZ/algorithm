package com.damon.algorithm.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Trie_Hot100_208_Test {

    private Trie_Hot100_208 trie_hot100_208;

    @Before
    public void before() {
        this.trie_hot100_208 = new Trie_Hot100_208();
    }

    @Test
    public void insertSearchTest() {

        this.trie_hot100_208.insert("apple");

        Assert.assertEquals(true, this.trie_hot100_208.search("apple"));
        Assert.assertEquals(false, this.trie_hot100_208.search("app"));
        Assert.assertEquals(true, this.trie_hot100_208.startsWith("app"));
    }


}
