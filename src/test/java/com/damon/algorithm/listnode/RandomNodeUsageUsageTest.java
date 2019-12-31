package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.RandomListNode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RandomNodeUsageUsageTest {

    private RandomListNodeUsage randomListNodeUsage = null;


    @Before
    public void before() {
        this.randomListNodeUsage = new RandomListNodeUsage();
    }

    @After
    public void after() {
        this.randomListNodeUsage = null;
    }

    @Test
    public void cloneTest() {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);

        node1.next = node2;
        node1.random = node3;
        node2.next = node3;
        node2.random = node5;
        node3.next = node4;
        node4.next = node5;

        RandomListNode result = this.randomListNodeUsage.clone(node1);
        int expectd = 3;
        int intResult = result.random.label;
        Assert.assertEquals(expectd, intResult);
    }

}
