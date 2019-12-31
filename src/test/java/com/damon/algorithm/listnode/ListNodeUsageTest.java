package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import com.damon.algorithm.entity.Node;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListNodeUsageTest {

    private ListNodeUsage listNodeUsage;

    @Before
    public void before() {
        this.listNodeUsage = new ListNodeUsage();
    }

    @After
    public void after() {
        this.listNodeUsage = null;
    }

    @Test
    public void findFirstCommonNodeTest() {
        ListNode nodeTest1 = new ListNode(1);
        ListNode nodeTest2 = new ListNode(4);


        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node6.next = node7;

        ListNode node5 = new ListNode(5);
        nodeTest2.next = node5;
        node5.next = node6;

        nodeTest1.next = node2;
        node2.next = node3;
        node3.next = node6;

        ListNode expected = node6;
        ListNode result = this.listNodeUsage.findFirstCommonNode(nodeTest1, nodeTest2);
        Assert.assertEquals(expected, result);

    }


}
