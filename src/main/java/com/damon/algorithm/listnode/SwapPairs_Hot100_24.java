package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class SwapPairs_Hot100_24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode one = head;
        ListNode two = one.next;
        ListNode three = two.next;
        two.next = one;
        one.next = swapPairs(three);
        return two;
    }

}
