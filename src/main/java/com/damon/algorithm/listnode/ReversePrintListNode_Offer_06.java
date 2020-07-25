package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

import java.util.Stack;

public class ReversePrintListNode_Offer_06 {

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        int size = stack.size();
        int[] array = new int[stack.size()];
        for (int i = 0; i < size; i++) {
            array[i] = stack.pop().val;
        }
        return array;
    }

}
