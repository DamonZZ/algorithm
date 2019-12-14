package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.Node;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

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

    @Test
    public void mergeTest() {
        Node testNode1 = null;
        Node testNode2 = null;
        Node expected = null;

        Node result = this.listNode.merge(testNode1, testNode2);
        Assert.assertEquals(expected, result);

        testNode1 = new Node(1);
        Node testNode1Child1 = new Node(3);
        Node testNode1Child2 = new Node(5);
        testNode1Child1.setLeftChild(testNode1Child2);
        testNode1.setLeftChild(testNode1Child1);

        testNode2 = new Node(2);
        Node testNode2Child1 = new Node(4);
        Node testNode2Child2 = new Node(6);
        testNode2Child1.setLeftChild(testNode2Child2);
        testNode2.setLeftChild(testNode2Child1);

        result = this.listNode.merge(testNode1, testNode2);
        String strResult = "";
        while (result != null) {
            strResult += result.getData();
            result = result.getLeftChild();
        }

        String strExpected = "123456";

        Assert.assertEquals(strExpected, strResult);
    }

    @Test
    public void hasSubTreeTest() {
        Node testNode1 = null;
        Node testNode2 = null;
        boolean expected = false;

        boolean result = this.listNode.hasSubTree(testNode1, testNode2);
        Assert.assertEquals(expected, result);

        testNode1 = new Node(1);
        Node testNode12 = new Node(2);
        Node testNode13 = new Node(3);
        Node testNode14 = new Node(4);
        Node testNode15 = new Node(5);

        testNode12.setLeftChild(testNode14);
        testNode12.setRightChild(testNode15);
        testNode1.setLeftChild(testNode12);
        testNode1.setRightChild(testNode13);

        testNode2 = new Node(2);
        Node testNode24 = new Node(4);
        Node testNode25 = new Node(5);

        testNode2.setLeftChild(testNode24);
        testNode2.setRightChild(testNode25);

        expected = true;
        result = this.listNode.hasSubTree(testNode1, testNode2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void mirrorTest() {
        Node testNode = null;

        this.listNode.mirror(testNode);
        Assert.assertEquals(null, testNode);

        testNode = new Node(1);
        Node testNode12 = new Node(2);
        Node testNode13 = new Node(3);
        Node testNode14 = new Node(4);
        Node testNode15 = new Node(5);

        testNode12.setLeftChild(testNode14);
        testNode12.setRightChild(testNode15);
        testNode.setLeftChild(testNode12);
        testNode.setRightChild(testNode13);

        this.listNode.mirror(testNode);

        String result = this.preOrder(testNode, "");
        String expected = "13254";
        Assert.assertEquals(expected, result);
    }

    private String preOrder(Node current, String result) {
        if (current != null) {
            result = result + current.getData();
            result = preOrder(current.getLeftChild(), result);
            result = preOrder(current.getRightChild(), result);
        }
        return result;
    }

    @Test
    public void printFromTopToBottomTest() {
        Node testNode = null;
        testNode = new Node(1);
        Node testNode12 = new Node(2);
        Node testNode13 = new Node(3);
        Node testNode14 = new Node(4);
        Node testNode15 = new Node(5);
        testNode12.setLeftChild(testNode14);
        testNode12.setRightChild(testNode15);
        testNode.setLeftChild(testNode12);
        testNode.setRightChild(testNode13);

        String strResult = "";
        String expected = "1,2,3,4,5,";
        ArrayList<Integer> result = this.listNode.printFromTopToBottom(testNode);

        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            strResult += iterator.next() + ",";
        }

        Assert.assertEquals(expected, strResult);
    }

}
