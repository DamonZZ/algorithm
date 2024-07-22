package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwapPairs_Hot100_24_Test {

    private SwapPairs_Hot100_24 swapPairs_Hot100_24;

    @Before
    public void before() {
        this.swapPairs_Hot100_24 = new SwapPairs_Hot100_24();
    }

    @Test
    public void reverseListTest() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode.next = listNode1;

        ListNode result = this.swapPairs_Hot100_24.swapPairs(listNode);
        Assert.assertEquals(2, result.val);
    }

}
