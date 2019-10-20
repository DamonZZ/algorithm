package com.damon.algorithm.tree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class BinaryTreeImplTest {

    private BinaryTreeImpl binaryTree = new BinaryTreeImpl(10);

    private String preOrderTestResult = "10 8 5 4 7 9 12 11 18 15 22 21 ";
    private String infixOrderTestResult = "4 5 7 8 9 10 11 12 15 18 21 22 ";
    private String postOrderTestResult = "4 7 5 9 8 11 15 21 22 18 12 10 ";

    @Before
    public void setUp() {
        this.binaryTree.insert(8);
        this.binaryTree.insert(5);
        this.binaryTree.insert(4);
        this.binaryTree.insert(7);
        this.binaryTree.insert(9);
        this.binaryTree.insert(12);
        this.binaryTree.insert(11);
        this.binaryTree.insert(18);
        this.binaryTree.insert(15);
        this.binaryTree.insert(22);
        this.binaryTree.insert(21);
    }

    @After
    public void tearDown() {
        this.binaryTree = null;
    }

    @Test
    public void preOrder() {
        String result = this.binaryTree.preOrder();
        System.out.println("preOrder result:" + result);
        Assert.assertEquals(this.preOrderTestResult, result);
    }

    @Test
    public void infixOrder() {
        String result = this.binaryTree.infixOrder();
        System.out.println("infixOrder result:" + result);
        Assert.assertEquals(this.infixOrderTestResult, result);
    }

    @Test
    public void postOrder() {
        String result = this.binaryTree.postOrder();
        System.out.println("postOrder result:" + result);
        Assert.assertEquals(this.postOrderTestResult, result);
    }

    @Test
    public void find() {
        Node result = this.binaryTree.find(18);
        Assert.assertNotNull(result);

        result = this.binaryTree.find(20);
        Assert.assertNull(result);
    }

    @Test
    public void insert() {
        boolean result = this.binaryTree.insert(16);
        Assert.assertTrue(result);

        result = this.binaryTree.insert(16);
        Assert.assertFalse(result);
    }

    @Test
    public void delete() {

        //1. delete node don't exist
        boolean result = this.binaryTree.delete(20);
        Assert.assertFalse(result);

        //2. delete node have no child
        result = this.binaryTree.delete(4);
        Assert.assertTrue(result);

        //3. delete node only have left child
        result = this.binaryTree.delete(22);
        Assert.assertTrue(result);

        //4. delete node only have right child
        result = this.binaryTree.delete(15);
        Assert.assertTrue(result);

        //5. delete node have two children
        result = this.binaryTree.delete(8);
        Assert.assertTrue(result);

        result = this.binaryTree.delete(12);
        Assert.assertTrue(result);

        //6. delete root node
        result = this.binaryTree.delete(10);
        Assert.assertTrue(result);

        System.out.println("After delete:" + this.binaryTree.preOrder());

    }

}
