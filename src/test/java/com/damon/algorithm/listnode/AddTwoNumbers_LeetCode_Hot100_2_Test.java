package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbers_LeetCode_Hot100_2_Test {

    private AddTwoNumbers_LeetCode_Hot100_2 addTwoNumbers;

    @Before
    public void before() {
        this.addTwoNumbers = new AddTwoNumbers_LeetCode_Hot100_2();
    }

    @Test
    public void addTwoNumbersTest() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = this.addTwoNumbers.addTwoNumbers(l1, l2);
        printListNode(result);

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        result = this.addTwoNumbers.addTwoNumbers(l1, l2);
        printListNode(result);

        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        result = this.addTwoNumbers.addTwoNumbers(l1, l2);
        printListNode(result);
    }

    public void printListNode(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
            sb.append(",");
        }
        System.out.println("Result:" + sb.substring(0, sb.length() - 1) + "]");
    }


}
