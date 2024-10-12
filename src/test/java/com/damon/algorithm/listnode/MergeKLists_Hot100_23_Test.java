package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeKLists_Hot100_23_Test {

    private MergeKLists_Hot100_23 mergeKLists_hot100_23;

    @Before
    public void before() {
        this.mergeKLists_hot100_23 = new MergeKLists_Hot100_23();
    }

    @Test
    public void mergeKListsTest() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(5);
        listNode11.next = listNode12;
        listNode1.next = listNode11;

        ListNode listNode2 = new ListNode(1);
        ListNode listNode21 = new ListNode(3);
        ListNode listNode22 = new ListNode(4);
        listNode21.next = listNode22;
        listNode2.next = listNode21;

        ListNode listNode3 = new ListNode(2);
        ListNode listNode31 = new ListNode(6);
        listNode3.next = listNode31;

        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = listNode1;
        listNodes[1] = listNode2;
        listNodes[2] = listNode3;

        ListNode result = this.mergeKLists_hot100_23.mergeKLists(listNodes);
        Assert.assertEquals(1, result.val);
    }


}
