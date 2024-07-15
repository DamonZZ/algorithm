package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HasCycle_Hot100_141_Test {


    private HasCycle_Hot100_141 hasCycle_hot100_141;

    @Before
    public void before() {
        this.hasCycle_hot100_141 = new HasCycle_Hot100_141();
    }

    @Test
    public void hasCycleTest() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assert.assertEquals(true, this.hasCycle_hot100_141.hasCycle(node1));

    }
}
