package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class RemoveNthFromEnd_LeetCode_Hot100_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fisrt = head;
        ListNode second = dummy;

        for (int i = 0; i < n; i++) {
            fisrt = fisrt.next;
        }

        while (fisrt != null) {
            fisrt = fisrt.next;
            second = second.next;
        }

        second.next = second.next.next;
        dummy = dummy.next;
        return dummy;
    }

}
