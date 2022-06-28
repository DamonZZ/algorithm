package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoLists_LeetCode_Hot100_21_Test {

    private MergeTwoLists_LeetCode_Hot100_21 mergeTwoLists;

    @Before
    public void before() {
        this.mergeTwoLists = new MergeTwoLists_LeetCode_Hot100_21();
    }

    @Test
    public void mergeTwoListsTest() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(4);
        listNode11.next = listNode12;
        listNode1.next = listNode11;

        ListNode listNode2 = new ListNode(3);
        ListNode listNode21 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        listNode21.next = listNode22;
        listNode2.next = listNode21;

        ListNode actual = this.mergeTwoLists.mergeTwoLists(listNode1, listNode2);
        int expected = 1;
        Assert.assertEquals(1, actual.val);
    }

}
