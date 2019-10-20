package com.damon.algorithm.tree;

public class Node {

    public Node(int value) {
        this.data = value;
    }

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private Node leftChild;

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    private Node rightChild;

    public void display() {
        System.out.println(data);
    }

}
