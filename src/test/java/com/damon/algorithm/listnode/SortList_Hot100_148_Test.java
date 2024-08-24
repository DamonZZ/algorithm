package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortList_Hot100_148_Test {

    private SortList_Hot100_148 sortList_hot100_148;

    private ListNode testListNode;

    private int[] expectedArray;

    @Before
    public void before() {
        this.sortList_hot100_148 = new SortList_Hot100_148();
        this.testListNode = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        this.testListNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
    }

    @Test
    public void sortListTest() {
        ListNode result = this.sortList_hot100_148.sortList(this.testListNode);
        Assert.assertEquals(4, result.next.next.next.val);

    }

}
