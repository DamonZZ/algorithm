package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DetectCycle_Hot100_142_Test {


    private DetectCycle_Hot100_142 detectCycle_hot100_142;

    @Before
    public void before() {
        this.detectCycle_hot100_142 = new DetectCycle_Hot100_142();
    }

    @Test
    public void detectCycleTest() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assert.assertEquals(node2, this.detectCycle_hot100_142.detectCycle(node1));

    }

}
