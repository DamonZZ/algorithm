package com.damon.algorithm.skiplist;

public class Node {

    public Integer value;
    public String text;
    public Node up, down, left, right;

    public Node(Integer value) {
        this.value = value;
        this.up = this.down = this.left = this.right = null;
    }

    public Node(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

}
