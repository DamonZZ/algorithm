package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.Node;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListNodeTest {

    private ListNode listNode;

    @Before
    public void before() {
        this.listNode = new ListNode();
    }

    @After
    public void after() {
        this.listNode = null;
    }

    @Test
    public void findKthFromTailTest() {
        Node testNode = null;
        Node expected = null;

        Node result = this.listNode.findKthFromTail(testNode, 0);
        Assert.assertEquals(expected, result);

        testNode = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        second.setLeftChild(third);
        testNode.setLeftChild(second);

        result = this.listNode.findKthFromTail(testNode, 4);
        Assert.assertEquals(expected, result);

        expected = third;
        result = this.listNode.findKthFromTail(testNode, 1);
        Assert.assertEquals(expected.getData(), result.getData());

    }

    @Test
    public void reverseListTest() {
        Node testNode = null;
        Node expected = null;

        Node result = this.listNode.reverseList(testNode);
        Assert.assertEquals(expected, result);

        testNode = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        second.setLeftChild(third);
        testNode.setLeftChild(second);

        expected = third;
        result = this.listNode.reverseList(testNode);
        Assert.assertEquals(expected.getData(), result.getData());
    }

}
