package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPalindrome_Hot100_234_Test {

    private IsPalindrome_Hot100_234 isPalindrome_hot100_234;

    @Before
    public void before() {
        this.isPalindrome_hot100_234 = new IsPalindrome_Hot100_234();
    }

    @Test
    public void isPalindromeTest() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Assert.assertEquals(true, this.isPalindrome_hot100_234.isPalindrome(node1));

    }

}
