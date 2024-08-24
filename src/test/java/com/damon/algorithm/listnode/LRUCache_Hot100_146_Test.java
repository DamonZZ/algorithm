package com.damon.algorithm.listnode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LRUCache_Hot100_146_Test {

    private LRUCache_Hot100_146 lruCache_hot100_146;

    @Before
    public void before() {
        this.lruCache_hot100_146 = new LRUCache_Hot100_146(4);
    }

    @Test
    public void getTest() {
        this.lruCache_hot100_146.put(1, 1);
        this.lruCache_hot100_146.put(2, 2);
        this.lruCache_hot100_146.put(3, 3);
        this.lruCache_hot100_146.put(4, 4);
        this.lruCache_hot100_146.put(5, 5);


        Assert.assertEquals(-1, this.lruCache_hot100_146.get(1));
    }

}
