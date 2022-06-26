package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveNthFromEnd_LeetCode_Hot100_19_Test {


    private RemoveNthFromEnd_LeetCode_Hot100_19 removeNthFromEnd;

    @Before
    public void before() {
        this.removeNthFromEnd = new RemoveNthFromEnd_LeetCode_Hot100_19();
    }

    @Test
    public void removeNthFromEndTest() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode.next = listNode1;

        int nthFromEnd = 3;
        int expected = 3;
        ListNode actual = this.removeNthFromEnd.removeNthFromEnd(listNode, nthFromEnd);

        Assert.assertEquals(expected, actual.next.val);

    }


}
