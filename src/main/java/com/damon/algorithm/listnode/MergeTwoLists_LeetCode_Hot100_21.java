package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class MergeTwoLists_LeetCode_Hot100_21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(-1);
        ListNode listNode = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                listNode.next = list1;
                list1 = list1.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
            }
            listNode = listNode.next;
        }

        if (list1 != null) listNode.next = list1;
        if (list2 != null) listNode.next = list2;

        return head.next;
    }

}
